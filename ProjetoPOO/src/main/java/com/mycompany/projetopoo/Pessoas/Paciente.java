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
public class Paciente extends Pessoa {


    public void getDataNascimento(String text) {
        this.setDataNascimento(LocalDate.MIN.now());
    }
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Paciente() {
    }

    public Paciente(Long id, String nome, String cpf, LocalDate dataNascimento, String telefone, String email, Endereco endereco) {
        super(id, nome, cpf, dataNascimento, telefone, email, endereco);
    }
    //</editor-fold>
}
