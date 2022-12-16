/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.daos;

import com.mycompany.projetopoo.atendimento.Consulta;
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
public class ConsultaDao extends Dao<Consulta> {
    public static final String TABLE = "consulta";

    @Override
    public String getSaveStatment() {
        return "insert into " + TABLE
                + " (entrada, alta, medicoResponsavel, examesRealizados)"
                + " values (?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE
                + " set entrada =?, alta = ?, medicoResponsavel = ?, examesRealizados = ?"
                + " where id = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Consulta e) {
        try {
            pstmt.setDate(1, e.getEntrada());
            pstmt.setDate(2, e.getAlta()));
            pstmt.setLong(3, e.getMedicoResponsavel().getId());
            pstmt.setString(4, e.getExamesRealizados());

            if (e.getId() != null && e.getId() > 0) {
                pstmt.setLong(5, e.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
        return "select entrada, alta, medicoResponsavel, examesRealizados"
                + " from " + TABLE
                + " where id = ?";
    }

    @Override
    public String getFindAllStatment() {
        return "select entrada, alta, medicoResponsavel, examesRealizados"
                + " from " + TABLE;
    }

    /**
     * SQL statement to use to find movies by genre
     *
     * @return SQL statement
     */
    
    private String getfindAllByPartialNameStatment() {
        return " select entrada, alta, medicoResponsavel, examesRealizados"
                + " from " + TABLE
                + " where nome like ?";
    }
    
    public List<Consulta> findAllByPartialName(String partialName) {

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
    public Consulta extractObject(ResultSet resultSet) {
        Consulta objeto = new Consulta();
        if (resultSet != null) {
            try {
                objeto.setId(resultSet.getLong("id"));
                objeto.setEntrada(resultSet.getDate("entrada"));
                objeto.setAlta(resultSet.getDate("alta"));
                objeto.setMedicoResponsavel((new MedicoDao().findById(resultSet.getLong("medicoResponsavel"))));
                objeto.setExamesRealizados(resultSet.getString("examesRealizados"));
                
            } catch (SQLException ex) {
                Logger.getLogger(ConsultaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }

}

