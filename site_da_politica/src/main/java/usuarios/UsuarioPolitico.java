package usuarios;

import funcoes.Publicacao;
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
//@Table(name = "usuario_politico")
public class UsuarioPolitico implements Serializable {
/*
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

    public Integer getCodigoUsuarioPolitico() {
        return codigoUsuarioPolitico;
    }

    public void setCodigoUsuarioPolitico(Integer codigoUsuarioPolitico) {
        this.codigoUsuarioPolitico = codigoUsuarioPolitico;
    }

    public String getNomeUsuarioPolitico() {
        return nomeUsuarioPolitico;
    }

    public void setNomeUsuarioPolitico(String nomeUsuarioPolitico) {
        this.nomeUsuarioPolitico = nomeUsuarioPolitico;
    }

    public Long getnrCpf() {
        return nrCpf;
    }

    public void setNnrCpf(Long numeroCpf) {
        this.nrCpf = nrCpf;
    }

    public String getDescricaoEmail() {
        return descricaoEmail;
    }

    public void setDescricaoEmail(String descricaoEmail) {
        this.descricaoEmail = descricaoEmail;
    }

    public String getDescricaoUsuarioPolitico() {
        return descricaoUsuarioPolitico;
    }

    public void setDescricaoUsuarioPolitico(String descricaoUsuarioPolitico) {
        this.descricaoUsuarioPolitico = descricaoUsuarioPolitico;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNickPolitico() {
        return nickPolitico;
    }

    public void setNickPolitico(String nickPolitico) {
        this.nickPolitico = nickPolitico;
    }

    public String getDescricaoPosicaoPolitica() {
        return descricaoPosicaoPolitica;
    }

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
*/
}
