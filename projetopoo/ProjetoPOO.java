/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projetopoo;

import com.mycompany.projetopoo.Dados.Contato;
import com.mycompany.projetopoo.Dados.Endereço;
import com.mycompany.projetopoo.Dados.Pessoa;
import com.mycompany.projetopoo.Pessoas.Paciente;
import java.lang.Long;

/**
 *
 * @author suKarolainy
 */
public class ProjetoPOO {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Endereço endereço = new Endereço();
        Contato contato = new Contato();
        Paciente paciente = new Paciente();
        
        contato.setEmail("Ana@gmail.com");
        //pessoa.setNome("Ana Maria");
        paciente.setPessoaPaciente("Ana");
        paciente.setId(Integer.SIZE);
        
        //paciente.getPessoaPaciente(pessoa.getNome());
        //System.out.println("Nome do paciente: " +pessoa.getNome() + "\nEmail do paciente: "+contato.getEmail());
        System.out.println("Nome do paciente: " +paciente.getNome()+ "\nId do paciente: " +paciente.getId());
               
        //System.out.println("Nome do paciente: " + paciente.getPessoa());
    }
}
