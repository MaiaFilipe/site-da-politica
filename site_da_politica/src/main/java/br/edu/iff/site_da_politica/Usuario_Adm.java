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
@Table(name = "usuario_adm")
public class Usuario_Adm {

	@Id
    @Column(name = "ds_email")
    String descricaoEmail;

    @Id
    @Column(name = "ds_usuario_adm")
    String descricaoUsuarioAdm;

    @Id
    @Column(name = "nr_numero")
    Integer numero;

    @Id
    @Column(name = "nr_cpf")
    Integer numeroCpf;

    @Id
    @Column(name = "nm_senha")
    Sting senha;

    @Id
    @Column(name = "ds_posicao_politica")
    Sting descricaoPosicao;

    @Id
    @Column(name = "nm_usuario_adm")
    Sting nomeUsuarioAdm;

    @Id
    @Column(name = "nm_nick_name_adm")
    Sting nickUsuarioAdm;

    @Id
    @Column(name = "cd_usuario_adm")
    Integer codigoUsuarioAdm;

    @Id
    @Column(name = "dt_nascimento")
    Date dataNascimento;
}
