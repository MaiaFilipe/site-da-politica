--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.7
-- Dumped by pg_dump version 9.5.7

-- Started on 2018-11-26 18:58:02 BRST

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12395)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2172 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 182 (class 1259 OID 33380)
-- Name: publicacao; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE publicacao (
    dt_data date,
    tm_horario time without time zone,
    cd_publicacao integer NOT NULL,
    fk_cd_usuario_politico integer,
    fk_cd_usuario_comum integer,
    fk_cd_usuario_adm integer
);


--
-- TOC entry 184 (class 1259 OID 33411)
-- Name: usuario_adm; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE usuario_adm (
    ds_email text,
    ds_usuario_adm character varying(20),
    nr_numero numeric(11,0) NOT NULL,
    nr_cpf numeric(11,0),
    nm_senha character varying(50),
    ds_posicao_politica text,
    nm_usuario_adm name,
    nm_nick_name_adm name NOT NULL,
    cd_usuario_adm integer NOT NULL,
    dt_nascimento timestamp(6) with time zone
);


--
-- TOC entry 183 (class 1259 OID 33389)
-- Name: usuario_comum; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE usuario_comum (
    ds_email text,
    ds_usuario_comum character varying(20),
    nr_numero numeric(11,0) NOT NULL,
    nr_cpf numeric(11,0),
    nm_senha character varying(50),
    ds_posicao text,
    nm_usuario_comum name,
    nm_nick_name_comum name NOT NULL,
    cd_usuario_comum integer NOT NULL,
    dt_nascimento timestamp(6) with time zone
);


--
-- TOC entry 181 (class 1259 OID 33374)
-- Name: usuario_politico; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE usuario_politico (
    nm_usuario_politico text,
    nr_cpf numeric(11,11),
    ds_email text,
    ds_usuario_politico character varying(20),
    nm_senha character varying(50),
    nm_nick_politico name NOT NULL,
    cd_usuario_politico integer NOT NULL,
    ds_posicao_politica text
);


--
-- TOC entry 2162 (class 0 OID 33380)
-- Dependencies: 182
-- Data for Name: publicacao; Type: TABLE DATA; Schema: public; Owner: -
--

COPY publicacao (dt_data, tm_horario, cd_publicacao, fk_cd_usuario_politico, fk_cd_usuario_comum, fk_cd_usuario_adm) FROM stdin;
\.


--
-- TOC entry 2164 (class 0 OID 33411)
-- Dependencies: 184
-- Data for Name: usuario_adm; Type: TABLE DATA; Schema: public; Owner: -
--

COPY usuario_adm (ds_email, ds_usuario_adm, nr_numero, nr_cpf, nm_senha, ds_posicao_politica, nm_usuario_adm, nm_nick_name_adm, cd_usuario_adm, dt_nascimento) FROM stdin;
\.


--
-- TOC entry 2163 (class 0 OID 33389)
-- Dependencies: 183
-- Data for Name: usuario_comum; Type: TABLE DATA; Schema: public; Owner: -
--

COPY usuario_comum (ds_email, ds_usuario_comum, nr_numero, nr_cpf, nm_senha, ds_posicao, nm_usuario_comum, nm_nick_name_comum, cd_usuario_comum, dt_nascimento) FROM stdin;
\.


--
-- TOC entry 2161 (class 0 OID 33374)
-- Dependencies: 181
-- Data for Name: usuario_politico; Type: TABLE DATA; Schema: public; Owner: -
--

COPY usuario_politico (nm_usuario_politico, nr_cpf, ds_email, ds_usuario_politico, nm_senha, nm_nick_politico, cd_usuario_politico, ds_posicao_politica) FROM stdin;
\.


--
-- TOC entry 2039 (class 2606 OID 33408)
-- Name: pk_cd_publicacao; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY publicacao
    ADD CONSTRAINT pk_cd_publicacao PRIMARY KEY (cd_publicacao);


--
-- TOC entry 2043 (class 2606 OID 33418)
-- Name: pk_cd_usuario_adm; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY usuario_adm
    ADD CONSTRAINT pk_cd_usuario_adm PRIMARY KEY (cd_usuario_adm);


--
-- TOC entry 2041 (class 2606 OID 33406)
-- Name: pk_cd_usuario_comum; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY usuario_comum
    ADD CONSTRAINT pk_cd_usuario_comum PRIMARY KEY (cd_usuario_comum);


--
-- TOC entry 2034 (class 2606 OID 33410)
-- Name: pk_cd_usuario_politico; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY usuario_politico
    ADD CONSTRAINT pk_cd_usuario_politico PRIMARY KEY (cd_usuario_politico);


--
-- TOC entry 2035 (class 1259 OID 33430)
-- Name: fki_cd_usuario_adm; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX fki_cd_usuario_adm ON publicacao USING btree (fk_cd_usuario_adm);


--
-- TOC entry 2036 (class 1259 OID 33436)
-- Name: fki_cd_usuario_comum; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX fki_cd_usuario_comum ON publicacao USING btree (fk_cd_usuario_comum);


--
-- TOC entry 2037 (class 1259 OID 33424)
-- Name: fki_cd_usuario_politico; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX fki_cd_usuario_politico ON publicacao USING btree (fk_cd_usuario_politico);


--
-- TOC entry 2045 (class 2606 OID 33425)
-- Name: fk_cd_usuario_adm; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY publicacao
    ADD CONSTRAINT fk_cd_usuario_adm FOREIGN KEY (fk_cd_usuario_adm) REFERENCES usuario_adm(cd_usuario_adm);


--
-- TOC entry 2046 (class 2606 OID 33431)
-- Name: fk_cd_usuario_comum; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY publicacao
    ADD CONSTRAINT fk_cd_usuario_comum FOREIGN KEY (fk_cd_usuario_comum) REFERENCES usuario_comum(cd_usuario_comum);


--
-- TOC entry 2044 (class 2606 OID 33419)
-- Name: fk_cd_usuario_politico; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY publicacao
    ADD CONSTRAINT fk_cd_usuario_politico FOREIGN KEY (fk_cd_usuario_politico) REFERENCES usuario_politico(cd_usuario_politico);


--
-- TOC entry 2171 (class 0 OID 0)
-- Dependencies: 7
-- Name: public; Type: ACL; Schema: -; Owner: -
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2018-11-26 18:58:02 BRST

--
-- PostgreSQL database dump complete
--

