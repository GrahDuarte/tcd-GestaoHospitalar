/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.Dados;

/**
 *
 * @author suKarolainy
 */
public class Contato {
    private Long telefone;
    private String email;

    public Contato() {
    }

    public Contato(Long telefone, String email) {
        this.telefone = telefone;
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return "Contato{"
            + "telefone=" + telefone
            + ",email=" + email
            + '}';
    }
    
}
