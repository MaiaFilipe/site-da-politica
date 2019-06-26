/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.site_da_politica;


import java.io.Serializable;
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compartilhar")
public class Compartilhar implements Serializable {

    @Id
    @Column(name = "cd_compartilha")
    private Integer codigoCompartilhar;
    
    @Id
    @Column(name = "cd_usuario_comum")
    private Integer codigoUsuarioComum;
    
    @Id
    @Column(name = "cd_usuario_adm")
    private Integer codigoUsuarioAdm;
    
    @Id
    @Column(name = "cd_usuario_politica")
    private Integer codigoUsuarioPolitico;
    
    @Id
    @Column(name = "tm_horario")
    private Time tempo;
    
    /**
     * @return the codigoCompartilhar
     */
    public Integer getCodigoCompartilhar() {
        return codigoCompartilhar;
    }

    /**
     * @param codigoCompartilhar the codigoCompartilhar to set
     */
    public void setCodigoCompartilhar(Integer codigoCompartilhar) {
        this.codigoCompartilhar = codigoCompartilhar;
    }

    /**
     * @return the codigoUsuarioComum
     */
    public Integer getCodigoUsuarioComum() {
        return codigoUsuarioComum;
    }

    /**
     * @param codigoUsuarioComum the codigoUsuarioComum to set
     */
    public void setCodigoUsuarioComum(Integer codigoUsuarioComum) {
        this.codigoUsuarioComum = codigoUsuarioComum;
    }

    /**
     * @return the codigoUsuarioAdm
     */
    public Integer getCodigoUsuarioAdm() {
        return codigoUsuarioAdm;
    }

    /**
     * @param codigoUsuarioAdm the codigoUsuarioAdm to set
     */
    public void setCodigoUsuarioAdm(Integer codigoUsuarioAdm) {
        this.codigoUsuarioAdm = codigoUsuarioAdm;
    }

    /**
     * @return the codigoUsuarioPolitico
     */
    public Integer getCodigoUsuarioPolitico() {
        return codigoUsuarioPolitico;
    }

    /**
     * @param codigoUsuarioPolitico the codigoUsuarioPolitico to set
     */
    public void setCodigoUsuarioPolitico(Integer codigoUsuarioPolitico) {
        this.codigoUsuarioPolitico = codigoUsuarioPolitico;
    }

    /**
     * @return the tempo
     */
    public Time getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempo to set
     */
    public void setTempo(Time tempo) {
        this.tempo = tempo;
    }
}