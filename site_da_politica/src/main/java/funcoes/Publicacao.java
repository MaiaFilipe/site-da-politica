/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import usuarios.UsuarioAdm;
import usuarios.UsuarioComum;
import usuarios.UsuarioPolitico;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "publicacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Publicacao.findAll", query = "SELECT p FROM Publicacao p")
    , @NamedQuery(name = "Publicacao.findByDtData", query = "SELECT p FROM Publicacao p WHERE p.dtData = :dtData")
    , @NamedQuery(name = "Publicacao.findByTmHorario", query = "SELECT p FROM Publicacao p WHERE p.tmHorario = :tmHorario")
    , @NamedQuery(name = "Publicacao.findByCdPublicacao", query = "SELECT p FROM Publicacao p WHERE p.cdPublicacao = :cdPublicacao")
    , @NamedQuery(name = "Publicacao.findByTitulo", query = "SELECT p FROM Publicacao p WHERE p.titulo = :titulo")
    , @NamedQuery(name = "Publicacao.findByTexto", query = "SELECT p FROM Publicacao p WHERE p.texto = :texto")})
public class Publicacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "dt_data")
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dtData;
    
    @Column(name = "tm_horario")
    @Temporal(TemporalType.TIME)
    private Date tmHorario;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meugerador")
    @SequenceGenerator(name="meugerador", sequenceName = "sq_publicacao")
    @Column(name = "cd_publicacao")
    private Integer cdPublicacao;
    
    @Size(max = 2147483647)
    @Column(name = "titulo")
    private String titulo;
    
    @Size(max = 2147483647)
    @Column(name = "texto")
    private String texto;
    
    @JoinColumn(name = "fk_cd_usuario_adm", referencedColumnName = "cd_usuario_adm")
    @ManyToOne
    private UsuarioAdm fkCdUsuarioAdm;
    
    @JoinColumn(name = "fk_cd_usuario_comum", referencedColumnName = "cd_usuario_comum")
    @ManyToOne
    private UsuarioComum fkCdUsuarioComum;
    
    @JoinColumn(name = "fk_cd_usuario_politico", referencedColumnName = "cd_usuario_politico")
    @ManyToOne
    private UsuarioPolitico fkCdUsuarioPolitico;

    public Publicacao() {
    }

    public Publicacao(Integer cdPublicacao) {
        this.cdPublicacao = cdPublicacao;
    }

    public Date getDtData() {
        return dtData;
    }

    public void setDtData(Date dtData) {
        this.dtData = dtData;
    }

    public Date getTmHorario() {
        return tmHorario;
    }

    public void setTmHorario(Date tmHorario) {
        this.tmHorario = tmHorario;
    }

    public Integer getCdPublicacao() {
        return cdPublicacao;
    }

    public void setCdPublicacao(Integer cdPublicacao) {
        this.cdPublicacao = cdPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public UsuarioAdm getFkCdUsuarioAdm() {
        return fkCdUsuarioAdm;
    }

    public void setFkCdUsuarioAdm(UsuarioAdm fkCdUsuarioAdm) {
        this.fkCdUsuarioAdm = fkCdUsuarioAdm;
    }

    public UsuarioComum getFkCdUsuarioComum() {
        return fkCdUsuarioComum;
    }

    public void setFkCdUsuarioComum(UsuarioComum fkCdUsuarioComum) {
        this.fkCdUsuarioComum = fkCdUsuarioComum;
    }

    public UsuarioPolitico getFkCdUsuarioPolitico() {
        return fkCdUsuarioPolitico;
    }

    public void setFkCdUsuarioPolitico(UsuarioPolitico fkCdUsuarioPolitico) {
        this.fkCdUsuarioPolitico = fkCdUsuarioPolitico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdPublicacao != null ? cdPublicacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publicacao)) {
            return false;
        }
        Publicacao other = (Publicacao) object;
        if ((this.cdPublicacao == null && other.cdPublicacao != null) || (this.cdPublicacao != null && !this.cdPublicacao.equals(other.cdPublicacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.iff.site_da_politica.Publicacao[ cdPublicacao=" + cdPublicacao + " ]";
    }


    void setcdPublicacao(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
