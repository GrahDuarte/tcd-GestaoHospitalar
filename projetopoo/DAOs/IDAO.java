/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.DAOs;
import com.mycompany.projetopoo.Pessoas.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
/**
 *
 * @author suKarolainy
 */
public interface IDAO {

    public String getSaveStatment();
    
    public String getUpdateStatment();
    
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Paciente e);

    public String getFindByIdStatment();

    public Paciente findById(Long id);

    public String getFindAllStatment();

    public List<Paciente> findAll();

    public String getMoveToTrashStatement();
    public void moveToTrash(Paciente e);

    public String getRestoreFromTrashStatement();
    public void restoreFromTrash(Long id);
   

    public List<Paciente> extractObjects(ResultSet resultSet);

}
