/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.pessoas;

import com.mycompany.projetopoo.dados.Endereco;
import com.mycompany.projetopoo.dados.Pessoa;

/**
 *
 * @author suKarolainy
 */
public class Paciente extends Pessoa{

    public Paciente() {
    }
    
    public Paciente(String nome, String cpf, String dataNascimento, String telefone, Endereco endereco, Long id) {
        super(nome, cpf, dataNascimento, telefone, endereco, id);
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
