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
    Integer codigoPublicacao;
    
    @Column(name = "dt_data")
    Date data;
    
    @Column(name = "tm_horario")
    Time horario;
    
    @Column(name = "fk_cd_usuario_politico")
    Integer codigoUsuarioPolitico;

    @Column(name = "fk_cd_usuario_comum")
    Integer codigoUsuarioComum;

    @Column(name = "fk_cd_usuario_adm")
    Integer codigoUsuarioAdm;

    //CONSTRAINT pk_cd_publicacao PRIMARY KEY (cd_publicacao);
}
