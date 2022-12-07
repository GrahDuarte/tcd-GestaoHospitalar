/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.Atendimento;

import com.mycompany.projetopoo.Pessoas.Medico;

/**
 *
 * @author loren
 */
public class Consulta {
    private Medico medicoConsultado;
    private String examesRealizados;
    private Internacao internacao;

    public Consulta() {
    }

    public Consulta(Medico medicoConsultado, String examesRealizados, Internacao internacao) {
        this.medicoConsultado = medicoConsultado;
        this.examesRealizados = examesRealizados;
        this.internacao = internacao;
    }

    public Medico getMedicoConsultado() {
        return medicoConsultado;
    }

    public void setMedicoConsultado(Medico medicoConsultado) {
        this.medicoConsultado = medicoConsultado;
    }

    public String getExamesRealizados() {
        return examesRealizados;
    }

    public void setExamesRealizados(String examesRealizados) {
        this.examesRealizados = examesRealizados;
    }

    public Internacao getInternacao() {
        return internacao;
    }

    public void setInternacao(Internacao internacao) {
        this.internacao = internacao;
    }

    @Override
    public String toString() {
        return "Consulta{" 
                + "medicoConsultado=" + medicoConsultado 
                + ", examesRealizados=" + examesRealizados 
                + ", internacao=" + internacao 
                + '}';
    }
    
    
}