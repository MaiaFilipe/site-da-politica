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
@Table(name = "responder")
public class Responder {
    
	@Id
    @Column(name = "cd_resposta")
    Integer codigoResposta;

    @Id
    @Column(name = "cd_usuario_comum")
    Integer codigoUsuarioComum;

    @Id
    @Column(name = "cd_usuario_politico")
    Integer codigoUsuarioPolitico;

    @Id
    @Column(name = "cd_usuario_adm")
    Integer codigoUsuarioAdm;

    @Id
    @Column(name = "ds_resposta")
    Integer descricaoResposta;

}
