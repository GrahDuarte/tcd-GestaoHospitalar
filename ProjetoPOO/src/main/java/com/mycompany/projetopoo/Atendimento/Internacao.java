/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.Atendimento;

import com.mycompany.projetopoo.Pessoas.Medico;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author loren
 */
public class Internacao {
    private LocalDateTime entrada;
    private LocalDateTime alta;
    private Medico medicoResponsavel;
    private List<Exame> examesRealizados;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Internacao() {
    }

    public Internacao(LocalDateTime entrada, LocalDateTime alta, Medico medicoResponsavel, List<Exame> examesRealizados) {
        this.entrada = entrada;
        this.alta = alta;
        this.medicoResponsavel = medicoResponsavel;
        this.examesRealizados = examesRealizados;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getAlta() {
        return alta;
    }

    public void setAlta(LocalDateTime alta) {
        this.alta = alta;
    }

    public Medico getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(Medico medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public List<Exame> getExamesRealizados() {
        return examesRealizados;
    }

    public void setExamesRealizados(List<Exame> examesRealizados) {
        this.examesRealizados = examesRealizados;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Internacao{" 
                + "entrada=" + entrada 
                + ", alta=" + alta 
                + ", medicoResponsavel=" + medicoResponsavel 
                + ", examesRealizados=" + examesRealizados 
                + '}';
    }
    
    
}
