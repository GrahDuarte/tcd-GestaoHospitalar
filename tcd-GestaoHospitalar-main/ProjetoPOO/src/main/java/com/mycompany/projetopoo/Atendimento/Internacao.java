/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.Atendimento;

import com.mycompany.projetopoo.Pessoas.Medico;
import java.time.LocalDateTime;

/**
 *
 * @author loren
 */
public class Internacao {
    private LocalDateTime entrada;
    private LocalDateTime alta;
    private Medico medicoResponsavel;
    private Exame examesRealizados;

    public Internacao() {
    }

    public Internacao(LocalDateTime entrada, LocalDateTime alta, Medico medicoResponsavel, Exame examesRealizados) {
        this.entrada = entrada;
        this.alta = alta;
        this.medicoResponsavel = medicoResponsavel;
        this.examesRealizados = examesRealizados;
    }

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

    public Exame getExamesRealizados() {
        return examesRealizados;
    }

    public void setExamesRealizados(Exame examesRealizados) {
        this.examesRealizados = examesRealizados;
    }

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
