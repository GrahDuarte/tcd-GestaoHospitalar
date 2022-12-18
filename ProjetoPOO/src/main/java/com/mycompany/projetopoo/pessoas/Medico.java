/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.pessoas;

import com.mycompany.projetopoo.dados.Endereco;
import com.mycompany.projetopoo.dados.Pessoa;

/**
 *
 * @author suKarolainy
 */
public class Medico extends Pessoa{
    private String crm;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Medico() {
    }

    public Medico(String crm) {
        this.crm = crm;
    }
    
    public Medico(String crm, String nome, String cpf, String dataNascimento, String telefone, Endereco endereco, Long id) {
        super(nome, cpf, dataNascimento, telefone, endereco, id);
    }
    //</editor-fold>  
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    //</editor-fold>
    
    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "Medico{" 
                + "crm=" + crm 
                + '}';
    }
}
