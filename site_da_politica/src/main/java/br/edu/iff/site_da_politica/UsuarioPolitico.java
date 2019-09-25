package br.edu.iff.site_da_politica;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "usuario_politico")
public class UsuarioPolitico implements Serializable {

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "nr_cpf")
    private Long nrCpf;
    
    @OneToMany(mappedBy = "fkCdUsuarioPolitico")
    private Collection<Publicacao> publicacaoCollection;
    
    @Id
    @GeneratedValue
    @Column(name = "cd_usuario_politico")
    private Integer codigoUsuarioPolitico;
    
    @Column(name = "nm_usuario_politico") 
    private String nomeUsuarioPolitico;

    @Column(name = "ds_email")
    private String descricaoEmail;

    @Column(name = "ds_usuario_politico")
    private String descricaoUsuarioPolitico;

    @Column(name = "nm_senha")
    private String senha;

    @Column(name = "nm_nick_politico") //@
    private String nickPolitico;

    @Column(name = "ds_posicao_politica")
    private String descricaoPosicaoPolitica;

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
     * @return the nomeUsuarioPolitico
     */
    public String getNomeUsuarioPolitico() {
        return nomeUsuarioPolitico;
    }

    /**
     * @param nomeUsuarioPolitico the nomeUsuarioPolitico to set
     */
    public void setNomeUsuarioPolitico(String nomeUsuarioPolitico) {
        this.nomeUsuarioPolitico = nomeUsuarioPolitico;
    }

    /**
     * @return the numeroCpf
     */
    public Long getnrCpf() {
        return nrCpf;
    }

    /**
     * @param numeroCpf the numeroCpf to set
     */
    public void setNnrCpf(Long numeroCpf) {
        this.nrCpf = nrCpf;
    }

    /**
     * @return the descricaoEmail
     */
    public String getDescricaoEmail() {
        return descricaoEmail;
    }

    /**
     * @param descricaoEmail the descricaoEmail to set
     */
    public void setDescricaoEmail(String descricaoEmail) {
        this.descricaoEmail = descricaoEmail;
    }

    /**
     * @return the descricaoUsuarioPolitico
     */
    public String getDescricaoUsuarioPolitico() {
        return descricaoUsuarioPolitico;
    }

    /**
     * @param descricaoUsuarioPolitico the descricaoUsuarioPolitico to set
     */
    public void setDescricaoUsuarioPolitico(String descricaoUsuarioPolitico) {
        this.descricaoUsuarioPolitico = descricaoUsuarioPolitico;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nickPolitico
     */
    public String getNickPolitico() {
        return nickPolitico;
    }

    /**
     * @param nickPolitico the nickPolitico to set
     */
    public void setNickPolitico(String nickPolitico) {
        this.nickPolitico = nickPolitico;
    }

    /**
     * @return the descricaoPosicaoPolitica
     */
    public String getDescricaoPosicaoPolitica() {
        return descricaoPosicaoPolitica;
    }

    /**
     * @param descricaoPosicaoPolitica the descricaoPosicaoPolitica to set
     */
    public void setDescricaoPosicaoPolitica(String descricaoPosicaoPolitica) {
        this.descricaoPosicaoPolitica = descricaoPosicaoPolitica;
    }

    void getNomeUsuarioPolitico(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDataNascimento(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UsuarioPolitico() {
    }

    public Long getNrCpf() {
        return nrCpf;
    }

    public void setNrCpf(Long nrCpf) {
        this.nrCpf = nrCpf;
    }

    @XmlTransient
    public Collection<Publicacao> getPublicacaoCollection() {
        return publicacaoCollection;
    }

    public void setPublicacaoCollection(Collection<Publicacao> publicacaoCollection) {
        this.publicacaoCollection = publicacaoCollection;
    }

}
