package br.edu.iff.site_da_politica;

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
@Table(name = "usuario_adm")
public class Usuario_Adm implements Serializable {
    
    @Id
    @Column(name = "cd_usuario_adm")
    private Integer codigoUsuarioAdm;

    @Column(name = "ds_email")
    private String descricaoEmail;

    @Column(name = "ds_usuario_adm")
    private String descricaoUsuarioAdm;

    @Column(name = "nr_numero")
    private Integer numero;

    @Column(name = "nr_cpf")
    private Integer numeroCpf;

    @Column(name = "nm_senha")
    private String senha;

    @Column(name = "ds_posicao_politica")
    private String descricaoPosicao;

    @Column(name = "nm_usuario_adm")
    private String nomeUsuarioAdm;

    @Column(name = "nm_nick_name_adm")
    private String nickUsuarioAdm;

    @Column(name = "dt_nascimento")
    private Integer dataNascimento;

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

    /**
     * @return the dataNascimento
     */
    public Integer getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Integer dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    void setDataNascimento(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getDescricaoUsuarioAdm(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getNumeroCpf(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
