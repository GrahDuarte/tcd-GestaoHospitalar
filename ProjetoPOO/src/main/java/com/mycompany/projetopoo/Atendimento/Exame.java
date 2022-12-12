/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.Atendimento;

import com.mycompany.projetopoo.Pessoas.Medico;

/**
 *
 * @author loren
 */
public class Exame {
    private Medico medicoEspecialista;
    private String tipoExame;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Exame() {
    }

    public Exame(Medico medicoEspecialista, String tipoExame) {
        this.medicoEspecialista = medicoEspecialista;
        this.tipoExame = tipoExame;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Medico getMedicoEspecialista() {
        return medicoEspecialista;
    }

    public void setMedicoEspecialista(Medico medicoEspecialista) {
        this.medicoEspecialista = medicoEspecialista;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }
    //</editor-fold>
    
    @Override
    public String toString() {
        return "Exame{" 
                + "medicoEspecialista=" + medicoEspecialista 
                + ", tipoExame=" + tipoExame 
                + '}';
    }
}
