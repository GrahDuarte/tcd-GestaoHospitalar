/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.Pessoas;

import com.mycompany.projetopoo.Dados.Endereco;
import com.mycompany.projetopoo.Dados.Pessoa;
import java.time.LocalDate;

/**
 *
 * @author loren
 */
public class Medico extends Pessoa{
    private String crm;
    private String especialidade;

    public Medico() {
    }

    public Medico(Long id, String nome, String cpf, LocalDate dataNascimento, String telefone, String email, Endereco endereço) {
        super(id, nome, cpf, dataNascimento, telefone, email, endereço);
    }

    public Medico(String crm, String especialidade) {
        this.crm = crm;
        this.especialidade = especialidade;
    }

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

    @Override
    public String toString() {
        return "Medico{" 
                + "crm=" + crm 
                + ", especialidade=" + especialidade 
                + '}';
    }
    
}
