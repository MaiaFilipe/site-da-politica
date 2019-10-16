--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.7
-- Dumped by pg_dump version 9.5.7

-- Started on 2019-10-16 12:54:41 BRT

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12395)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2184 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 181 (class 1259 OID 58294)
-- Name: comentar; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE comentar (
    cd_comentar integer NOT NULL,
    cd_usuario_comum integer
);


ALTER TABLE comentar OWNER TO postgres;

--
-- TOC entry 182 (class 1259 OID 58300)
-- Name: curtir; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE curtir (
    cd_curtir integer NOT NULL,
    cd_usuario_comum integer
);


ALTER TABLE curtir OWNER TO postgres;

--
-- TOC entry 183 (class 1259 OID 58303)
-- Name: denuncia; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE denuncia (
    cd_denuncia integer NOT NULL,
    cd_publicacao integer,
    cd_usuario_comum integer,
    ds_descricao character varying(1000)
);


ALTER TABLE denuncia OWNER TO postgres;

--
-- TOC entry 184 (class 1259 OID 58309)
-- Name: publicacao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE publicacao (
    dt_data date,
    tm_horario time without time zone,
    cd_publicacao integer NOT NULL,
    fk_cd_usuario_comum integer
);


ALTER TABLE publicacao OWNER TO postgres;

--
-- TOC entry 185 (class 1259 OID 58315)
-- Name: seguir; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE seguir (
    cd_usuario_seguidor integer,
    cd_usuario_seguido integer,
    cd_seguir integer NOT NULL
);


ALTER TABLE seguir OWNER TO postgres;

--
-- TOC entry 186 (class 1259 OID 58318)
-- Name: sq_usuario; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_usuario
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 1000
    CACHE 1;


ALTER TABLE sq_usuario OWNER TO postgres;

--
-- TOC entry 187 (class 1259 OID 58326)
-- Name: usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE usuario (
    ds_usuario_comum character varying,
    nr_numero numeric NOT NULL,
    nr_cpf numeric,
    nm_senha character varying(50),
    ds_posicao text,
    nm_nick_name_comum character varying NOT NULL,
    cd_usuario_comum integer NOT NULL,
    ds_email character varying,
    nm_usuario_comum character varying,
    dt_nascimento character varying,
    nm_estado character varying,
    tipo_usuario character varying(20)
);


ALTER TABLE usuario OWNER TO postgres;

--
-- TOC entry 2170 (class 0 OID 58294)
-- Dependencies: 181
-- Data for Name: comentar; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY comentar (cd_comentar, cd_usuario_comum) FROM stdin;
\.


--
-- TOC entry 2171 (class 0 OID 58300)
-- Dependencies: 182
-- Data for Name: curtir; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY curtir (cd_curtir, cd_usuario_comum) FROM stdin;
\.


--
-- TOC entry 2172 (class 0 OID 58303)
-- Dependencies: 183
-- Data for Name: denuncia; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY denuncia (cd_denuncia, cd_publicacao, cd_usuario_comum, ds_descricao) FROM stdin;
\.


--
-- TOC entry 2173 (class 0 OID 58309)
-- Dependencies: 184
-- Data for Name: publicacao; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY publicacao (dt_data, tm_horario, cd_publicacao, fk_cd_usuario_comum) FROM stdin;
\.


--
-- TOC entry 2174 (class 0 OID 58315)
-- Dependencies: 185
-- Data for Name: seguir; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY seguir (cd_usuario_seguidor, cd_usuario_seguido, cd_seguir) FROM stdin;
\.


--
-- TOC entry 2185 (class 0 OID 0)
-- Dependencies: 186
-- Name: sq_usuario; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('sq_usuario', 2, true);


--
-- TOC entry 2176 (class 0 OID 58326)
-- Dependencies: 187
-- Data for Name: usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY usuario (ds_usuario_comum, nr_numero, nr_cpf, nm_senha, ds_posicao, nm_nick_name_comum, cd_usuario_comum, ds_email, nm_usuario_comum, dt_nascimento, nm_estado, tipo_usuario) FROM stdin;
\.


--
-- TOC entry 2042 (class 2606 OID 58341)
-- Name: pk_cd_comentar; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY comentar
    ADD CONSTRAINT pk_cd_comentar PRIMARY KEY (cd_comentar);


--
-- TOC entry 2044 (class 2606 OID 58345)
-- Name: pk_cd_curtir; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY curtir
    ADD CONSTRAINT pk_cd_curtir PRIMARY KEY (cd_curtir);


--
-- TOC entry 2047 (class 2606 OID 58347)
-- Name: pk_cd_denuncia; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY denuncia
    ADD CONSTRAINT pk_cd_denuncia PRIMARY KEY (cd_denuncia);


--
-- TOC entry 2050 (class 2606 OID 58349)
-- Name: pk_cd_publicacao; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY publicacao
    ADD CONSTRAINT pk_cd_publicacao PRIMARY KEY (cd_publicacao);


--
-- TOC entry 2052 (class 2606 OID 58353)
-- Name: pk_cd_seguir; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY seguir
    ADD CONSTRAINT pk_cd_seguir PRIMARY KEY (cd_seguir);


--
-- TOC entry 2054 (class 2606 OID 58357)
-- Name: pk_cd_usuario_comum; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY usuario
    ADD CONSTRAINT pk_cd_usuario_comum PRIMARY KEY (cd_usuario_comum);


--
-- TOC entry 2045 (class 1259 OID 58360)
-- Name: fki_cd_post; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_cd_post ON denuncia USING btree (cd_publicacao);


--
-- TOC entry 2048 (class 1259 OID 58362)
-- Name: fki_cd_usuario_comum; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_cd_usuario_comum ON publicacao USING btree (fk_cd_usuario_comum);


--
-- TOC entry 2055 (class 2606 OID 58369)
-- Name: fk_cd_usuario_comum; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY publicacao
    ADD CONSTRAINT fk_cd_usuario_comum FOREIGN KEY (fk_cd_usuario_comum) REFERENCES usuario(cd_usuario_comum);


--
-- TOC entry 2183 (class 0 OID 0)
-- Dependencies: 7
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2019-10-16 12:54:42 BRT

--
-- PostgreSQL database dump complete
--

