/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.Pessoas;

import com.mycompany.projetopoo.Dados.Endereco;
import com.mycompany.projetopoo.Dados.Pessoa;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author suKarolainy
 */
public class Paciente extends Pessoa {

    private String profissao;
    private String tipoSanguineo;
    private List<String> alergias;
    private List<String> doencasCronicas;
    private List<String> medicamentosControlados;
    private boolean estado;

    public void getDataNascimento(String text) {
        this.setDataNascimento(LocalDate.MIN.now());
    }
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Paciente() {
    }

    public Paciente(Long id, String nome, String cpf) {
        super(id, nome, cpf);
    }
    
    

    public Paciente(String profissao, String tipoSanguineo, List<String> alergias, List<String> doencasCronicas, List<String> medicamentosControlados, boolean estado) {
        this.profissao = profissao;
        this.tipoSanguineo = tipoSanguineo;
        this.alergias = alergias;
        this.doencasCronicas = doencasCronicas;
        this.medicamentosControlados = medicamentosControlados;
        this.estado = estado;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTipoSanguineo(String text) {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }

    public List<String> getDoencasCronicas() {
        return doencasCronicas;
    }

    public void setDoencasCronicas(List<String> doencasCronicas) {
        this.doencasCronicas = doencasCronicas;
    }

    public List<String> getMedicamentosControlados() {
        return medicamentosControlados;
    }

    public void setMedicamentosControlados(List<String> medicamentosControlados) {
        this.medicamentosControlados = medicamentosControlados;
    }    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Paciente{" 
                + "profissao=" + profissao 
                + ", tipoSanguineo=" + tipoSanguineo 
                + ", alergias=" + alergias 
                + ", doencasCronicas=" + doencasCronicas 
                + ", medicamentosControlados=" + medicamentosControlados 
                + ", estado=" + estado 
                + '}';
    }  
    
}
