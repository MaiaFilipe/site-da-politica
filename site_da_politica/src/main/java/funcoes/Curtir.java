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
@Table(name = "curtir")
public class Curtir implements Serializable {

    /**
     * @return the codigoCurtir
     */
    public Integer getCodigoCurtir() {
        return codigoCurtir;
    }

    /**
     * @param codigoCurtir the codigoCurtir to set
     */
    public void setCodigoCurtir(Integer codigoCurtir) {
        this.codigoCurtir = codigoCurtir;
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
    @Column(name = "cd_curtir")
    private Integer codigoCurtir;
    
    @Id
    @Column(name = "cd_usuario_comum")
    private Integer codigoUsuarioComum;

    @Id
    @Column(name = "cd_usuario_adm")
    private Integer codigoUsuarioAdm;
    
    @Id
    @Column(name = "cd_usuario_politico")
    private Integer codigoUsuarioPolitico;
    
  //CONSTRAINT pk_cd_curtir PRIMARY KEY (cd_curtir)
}
