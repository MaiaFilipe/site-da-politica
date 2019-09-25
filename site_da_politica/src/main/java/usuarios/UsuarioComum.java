/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import funcoes.Publicacao;
import servlet.UsuarioComumServlet;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "usuario_comum")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioComum.findAll", query = "SELECT u FROM UsuarioComum u")
    , @NamedQuery(name = "UsuarioComum.findByDsUsuarioComum", query = "SELECT u FROM UsuarioComum u WHERE u.dsUsuarioComum = :dsUsuarioComum")
    , @NamedQuery(name = "UsuarioComum.findByNrNumero", query = "SELECT u FROM UsuarioComum u WHERE u.nrNumero = :nrNumero")
    , @NamedQuery(name = "UsuarioComum.findByNrCpf", query = "SELECT u FROM UsuarioComum u WHERE u.nrCpf = :nrCpf")
    , @NamedQuery(name = "UsuarioComum.findByNmSenha", query = "SELECT u FROM UsuarioComum u WHERE u.nmSenha = :nmSenha")
    , @NamedQuery(name = "UsuarioComum.findByDsPosicao", query = "SELECT u FROM UsuarioComum u WHERE u.dsPosicao = :dsPosicao")
    , @NamedQuery(name = "UsuarioComum.findByNmNickNameComum", query = "SELECT u FROM UsuarioComum u WHERE u.nmNickNameComum = :nmNickNameComum")
    , @NamedQuery(name = "UsuarioComum.findByCdUsuarioComum", query = "SELECT u FROM UsuarioComum u WHERE u.cdUsuarioComum = :cdUsuarioComum")
    , @NamedQuery(name = "UsuarioComum.findByDsEmail", query = "SELECT u FROM UsuarioComum u WHERE u.dsEmail = :dsEmail")
    , @NamedQuery(name = "UsuarioComum.findByNmUsuarioComum", query = "SELECT u FROM UsuarioComum u WHERE u.nmUsuarioComum = :nmUsuarioComum")
    , @NamedQuery(name = "UsuarioComum.findByDtNascimento", query = "SELECT u FROM UsuarioComum u WHERE u.dtNascimento = :dtNascimento")
    , @NamedQuery(name = "UsuarioComum.findByNmEstado", query = "SELECT u FROM UsuarioComum u WHERE u.nmEstado = :nmEstado")})
public class UsuarioComum implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "nr_numero")
    private Long nrNumero;
    
    @Column(name = "nr_cpf")
    private Long nrCpf;
    
    @OneToMany(mappedBy = "fkCdUsuarioComum")
    private Collection<Publicacao> publicacaoCollection;

    private static final long serialVersionUID = 1L;
    @Column(name = "ds_usuario_comum")
    private String dsUsuarioComum;
    
    @NotNull
    @Column(name = "nm_senha")
    private String nmSenha;
    
    @Size(max = 2147483647)
    @Column(name = "ds_posicao")
    private String dsPosicao;
    
    @NotNull
    @Column(name = "nm_nick_name_comum")
    private String nmNickNameComum;
    
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meugerador")
    @SequenceGenerator(name="meugerador", sequenceName = "sq_usuario")
    @Column(name = "cd_usuario_comum")
    private Integer cdUsuarioComum;
    
    @NotNull
    @Column(name = "ds_email")
    private String dsEmail;
    
    @NotNull
    @Column(name = "nm_usuario_comum")
    private String nmUsuarioComum;
    
    @NotNull
    @Column(name = "dt_nascimento")
    private String dtNascimento;
    
    @Column(name = "nm_estado")
    private String nmEstado;

    public UsuarioComum() {
    }

    public UsuarioComum(Integer cdUsuarioComum) {
        this.cdUsuarioComum = cdUsuarioComum;
    }

    public UsuarioComum(Integer cdUsuarioComum, Long nrNumero, String nmNickNameComum) {
        this.cdUsuarioComum = cdUsuarioComum;
        this.nrNumero = nrNumero;
        this.nmNickNameComum = nmNickNameComum;
    }

    public String getDsUsuarioComum() {
        return dsUsuarioComum;
    }

    public void setDsUsuarioComum(String dsUsuarioComum) {
        this.dsUsuarioComum = dsUsuarioComum;
    }

    public Long getNrNumero() {
        return nrNumero;
    }

    public void setNrNumero(Long nrNumero) {
        this.nrNumero = nrNumero;
    }

    public Long getNrCpf() {
        return nrCpf;
    }

    public void setNrCpf(Long nrCpf) {
        this.nrCpf = nrCpf;
    }

    public String getNmSenha() {
        return nmSenha;
    }

    public void setNmSenha(String nmSenha) {
        this.nmSenha = nmSenha;
    }

    public String getDsPosicao() {
        return dsPosicao;
    }

    public void setDsPosicao(String dsPosicao) {
        this.dsPosicao = dsPosicao;
    }

    public String getNmNickNameComum() {
        return nmNickNameComum;
    }

    public void setNmNickNameComum(String nmNickNameComum) {
        this.nmNickNameComum = nmNickNameComum;
    }

    public Integer getCdUsuarioComum() {
        return cdUsuarioComum;
    }

    public void setCdUsuarioComum(Integer cdUsuarioComum) {
        this.cdUsuarioComum = cdUsuarioComum;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public String getNmUsuarioComum() {
        return nmUsuarioComum;
    }

    public void setNmUsuarioComum(String nmUsuarioComum) {
        this.nmUsuarioComum = nmUsuarioComum;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getNmEstado() {
        return nmEstado;
    }

    public void setNmEstado(String nmEstado) {
        this.nmEstado = nmEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdUsuarioComum != null ? cdUsuarioComum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioComum)) {
            return false;
        }
        UsuarioComum other = (UsuarioComum) object;
        if ((this.cdUsuarioComum == null && other.cdUsuarioComum != null) || (this.cdUsuarioComum != null && !this.cdUsuarioComum.equals(other.cdUsuarioComum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.iff.site_da_politica.UsuarioComum[ cdUsuarioComum=" + cdUsuarioComum + " ]";
    }

    @XmlTransient
    public Collection<Publicacao> getPublicacaoCollection() {
        return publicacaoCollection;
    }

    public void setPublicacaoCollection(Collection<Publicacao> publicacaoCollection) {
        this.publicacaoCollection = publicacaoCollection;
    }

    void setTitulo(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
