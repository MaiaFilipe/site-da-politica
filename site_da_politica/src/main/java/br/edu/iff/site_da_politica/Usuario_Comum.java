package br.edu.iff.site_da_politica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "usuario_comum")
public class Usuario_Comum implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "cd_usuario_comum")
    private Integer codigoUsuarioComum;
    
    @Column(name = "ds_email")
    private String descricaoEmail;

    @Column(name = "ds_usuario_comum")
    private String descricaoUsuarioComum;
    
    @Column(name = "nm_estado")
    private String nomeEstado;

    @Column(name = "nr_numero")
    private Integer numero;

    @Column(name = "nr_cpf")
    private Integer numeroCpf;

    @Column(name = "nm_senha")
    private String senha;

    @Column(name = "ds_posicao")
    private String descricaoPosicao;

    @Column(name = "nm_usuario_comum")
    private String nomeUsuarioComum;

    @Column(name = "nm_nick_name_comum")
    private String nickNameUsuarioComum;

    @Column(name = "dt_nascimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    
    
    /**
     * @return the nomeEstado
     */
    public String getNomeEstado() {
        return nomeEstado;
    }

    /**
     * @param nomeEstado the nomeEstado to set
     */
    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
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
     * @return the descricaoUsuarioComum
     */
    public String getDescricaoUsuarioComum() {
        return descricaoUsuarioComum;
    }

    /**
     * @param descricaoUsuarioComum the descricaoUsuarioComum to set
     */
    public void setDescricaoUsuarioComum(String descricaoUsuarioComum) {
        this.descricaoUsuarioComum = descricaoUsuarioComum;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the numeroCpf
     */
    public Integer getNumeroCpf() {
        return numeroCpf;
    }

    /**
     * @param numeroCpf the numeroCpf to set
     */
    public void setNumeroCpf(Integer numeroCpf) {
        this.numeroCpf = numeroCpf;
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
     * @return the nomeUsuarioComum
     */
    public String getNomeUsuarioComum() {
        return nomeUsuarioComum;
    }

    /**
     * @param nomeUsuarioComum the nomeUsuarioComum to set
     */
    public void setNomeUsuarioComum(String nomeUsuarioComum) {
        this.nomeUsuarioComum = nomeUsuarioComum;
    }

    /**
     * @return the nickNameUsuarioComum
     */
    public String getNickNameUsuarioComum() {
        return nickNameUsuarioComum;
    }

    /**
     * @param nickNameUsuarioComum the nickNameUsuarioComum to set
     */
    public void setNickNameUsuarioComum(String nickNameUsuarioComum) {
        this.nickNameUsuarioComum = nickNameUsuarioComum;
    }

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

    void setDataNascimento(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setcodigoUsuarioComum(Integer parameter) {
        this.codigoUsuarioComum = parameter;
    }
    
}