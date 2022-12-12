/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.Atendimento;

import com.mycompany.projetopoo.Pessoas.Enfermeiro;

/**
 *
 * @author suKarolainy
 */
public class Triagem {
    private Enfermeiro enfermeiroTriador;
    private String motivoAtendimento;
    private String prioridadeAtendimento;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Triagem() {
    }

    public Triagem(Enfermeiro enfermeiroTriador, String motivoAtendimento, String prioridadeAtendimento) {
        this.enfermeiroTriador = enfermeiroTriador;
        this.motivoAtendimento = motivoAtendimento;
        this.prioridadeAtendimento = prioridadeAtendimento;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Enfermeiro getEnfermeiroTriador() {
        return enfermeiroTriador;
    }

    public void setEnfermeiroTriador(Enfermeiro enfermeiroTriador) {
        this.enfermeiroTriador = enfermeiroTriador;
    }

    public String getMotivoAtendimento() {
        return motivoAtendimento;
    }

    public void setMotivoAtendimento(String motivoAtendimento) {
        this.motivoAtendimento = motivoAtendimento;
    }

    public String getPrioridadeAtendimento() {
        return prioridadeAtendimento;
    }

    public void setPrioridadeAtendimento(String prioridadeAtendimento) {
        this.prioridadeAtendimento = prioridadeAtendimento;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Triagem{" 
                + "enfermeiroTriador=" + enfermeiroTriador 
                + ", motivoAtendimento=" + motivoAtendimento 
                + ", prioridadeAtendimento=" + prioridadeAtendimento
                + '}';
    }
}
