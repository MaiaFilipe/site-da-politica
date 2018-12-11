/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.site_da_politica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "seguir")
public class Seguir implements Serializable {

    @Id
    @Column(name = "cd_usuario_comum")
    Integer codigoUsuarioComum;

    @Column(name = "cd_usuario_adm")
    Integer codigoUsuarioAdm;

    @Column(name = "cd_usuario_politico")
    Integer codigoUsuarioPolitico;

    @Column(name = "cd_seguir")
    Integer codigoSeguir;
    
}
