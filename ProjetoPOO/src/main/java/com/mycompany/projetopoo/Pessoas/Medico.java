/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.Pessoas;

import com.mycompany.projetopoo.Dados.Pessoa;

/**
 *
 * @author loren
 */
public class Medico extends Pessoa{
    private String crm;
    private String especialidade;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Medico() {
    }

    public Medico(String crm, String especialidade) {
        this.crm = crm;
        this.especialidade = especialidade;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    //</editor-fold>
    
    @Override
    public String toString() {
        return "Medico{" 
                + "crm=" + crm 
                + ", especialidade=" + especialidade 
                + '}';
    }
    
}
