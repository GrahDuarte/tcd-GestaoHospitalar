/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.DAOs;

import com.mycompany.projetopoo.Pessoas.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suKarolainy
 */
public class PacienteDao extends Dao {
    public static final String TABLE = "dadosPacientes";

    public String getSaveStatment() {
        return "insert into " + TABLE + "(id, cpf, nome)  values (?, ?, ?)";
    }

    public String getUpdateStatment() {
        return "update " + TABLE + " set id = ?, cpf = ?, nome = ? ";
    }

    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Paciente e) {
        try {

            if (e.getId() != null) {
                pstmt.setLong(4, e.getId());
            }

        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getFindByIdStatment() {
        return "select id, cpf, nome"
                + " from tarefa where id = ?";
    }

    public String getFindAllStatment() {
        return "select id, cpf, nome"
                + " from dadosPacientes";
    }

    public String getMoveToTrashStatement() {
        return "update " + TABLE + " set excluido = true"
                + " where id = ?";
    }

    public String getRestoreFromTrashStatement() {
        return "update " + TABLE + " set excluido = false"
                + " where id = ?";
    }


    public Paciente extractObject(ResultSet resultSet) {

        Paciente paciente = null;

        try {
            paciente = new Paciente();
            paciente.setId(resultSet.getInt("id"));
            paciente.setCpf(resultSet.getString("Cpf"));
            paciente.setPessoaPaciente(resultSet.getString("nome"));
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return paciente;
    }

}
