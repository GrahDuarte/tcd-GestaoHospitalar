/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.Atendimento;

import com.mycompany.projetopoo.Pessoas.Paciente;
import java.time.LocalDateTime;

/**
 *
 * @author loren
 */
public class Atendimento {
    private LocalDateTime horarioAtendimento;
    private Triagem triagem;
    private Consulta consulta;
    private Paciente paciente;

    public Atendimento() {
    }

    public Atendimento(LocalDateTime horarioAtendimento, Triagem triagem, Consulta consulta, Paciente paciente) {
        this.horarioAtendimento = horarioAtendimento;
        this.triagem = triagem;
        this.consulta = consulta;
        this.paciente = paciente;
    }

    public LocalDateTime getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(LocalDateTime horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    public Triagem getTriagem() {
        return triagem;
    }

    public void setTriagem(Triagem triagem) {
        this.triagem = triagem;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Atendimento{" 
                + "horarioAtendimento=" + horarioAtendimento 
                + ", triagem=" + triagem 
                + ", consulta=" + consulta 
                + ", paciente=" + paciente 
                + '}';
    }
    
    
}