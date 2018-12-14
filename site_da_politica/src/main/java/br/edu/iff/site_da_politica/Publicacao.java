/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.site_da_politica;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "publicacao")
public class Publicacao implements Serializable {

    @Id
    @Column(name = "cd_publicacao")
    private Integer codigoPublicacao;
    
    @Column(name = "dt_data")
    private Date data;
    
    @Column(name = "tm_horario")
    private Time horario;
    
    @Column(name = "fk_cd_usuario_politico")
    private Integer codigoUsuarioPolitico;

    @Column(name = "fk_cd_usuario_comum")
    private Integer codigoUsuarioComum;

    @Column(name = "fk_cd_usuario_adm")
    private Integer codigoUsuarioAdm;

    //CONSTRAINT pk_cd_publicacao PRIMARY KEY (cd_publicacao);

    /**
     * @return the codigoPublicacao
     */
    public Integer getCodigoPublicacao() {
        return codigoPublicacao;
    }

    /**
     * @param codigoPublicacao the codigoPublicacao to set
     */
    public void setCodigoPublicacao(Integer codigoPublicacao) {
        this.codigoPublicacao = codigoPublicacao;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the horario
     */
    public Time getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(Time horario) {
        this.horario = horario;
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
}
