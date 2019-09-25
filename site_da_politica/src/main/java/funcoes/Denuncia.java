/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Denuncia")
public class Denuncia implements Serializable {

    /**
     * @return the codigoDenuncia
     */
    public Integer getCodigoDenuncia() {
        return codigoDenuncia;
    }

    /**
     * @param codigoDenuncia the codigoDenuncia to set
     */
    public void setCodigoDenuncia(Integer codigoDenuncia) {
        this.codigoDenuncia = codigoDenuncia;
    }

    /**
     * @return the codigoPublicacao
     */
    public Integer getCodigoPublicacao() {
        return codigoPublicacao;
    }

    /**
     * @param codigoPublicacao the codigoPublicacao to set
     */
    public void setCodigoPublicacao(Integer codigoPublicacao) {
        this.codigoPublicacao = codigoPublicacao;
    }

    /**
     * @return the codigoUsuarioComum
     */
    public Integer getCodigoUsuarioComum() {
        return codigoUsuarioComum;
    }

    /**
     * @param codigoUsuarioComum the codigoUsuarioComum to set
     */
    public void setCodigoUsuarioComum(Integer codigoUsuarioComum) {
        this.codigoUsuarioComum = codigoUsuarioComum;
    }

    /**
     * @return the codigoUsuarioAdm
     */
    public Integer getCodigoUsuarioAdm() {
        return codigoUsuarioAdm;
    }

    /**
     * @param codigoUsuarioAdm the codigoUsuarioAdm to set
     */
    public void setCodigoUsuarioAdm(Integer codigoUsuarioAdm) {
        this.codigoUsuarioAdm = codigoUsuarioAdm;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the codigoUsuarioPolitico
     */
    public Integer getCodigoUsuarioPolitico() {
        return codigoUsuarioPolitico;
    }

    /**
     * @param codigoUsuarioPolitico the codigoUsuarioPolitico to set
     */
    public void setCodigoUsuarioPolitico(Integer codigoUsuarioPolitico) {
        this.codigoUsuarioPolitico = codigoUsuarioPolitico;
    }
    
    @Id
    @Column(name = "cd_denuncia")
    private Integer codigoDenuncia;
    
    @Id
    @Column(name = "cd_publicacao")
    private Integer codigoPublicacao;
    
    @Id
    @Column(name = "cd_usuario_comum")
    private Integer codigoUsuarioComum;
    
    @Id
    @Column(name = "cd_usuario_adm")
    private Integer codigoUsuarioAdm;
    
    @Id
    @Column(name = "ds_descricao")
    private String descricao;
    
    @Id
    @Column(name = "cd_usuario_politico")
    private Integer codigoUsuarioPolitico;

    //CONSTRAINT pk_cd_denuncia PRIMARY KEY (cd_denuncia) 
}
