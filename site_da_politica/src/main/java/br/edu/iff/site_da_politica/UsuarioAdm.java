package br.edu.iff.site_da_politica;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "usuario_adm")
public class UsuarioAdm implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "nr_numero")
    private long nrNumero;
    
    @Column(name = "nr_cpf")
    private Long nrCpf;
    
    @OneToMany(mappedBy = "fkCdUsuarioAdm")
    private Collection<Publicacao> publicacaoCollection;
    
    @Id
    @Column(name = "cd_usuario_adm")
    private Integer codigoUsuarioAdm;

    @Column(name = "ds_email")
    private String descricaoEmail;

    @Column(name = "ds_usuario_adm")
    private String descricaoUsuarioAdm;

    @Column(name = "nm_senha")
    private String senha;

    @Column(name = "ds_posicao_politica")
    private String descricaoPosicao;

    @Column(name = "nm_usuario_adm")
    private String nomeUsuarioAdm;

    @Column(name = "nm_nick_name_adm")
    private String nickUsuarioAdm;

    @Column(name = "dt_nascimento")
    //@Temporal(TemporalType.DATE)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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
     * @return the descricaoUsuarioAdm
     */
    public String getDescricaoUsuarioAdm() {
        return descricaoUsuarioAdm;
    }

    /**
     * @param descricaoUsuarioAdm the descricaoUsuarioAdm to set
     */
    public void setDescricaoUsuarioAdm(String descricaoUsuarioAdm) {
        this.descricaoUsuarioAdm = descricaoUsuarioAdm;
    }

    /**
     * @return the numero
     */
   

    /**
     * @param numero the numero to set
     */
    

    /**
     * @return the numeroCpf
     */
    public Long getnrCpf() {
        return nrCpf;
    }

    /**
     * @param numeroCpf the numeroCpf to set
     */
    public void setnrCpf(Long numeroCpf) {
        this.nrCpf = nrCpf;
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
     * @return the descricaoPosicao
     */
    public String getDescricaoPosicao() {
        return descricaoPosicao;
    }

    /**
     * @param descricaoPosicao the descricaoPosicao to set
     */
    public void setDescricaoPosicao(String descricaoPosicao) {
        this.descricaoPosicao = descricaoPosicao;
    }

    /**
     * @return the nomeUsuarioAdm
     */
    public String getNomeUsuarioAdm() {
        return nomeUsuarioAdm;
    }

    /**
     * @param nomeUsuarioAdm the nomeUsuarioAdm to set
     */
    public void setNomeUsuarioAdm(String nomeUsuarioAdm) {
        this.nomeUsuarioAdm = nomeUsuarioAdm;
    }

    /**
     * @return the nickUsuarioAdm
     */
    public String getNickUsuarioAdm() {
        return nickUsuarioAdm;
    }

    /**
     * @param nickUsuarioAdm the nickUsuarioAdm to set
     */
    public void setNickUsuarioAdm(String nickUsuarioAdm) {
        this.nickUsuarioAdm = nickUsuarioAdm;
    }

    public UsuarioAdm() {
    }

    public long getNrNumero() {
        return nrNumero;
    }

    public void setNrNumero(long nrNumero) {
        this.nrNumero = nrNumero;
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
