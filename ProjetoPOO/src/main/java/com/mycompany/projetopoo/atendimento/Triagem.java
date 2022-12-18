/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.atendimento;

import com.mycompany.projetopoo.pessoas.Enfermeiro;
import com.mycompany.projetopoo.pessoas.Entity;

/**
 *
 * @author suKarolainy
 */
public class Triagem{
    private Enfermeiro enfermeiroTriador;
    private Integer idAtendimento; 
    private String tipoSanguineo;
    private String alergias;
    private String doencasCronicas;
    private String medicamentosControlados;
    private String motivoAtendimento;
    private String prioridadeAtendimento;
    public Triagem() {
    }

    public Triagem(Enfermeiro enfermeiroTriador, Integer idAtendimento, String tipoSanguineo, String alergias, String doencasCronicas, String medicamentosControlados, String motivoAtendimento, String prioridadeAtendimento) {
        this.enfermeiroTriador = enfermeiroTriador;
        this.idAtendimento = idAtendimento;
        this.tipoSanguineo = tipoSanguineo;
        this.alergias = alergias;
        this.doencasCronicas = doencasCronicas;
        this.medicamentosControlados = medicamentosControlados;
        this.motivoAtendimento = motivoAtendimento;
        this.prioridadeAtendimento = prioridadeAtendimento;
    }

    public Enfermeiro getEnfermeiroTriador() {
        return enfermeiroTriador;
    }

    public void setEnfermeiroTriador(Enfermeiro enfermeiroTriador) {
        this.enfermeiroTriador = enfermeiroTriador;
    }

    public Integer getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(Integer idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getDoencasCronicas() {
        return doencasCronicas;
    }

    public void setDoencasCronicas(String doencasCronicas) {
        this.doencasCronicas = doencasCronicas;
    }

    public String getMedicamentosControlados() {
        return medicamentosControlados;
    }

    public void setMedicamentosControlados(String medicamentosControlados) {
        this.medicamentosControlados = medicamentosControlados;
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

    @Override
    public String toString() {
        return "Triagem{" 
                + "enfermeiroTriador=" + enfermeiroTriador 
                + ", idAtendimento=" + idAtendimento 
                + ", tipoSanguineo=" + tipoSanguineo 
                + ", alergias=" + alergias 
                + ", doencasCronicas=" + doencasCronicas 
                + ", medicamentosControlados=" + medicamentosControlados 
                + ", motivoAtendimento=" + motivoAtendimento 
                + ", prioridadeAtendimento=" + prioridadeAtendimento 
                + '}';
    }

    
}
