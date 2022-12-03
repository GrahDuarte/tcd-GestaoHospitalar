/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.Pessoas;
/**
 *
 * @author suKarolainy
 */
public class Paciente {
    private String cpf;
    private Integer id;
    private String nome;

    public Paciente() {
    }

    public Paciente(Integer id, String cpf, String nome ) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setPessoaPaciente(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return  " id=" + id + ", cpf=" + cpf + ", nome=" + nome;
    }
}
