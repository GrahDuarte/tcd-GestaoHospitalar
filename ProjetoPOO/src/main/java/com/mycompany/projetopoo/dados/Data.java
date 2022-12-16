/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.dados;

import com.mycompany.projetopoo.pessoas.Entity;

/**
 *
 * @author loren
 */
public class Data extends Entity{
    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Data() {
    }

    public Data(Integer dia, Integer mes, Integer ano, Long id) {
        super(id);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
    
    
}
