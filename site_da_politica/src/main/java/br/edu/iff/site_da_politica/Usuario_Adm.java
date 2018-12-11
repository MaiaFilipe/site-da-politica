/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.site_da_politica;

import java.io.Serializable;
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
@Table(name = "usuario_adm")
public class Usuario_Adm implements Serializable {
    
    @Id
    @Column(name = "cd_usuario_adm")
    Integer codigoUsuarioAdm;

    @Column(name = "ds_email")
    String descricaoEmail;

    @Column(name = "ds_usuario_adm")
    String descricaoUsuarioAdm;

    @Column(name = "nr_numero")
    Integer numero;

    @Column(name = "nr_cpf")
    Integer numeroCpf;

    @Column(name = "nm_senha")
    String senha;

    @Column(name = "ds_posicao_politica")
    String descricaoPosicao;

    @Column(name = "nm_usuario_adm")
    String nomeUsuarioAdm;

    @Column(name = "nm_nick_name_adm")
    String nickUsuarioAdm;

    @Column(name = "dt_nascimento")
    Date dataNascimento;
}
