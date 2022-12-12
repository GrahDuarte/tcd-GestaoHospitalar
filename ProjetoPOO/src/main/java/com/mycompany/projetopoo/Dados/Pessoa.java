package com.mycompany.projetopoo.Dados;
import com.mycompany.projetopoo.Pessoas.Entity;

import java.time.LocalDate;

/**
 *
 * @author suKarolainy
 */
public class Pessoa extends Entity {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;
    public Endereco endereco;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Pessoa() {
    }

    public Pessoa(Long id, String nome, String cpf) {
        super(id);
        this.nome = nome;
        this.cpf = cpf;
    }

    
    public Pessoa(String nome, String cpf, LocalDate dataNascimento, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    } 
    //</editor-fold> 
    
}
