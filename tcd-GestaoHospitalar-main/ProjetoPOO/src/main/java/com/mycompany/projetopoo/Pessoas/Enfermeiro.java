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
 * @author suKarolainy
 */
public class Enfermeiro extends Pessoa{
    private String coren;

    public Enfermeiro() {
    }

    public Enfermeiro(Long id, String nome, String cpf, LocalDate dataNascimento, String telefone, String email, Endereco endereço) {
        super(id, nome, cpf, dataNascimento, telefone, email, endereço);
    }

    

    public Enfermeiro(String coren) {
        this.coren = coren;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }    

    @Override
    public String toString() {
        return "Enfermeiro{" 
                + "coren=" + coren 
                + '}';
    }
}
