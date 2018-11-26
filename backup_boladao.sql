--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.7
-- Dumped by pg_dump version 9.5.7

-- Started on 2018-11-26 11:12:01 BRST

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
-- TOC entry 2161 (class 0 OID 0)
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
    nm_nick_politico name NOT NULL
);


--
-- TOC entry 182 (class 1259 OID 33380)
-- Name: publicacao; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE publicacao (
    nr_curtidas numeric,
    nr_comentarios numeric,
    nr_compartilhamentos numeric,
    nr_descurtidas numeric,
    dt_data date,
    tm_horario time without time zone
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
    nr_nascimento numeric(8,8),
    ds_posicao text,
    nm_usuario name,
    nm_nick_name name NOT NULL
);


--
-- TOC entry 2150 (class 0 OID 33374)
-- Dependencies: 181
-- Data for Name: politico; Type: TABLE DATA; Schema: public; Owner: -
--

COPY politico (nm_nome_politico, nr_cpf, ds_email, ds_usuario, nm_senha, nm_nick_politico) FROM stdin;
\.


--
-- TOC entry 2151 (class 0 OID 33380)
-- Dependencies: 182
-- Data for Name: publicacao; Type: TABLE DATA; Schema: public; Owner: -
--

COPY publicacao (nr_curtidas, nr_comentarios, nr_compartilhamentos, nr_descurtidas, dt_data, tm_horario) FROM stdin;
\.


--
-- TOC entry 2152 (class 0 OID 33386)
-- Dependencies: 183
-- Data for Name: usuario_adm; Type: TABLE DATA; Schema: public; Owner: -
--

COPY usuario_adm  FROM stdin;
\.


--
-- TOC entry 2153 (class 0 OID 33389)
-- Dependencies: 184
-- Data for Name: usuario_comum; Type: TABLE DATA; Schema: public; Owner: -
--

COPY usuario_comum (ds_email, ds_usuario, nr_numero, nr_cpf, nm_senha, nr_nascimento, ds_posicao, nm_usuario, nm_nick_name) FROM stdin;
\.


--
-- TOC entry 2035 (class 2606 OID 33396)
-- Name: pk_nm_nick_name; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY usuario_comum
    ADD CONSTRAINT pk_nm_nick_name PRIMARY KEY (nm_nick_name);


--
-- TOC entry 2033 (class 2606 OID 33398)
-- Name: pk_nm_nick_politico; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY politico
    ADD CONSTRAINT pk_nm_nick_politico PRIMARY KEY (nm_nick_politico);


--
-- TOC entry 2160 (class 0 OID 0)
-- Dependencies: 7
-- Name: public; Type: ACL; Schema: -; Owner: -
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2018-11-26 11:12:01 BRST

--
-- PostgreSQL database dump complete
--

