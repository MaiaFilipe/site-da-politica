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
    Integer codigoCompartilhar;
    
    @Id
    @Column(name = "cd_usuario_comum")
    Integer codigoUsuarioComum;
    
    @Id
    @Column(name = "cd_usuario_adm")
    Integer codigoUsuarioAdm;
    
    @Id
    @Column(name = "cd_usuario_politica")
    Integer codigoUsuarioPolitico;
    
    @Id
    @Column(name = "tm_horario")
    Time tempo;

  //CONSTRAINT pk_cd_compartilhar PRIMARY KEY (cd_compartilhar)
}