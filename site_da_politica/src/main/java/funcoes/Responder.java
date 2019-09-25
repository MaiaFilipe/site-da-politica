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

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "responder")
public class Responder implements Serializable {
    
    @Id
    @Column(name = "cd_resposta")
    private Integer codigoResposta;

    @Column(name = "cd_usuario_comum")
    private Integer codigoUsuarioComum;

    @Column(name = "cd_usuario_politico")
    private Integer codigoUsuarioPolitico;

    @Column(name = "cd_usuario_adm")
    private Integer codigoUsuarioAdm;

    @Column(name = "ds_resposta")
    private Integer descricaoResposta;

    /**
     * @return the codigoResposta
     */
    public Integer getCodigoResposta() {
        return codigoResposta;
    }

    /**
     * @param codigoResposta the codigoResposta to set
     */
    public void setCodigoResposta(Integer codigoResposta) {
        this.codigoResposta = codigoResposta;
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
     * @return the descricaoResposta
     */
    public Integer getDescricaoResposta() {
        return descricaoResposta;
    }

    /**
     * @param descricaoResposta the descricaoResposta to set
     */
    public void setDescricaoResposta(Integer descricaoResposta) {
        this.descricaoResposta = descricaoResposta;
    }

}
