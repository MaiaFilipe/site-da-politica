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
@Table(name = "curtir")
public class Usuario_politico {

	@Id
    @Column(name = "nm_usuario_politico")
    String nomeUsuarioPolitico;

    @Id
    @Column(name = "nr_cpf")
    Integer numeroCpf;

    @Id
    @Column(name = "ds_email")
    String descricaoEmail;

    @Id
    @Column(name = "ds_usuario_politico")
    String descricaoUsuarioPolitico;

    @Id
    @Column(name = "nm_senha")
    String senha;

    @Id
    @Column(name = "nm_nick_politico")
    String nickPolitico;

    @Id
    @Column(name = "cd_usuario_politico")
    Integer codigoUsuarioPolitico;

    @Id
    @Column(name = "ds_posicao_politica")
    Integer descricaoPosicaoPolitica;

}
