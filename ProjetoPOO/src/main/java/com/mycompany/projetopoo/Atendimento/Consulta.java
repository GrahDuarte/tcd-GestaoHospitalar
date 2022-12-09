/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.Atendimento;

import com.mycompany.projetopoo.Pessoas.Medico;
import java.util.List;

/**
 *
 * @author loren
 */
public class Consulta {
    private Medico medicoConsultado;
    private List<Exame> examesRealizados;
    private Internacao internacao;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Consulta() {
    }

    public Consulta(Medico medicoConsultado, List<Exame> examesRealizados, Internacao internacao) {
        this.medicoConsultado = medicoConsultado;
        this.examesRealizados = examesRealizados;
        this.internacao = internacao;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Medico getMedicoConsultado() {
        return medicoConsultado;
    }

    public void setMedicoConsultado(Medico medicoConsultado) {
        this.medicoConsultado = medicoConsultado;
    }

    public List<Exame> getExamesRealizados() {
        return examesRealizados;
    }

    public void setExamesRealizados(List<Exame> examesRealizados) {
        this.examesRealizados = examesRealizados;
    }

    public Internacao getInternacao() {
        return internacao;
    }

    public void setInternacao(Internacao internacao) {
        this.internacao = internacao;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Consulta{" 
                + "medicoConsultado=" + medicoConsultado 
                + ", examesRealizados=" + examesRealizados 
                + ", internacao=" + internacao 
                + '}';
    }  
}