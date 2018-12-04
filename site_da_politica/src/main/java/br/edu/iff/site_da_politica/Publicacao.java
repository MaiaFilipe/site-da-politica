/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.site_da_politica;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "publicacao")
public class Publicacao {

	@Id
    @Column(name = "dt_data")
    Date data;

    @Id
    @Column(name = "tm_horario")
    Time horario;

    @Id
    @Column(name = "cd_publicacao")
    Integer codigoPublicacao;

    @Id
    @Column(name = "fk_cd_usuario_politico")
    Integer codigoUsuarioPolitico;

    @Id
    @Column(name = "fk_cd_usuario_comum")
    Integer codigoUsuarioComum;

    @Id
    @Column(name = "fk_cd_usuario_adm")
    Integer codigoUsuarioAdm;

    //CONSTRAINT pk_cd_publicacao PRIMARY KEY (cd_publicacao);

}
