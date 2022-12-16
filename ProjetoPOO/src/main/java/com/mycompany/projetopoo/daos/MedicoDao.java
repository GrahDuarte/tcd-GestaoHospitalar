/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.daos;

import com.mycompany.projetopoo.pessoas.Medico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Suellen, Lorena, Emerson;
 */
public class MedicoDao extends Dao<Medico> {

    public static final String TABLE = "medico";

    @Override
    public String getSaveStatment() {
        return "insert into " + TABLE
                + " (crm, especialidade, nome, cpf, dataNascimento, telefone, email)"
                + " values (?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE
                + " set crm = ?, especialidade = ?, nome = ?, cpf = ?, dataNascimento = ?, telefone = ?, email = ?"
                + " where id = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Medico e) {
        try {
            pstmt.setString(1, e.getCrm());
            pstmt.setString(2, e.getEspecialidade());
            pstmt.setString(3, e.getNome());
            pstmt.setString(4, e.getCpf());
//            pstmt.setString(4, e.getDataNascimento()); // converter LocalDate para String ???
            pstmt.setString(6, e.getTelefone());
            pstmt.setString(7, e.getEmail());

            if (e.getId() != null && e.getId() > 0) {
                pstmt.setLong(8, e.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
        return "select id, crm, especialidade, nome, cpf, dataNascimento, telefone, email"
                + " from " + TABLE
                + " where id = ?";
    }

    @Override
    public String getFindAllStatment() {
        return "select id, crm, especialidade, nome, cpf, dataNascimento, telefone, email"
                + " from " + TABLE;
    }

    /**
     * SQL statement to use to find movies by genre
     *
     * @return SQL statement
     */
    
    private String getfindAllByPartialNameStatment() {
        return " select id, crm, especialidade, nome, cpf, dataNascimento, telefone, email"
                + " from " + TABLE
                + " where nome like ?";
    }
    
    public List<Medico> findAllByPartialName(String partialName) {

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
    public Medico extractObject(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                return new Medico (
                        resultSet.getLong("id"),
                        resultSet.getString("crm"),
                        resultSet.getString("especialidade"),
                        resultSet.getString("nome"),
                        resultSet.getString("cpf"),
//                        resultSet.getDate("dataNascimento"), //converter LocalDate para String ??
                        resultSet.getString("telefone"),
                        resultSet.getString("email")
                );
            } catch (SQLException ex) {
                Logger.getLogger(MedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }

}