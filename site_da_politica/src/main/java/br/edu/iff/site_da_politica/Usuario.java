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
@Table(name = "usuario_comum")
public class Usuario implements Serializable {
    
    @Id
    @Column(name = "cd_usuario_comum")
    Integer codigoUsuarioComum;
    
    @Id
    @Column(name = "ds_email")
    String email;
    
    @Id
    @Column(name = "ds_usuario_comum") 
    String bio;
    
    @Id
    @Column(name = "nr_numero") 
    Integer numero;
    
    @Id
    @Column(name = "nr_cpf") 
    Integer cpf;
    
    @Id
    @Column(name = "nm_senha") 
    String senha;
     
    @Id
    @Column(name = "ds_posicao") 
    String posicao;
    
    @Id
    @Column(name = "nm_usario_comum") 
    String nomeUsuario;
    
     
    @Id
    @Column(name = "nm_nick_name_comum") 
    String nickname;
    
     
    @Id
    @Column(name = "dt_nascimento") 
    Date dataNascimento;
    
  //CONSTRAINT pk_cd_usuario_comum PRIMARY KEY ()
}
