/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.DAOs;

import com.mycompany.projetopoo.Pessoas.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe PacienteDao
 *
 * CREATE TABLE `paciente` (
 * `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
 * `nome` varchar(45) NOT NULL,
 * `cpf` varchar(11) NOT NULL,
 * PRIMARY KEY (`id`),
 * UNIQUE KEY `id` (`id`)
 *) ENGINE=InnoDB DEFAULT CHARSET=latin1 
 *
 * @author Suellen, Lorena, Emerson;
 * @version 0.1, 2022-12-14
 */
public class PacienteDao
        extends Dao<Paciente> {

    public static final String TABLE = "paciente";

    @Override
    public String getSaveStatment() {
        return "insert into " + TABLE
                + " (nome, cpf)"
                + " values (?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE
                + " set nome = ?, cpf = ?"
                + " where id = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Paciente e) {
        try {
            pstmt.setString(1, e.getNome());
            pstmt.setString(2, e.getCpf());

            if (e.getId() != null && e.getId() > 0) {
                pstmt.setLong(3, e.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
        return "select id, nome, cpf"
                + " from " + TABLE
                + " where id = ?";
    }

    @Override
    public String getFindAllStatment() {
        return "select id, nome, cpf"
                + " from " + TABLE;
    }

    /**
     * SQL statement to use to find movies by genre
     *
     * @return SQL statement
     */
    
    private String getfindAllByPartialNameStatment() {
        return " select id, nome, cpf"
                + " from " + TABLE
                + " where nome like ?";
    }
    
    public List<Paciente> findAllByPartialName(String partialName) {

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
    public Paciente extractObject(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                return new Paciente (
                        resultSet.getLong("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("cpf")
                );
            } catch (SQLException ex) {
                Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }

    
}
