/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.Dados;

/**
 *
 * @author suKarolainy
 */
public class Pessoa{
    private String nome;
    private Contato contato;
    private Endereço endereço;

    public Pessoa() {
    }

    public Pessoa(String nome, Contato contato, Endereço endereço) {
        this.nome = nome;
        this.contato = contato;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
    
}
