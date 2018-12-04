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
@Table(name = "usuario_comum")
public class Usuario_Comum {

	@Id
    @Column(name = "ds_email")
    String descricaoEmail;

    @Id
    @Column(name = "ds_usuario_comum")
    String descricaoUsuarioComum;

    @Id
    @Column(name = "nr_numero")
    Integer numero;

    @Id
    @Column(name = "nr_cpf")
    Integer numeroCpf;

    @Id
    @Column(name = "nm_senha")
    String senha;

    @Id
    @Column(name = "ds_posicao")
    String descricaoPosicao;

    @Id
    @Column(name = "nm_usuario_comum")
    String nomeUsuarioComum;

    @Id
    @Column(name = "nm_nick_name_comum")
    String nickNameUsuarioComum;

    @Id
    @Column(name = "cd_usuario_comum")
    Integer codigoUsuarioComum;

    @Id
    @Column(name = "dt_nascimento")
    Date dataNascimento;
    
}
