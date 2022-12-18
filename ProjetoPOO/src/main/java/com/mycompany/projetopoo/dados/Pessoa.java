/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.dados;

import com.mycompany.projetopoo.pessoas.Entity;

/**
 *
 * @author suKarolainy
 */
public class Pessoa extends Entity{
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String telefone;
    public Endereco endereco;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String dataNascimento, String telefone, Endereco endereco, Long id) {
        super(id);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString(){
        return "Pessoa{"
                + ",nome=" + nome
                + ",cpf=" + cpf
                + ",dataNascimento=" + dataNascimento
                + ",telefone=" + telefone
                + ",endereco=" + endereco
                + '}';
    }
}
