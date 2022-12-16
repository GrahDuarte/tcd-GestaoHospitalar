/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.daos;

import com.mycompany.projetopoo.dados.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suKarolainy
 */
public class DataDao extends Dao<Data> {
    public static final String TABLE = "data";

    @Override
    public String getSaveStatment() {
        return "insert into " + TABLE
                + " (dia, mes, ano)"
                + " values (?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE
                + " set dia = ?, mes = ?, ano = ?"
                + " where id = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Data e) {
        try {
            pstmt.setInt(1, e.getDia());
            pstmt.setInt(2, e.getMes());
            pstmt.setInt(3, e.getAno());

            if (e.getId() != null && e.getId() > 0) {
                pstmt.setLong(4, e.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
        return "select dia, mes, ano"
                + " from " + TABLE
                + " where id = ?";
    }

    @Override
    public String getFindAllStatment() {
        return "select dia, mes, ano"
                + " from " + TABLE;
    }

    /**
     * SQL statement to use to find movies by genre
     *
     * @return SQL statement
     */
    
    private String getfindAllByPartialNameStatment() {
        return " select dia, mes, ano"
                + " from " + TABLE
                + " where nome like ?";
    }
    
    public List<Data> findAllByPartialName(String partialName) {

        try ( PreparedStatement preparedStatement
                = DbConnection.getConnection().prepareStatement(
                        getfindAllByPartialNameStatment())) {

            preparedStatement.setString(1, "%" + partialName + "%");

            // Show the full sentence
            System.out.println(">> SQL: " + preparedStatement);

            // Performs the query on the database
            ResultSet resultSet = preparedStatement.executeQuery();

            // Returns the respective object
            return extractObjects(resultSet);

        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }

        return null;
    }

    @Override
    public String getMoveToTrashStatement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getRestoreFromTrashStatement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getFindAllOnTrashStatement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Extracts the movie from the result set with the associated genre
     *
     * @param resultSet The record in the database
     * @return The movie located
     */
    @Override
    public Data extractObject(ResultSet resultSet) {
        Data objeto = new Data();
        if (resultSet != null) {
            try {
                objeto.setId(resultSet.getLong("id"));
                objeto.setDia(resultSet.getInt("dia"));
                objeto.setMes(resultSet.getInt("mes"));
                objeto.setAno(resultSet.getInt("ano"));
//                return new Data (
//                                                resultSet.getString("tipoSanguineo"),
//                        resultSet.getString("alergias"),
//                        resultSet.getString("doencasCronicas"),
//                        resultSet.getString("medicamentosControlados"),
//                        resultSet.getString("motivoAtendimento"),
//                        resultSet.getString("prioridadeAtendimento"));
            } catch (SQLException ex) {
                Logger.getLogger(DataDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }

}

