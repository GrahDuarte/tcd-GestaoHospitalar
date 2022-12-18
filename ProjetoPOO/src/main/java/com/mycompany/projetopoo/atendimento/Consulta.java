/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.atendimento;

import com.mycompany.projetopoo.pessoas.Medico;

/**
 *
 * @author suKarolainy
 */
public class Consulta{
    private Long idAtendimento;
    private Medico medicoResponsavel;
    private String relatorio;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Consulta() {
    }

    public Consulta(Long idAtendimento, Medico medicoResponsavel, String relatorio) {
        this.idAtendimento = idAtendimento;
        this.medicoResponsavel = medicoResponsavel;
        this.relatorio = relatorio;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(Long idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public Medico getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(Medico medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Consulta{" 
                + "idAtendimento=" + idAtendimento 
                + ", medicoResponsavel=" + medicoResponsavel 
                + ", relatorio=" + relatorio 
                + '}';
    }
}
