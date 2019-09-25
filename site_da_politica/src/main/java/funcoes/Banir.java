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
@Table(name = "banir")
public class Banir implements Serializable {

    /**
     * @return the codigoBanir
     */
    public Integer getCodigoBanir() {
        return codigoBanir;
    }

    /**
     * @param codigoBanir the codigoBanir to set
     */
    public void setCodigoBanir(Integer codigoBanir) {
        this.codigoBanir = codigoBanir;
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

    @Id
    @Column(name = "cd_usuario_adm")
    private Integer codigoUsuarioAdm;
    
    @Id
    @Column(name = "cd_usuario_comum")
    private Integer codigoUsuarioComum;
    
    @Id
    @Column(name = "cd_usuario_politico")
    private Integer codigoUsuarioPolitico;
    
    @Id
    @Column(name = "cd_banir")
    private Integer codigoBanir;
}