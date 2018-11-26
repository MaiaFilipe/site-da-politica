--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.7
-- Dumped by pg_dump version 9.5.7

-- Started on 2018-11-26 12:12:57 BRST

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
-- TOC entry 2163 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 181 (class 1259 OID 33374)
-- Name: politico; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE politico (
    nm_nome_politico text,
    nr_cpf numeric(11,11),
    ds_email text,
    ds_usuario character varying(20),
    nm_senha character varying(20),
    nm_nick_politico name NOT NULL,
    cd_politico integer NOT NULL
);


--
-- TOC entry 182 (class 1259 OID 33380)
-- Name: publicacao; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE publicacao (
    dt_data date,
    tm_horario time without time zone,
    cd_publicacao integer NOT NULL
);


--
-- TOC entry 183 (class 1259 OID 33386)
-- Name: usuario_adm; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE usuario_adm (
);


--
-- TOC entry 184 (class 1259 OID 33389)
-- Name: usuario_comum; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE usuario_comum (
    ds_email text,
    ds_usuario character varying(20),
    nr_numero numeric(11,0) NOT NULL,
    nr_cpf numeric(11,0),
    nm_senha character varying(20),
    ds_posicao text,
    nm_usuario name,
    nm_nick_name name NOT NULL,
    cd_usuario integer NOT NULL,
    dt_nascimento timestamp(6) with time zone
);


--
-- TOC entry 2152 (class 0 OID 33374)
-- Dependencies: 181
-- Data for Name: politico; Type: TABLE DATA; Schema: public; Owner: -
--

COPY politico (nm_nome_politico, nr_cpf, ds_email, ds_usuario, nm_senha, nm_nick_politico, cd_politico) FROM stdin;
\.


--
-- TOC entry 2153 (class 0 OID 33380)
-- Dependencies: 182
-- Data for Name: publicacao; Type: TABLE DATA; Schema: public; Owner: -
--

COPY publicacao (dt_data, tm_horario, cd_publicacao) FROM stdin;
\.


--
-- TOC entry 2154 (class 0 OID 33386)
-- Dependencies: 183
-- Data for Name: usuario_adm; Type: TABLE DATA; Schema: public; Owner: -
--

COPY usuario_adm  FROM stdin;
\.


--
-- TOC entry 2155 (class 0 OID 33389)
-- Dependencies: 184
-- Data for Name: usuario_comum; Type: TABLE DATA; Schema: public; Owner: -
--

COPY usuario_comum (ds_email, ds_usuario, nr_numero, nr_cpf, nm_senha, ds_posicao, nm_usuario, nm_nick_name, cd_usuario, dt_nascimento) FROM stdin;
\.


--
-- TOC entry 2033 (class 2606 OID 33410)
-- Name: pk_cd_politico; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY politico
    ADD CONSTRAINT pk_cd_politico PRIMARY KEY (cd_politico);


--
-- TOC entry 2035 (class 2606 OID 33408)
-- Name: pk_cd_publicacao; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY publicacao
    ADD CONSTRAINT pk_cd_publicacao PRIMARY KEY (cd_publicacao);


--
-- TOC entry 2037 (class 2606 OID 33406)
-- Name: pk_cd_usuario; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY usuario_comum
    ADD CONSTRAINT pk_cd_usuario PRIMARY KEY (cd_usuario);


--
-- TOC entry 2162 (class 0 OID 0)
-- Dependencies: 7
-- Name: public; Type: ACL; Schema: -; Owner: -
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2018-11-26 12:12:57 BRST

--
-- PostgreSQL database dump complete
--

