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
@Table(name = "curtir")
public class Usuario_politico implements Serializable {
    
    @Id
    @Column(name = "cd_usuario_politico")
    Integer codigoUsuarioPolitico;
    
    @Column(name = "nm_usuario_politico")
    String nomeUsuarioPolitico;

    @Column(name = "nr_cpf")
    Integer numeroCpf;

    @Column(name = "ds_email")
    String descricaoEmail;

    @Column(name = "ds_usuario_politico")
    String descricaoUsuarioPolitico;

    @Column(name = "nm_senha")
    String senha;

    @Column(name = "nm_nick_politico")
    String nickPolitico;

    @Column(name = "ds_posicao_politica")
    Integer descricaoPosicaoPolitica;

}
