--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.7
-- Dumped by pg_dump version 9.5.7

-- Started on 2019-09-19 10:27:57 BRT

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
-- TOC entry 2225 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 181 (class 1259 OID 16653)
-- Name: banir; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE banir (
    "cd_ usuario_adm" integer,
    cd_usuario_comum integer,
    cd_usuario_politico integer,
    cd_banir integer NOT NULL
);


ALTER TABLE banir OWNER TO postgres;

--
-- TOC entry 182 (class 1259 OID 16656)
-- Name: comentar; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE comentar (
    cd_comentar integer NOT NULL,
    cd_usuario_adm integer,
    cd_usuario_politico integer,
    cd_usuario_comum integer
);


ALTER TABLE comentar OWNER TO postgres;

--
-- TOC entry 183 (class 1259 OID 16659)
-- Name: compartilhar; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE compartilhar (
    cd_compartilhar integer NOT NULL,
    cd_usuario_comum integer,
    cd_usuario_adm integer,
    cd_usuario_politica integer,
    tm_horario time with time zone,
    dt_data date
);


ALTER TABLE compartilhar OWNER TO postgres;

--
-- TOC entry 184 (class 1259 OID 16662)
-- Name: curtir; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE curtir (
    cd_curtir integer NOT NULL,
    cd_usuario_comum integer,
    cd_usuario_adm integer,
    cd_usuario_politico integer
);


ALTER TABLE curtir OWNER TO postgres;

--
-- TOC entry 185 (class 1259 OID 16665)
-- Name: denuncia; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE denuncia (
    cd_denuncia integer NOT NULL,
    cd_publicacao integer,
    cd_usuario_comum integer,
    cd_usuario_adm integer,
    ds_descricao character varying(1000),
    cd_usuario_politico integer
);


ALTER TABLE denuncia OWNER TO postgres;

--
-- TOC entry 186 (class 1259 OID 16671)
-- Name: publicacao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE publicacao (
    dt_data date,
    tm_horario time without time zone,
    cd_publicacao integer NOT NULL,
    fk_cd_usuario_politico integer,
    fk_cd_usuario_comum integer,
    fk_cd_usuario_adm integer
);


ALTER TABLE publicacao OWNER TO postgres;

--
-- TOC entry 187 (class 1259 OID 16674)
-- Name: responder; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE responder (
    cd_resposta integer NOT NULL,
    cd_usuario_comum integer,
    cd_usuario_politico integer,
    cd_usuario_adm integer,
    ds_resposta integer
);


ALTER TABLE responder OWNER TO postgres;

--
-- TOC entry 188 (class 1259 OID 16677)
-- Name: seguir; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE seguir (
    cd_usuario_comum integer,
    cd_usuario_adm integer,
    cd_usuario_politico integer,
    cd_seguir integer NOT NULL
);


ALTER TABLE seguir OWNER TO postgres;

--
-- TOC entry 192 (class 1259 OID 16741)
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
-- TOC entry 189 (class 1259 OID 16682)
-- Name: usuario_adm; Type: TABLE; Schema: public; Owner: postgres
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
    dt_nascimento date
);


ALTER TABLE usuario_adm OWNER TO postgres;

--
-- TOC entry 190 (class 1259 OID 16688)
-- Name: usuario_comum; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE usuario_comum (
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
    nm_estado character varying
);


ALTER TABLE usuario_comum OWNER TO postgres;

--
-- TOC entry 191 (class 1259 OID 16694)
-- Name: usuario_politico; Type: TABLE; Schema: public; Owner: postgres
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


ALTER TABLE usuario_politico OWNER TO postgres;

--
-- TOC entry 2206 (class 0 OID 16653)
-- Dependencies: 181
-- Data for Name: banir; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY banir ("cd_ usuario_adm", cd_usuario_comum, cd_usuario_politico, cd_banir) FROM stdin;
\.


--
-- TOC entry 2207 (class 0 OID 16656)
-- Dependencies: 182
-- Data for Name: comentar; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY comentar (cd_comentar, cd_usuario_adm, cd_usuario_politico, cd_usuario_comum) FROM stdin;
\.


--
-- TOC entry 2208 (class 0 OID 16659)
-- Dependencies: 183
-- Data for Name: compartilhar; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY compartilhar (cd_compartilhar, cd_usuario_comum, cd_usuario_adm, cd_usuario_politica, tm_horario, dt_data) FROM stdin;
\.


--
-- TOC entry 2209 (class 0 OID 16662)
-- Dependencies: 184
-- Data for Name: curtir; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY curtir (cd_curtir, cd_usuario_comum, cd_usuario_adm, cd_usuario_politico) FROM stdin;
\.


--
-- TOC entry 2210 (class 0 OID 16665)
-- Dependencies: 185
-- Data for Name: denuncia; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY denuncia (cd_denuncia, cd_publicacao, cd_usuario_comum, cd_usuario_adm, ds_descricao, cd_usuario_politico) FROM stdin;
\.


--
-- TOC entry 2211 (class 0 OID 16671)
-- Dependencies: 186
-- Data for Name: publicacao; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY publicacao (dt_data, tm_horario, cd_publicacao, fk_cd_usuario_politico, fk_cd_usuario_comum, fk_cd_usuario_adm) FROM stdin;
\.


--
-- TOC entry 2212 (class 0 OID 16674)
-- Dependencies: 187
-- Data for Name: responder; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY responder (cd_resposta, cd_usuario_comum, cd_usuario_politico, cd_usuario_adm, ds_resposta) FROM stdin;
\.


--
-- TOC entry 2213 (class 0 OID 16677)
-- Dependencies: 188
-- Data for Name: seguir; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY seguir (cd_usuario_comum, cd_usuario_adm, cd_usuario_politico, cd_seguir) FROM stdin;
\.


--
-- TOC entry 2226 (class 0 OID 0)
-- Dependencies: 192
-- Name: sq_usuario; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('sq_usuario', 2, true);


--
-- TOC entry 2214 (class 0 OID 16682)
-- Dependencies: 189
-- Data for Name: usuario_adm; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY usuario_adm (ds_email, ds_usuario_adm, nr_numero, nr_cpf, nm_senha, ds_posicao_politica, nm_usuario_adm, nm_nick_name_adm, cd_usuario_adm, dt_nascimento) FROM stdin;
\.


--
-- TOC entry 2215 (class 0 OID 16688)
-- Dependencies: 190
-- Data for Name: usuario_comum; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY usuario_comum (ds_usuario_comum, nr_numero, nr_cpf, nm_senha, ds_posicao, nm_nick_name_comum, cd_usuario_comum, ds_email, nm_usuario_comum, dt_nascimento, nm_estado) FROM stdin;
descriÃ§Ã£o	312312312312	12312312312	123	esquerda	filipin	53	lfilipesmaia@gmail.com	Filipe	2002-03-25	RJ
ad	2312312312313	12132123123	123	direita	asd	50	ad	asd	2002-03-25	AC
ad	2312312312313	12132123123	123	direita	asd	100	ad	asd	2002-03-25	AC
\.


--
-- TOC entry 2216 (class 0 OID 16694)
-- Dependencies: 191
-- Data for Name: usuario_politico; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY usuario_politico (nm_usuario_politico, nr_cpf, ds_email, ds_usuario_politico, nm_senha, nm_nick_politico, cd_usuario_politico, ds_posicao_politica) FROM stdin;
\.


--
-- TOC entry 2064 (class 2606 OID 16701)
-- Name: pk_cd_banir; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY banir
    ADD CONSTRAINT pk_cd_banir PRIMARY KEY (cd_banir);


--
-- TOC entry 2066 (class 2606 OID 16703)
-- Name: pk_cd_comentar; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY comentar
    ADD CONSTRAINT pk_cd_comentar PRIMARY KEY (cd_comentar);


--
-- TOC entry 2068 (class 2606 OID 16705)
-- Name: pk_cd_compartilhar; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY compartilhar
    ADD CONSTRAINT pk_cd_compartilhar PRIMARY KEY (cd_compartilhar);


--
-- TOC entry 2070 (class 2606 OID 16707)
-- Name: pk_cd_curtir; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY curtir
    ADD CONSTRAINT pk_cd_curtir PRIMARY KEY (cd_curtir);


--
-- TOC entry 2073 (class 2606 OID 16709)
-- Name: pk_cd_denuncia; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY denuncia
    ADD CONSTRAINT pk_cd_denuncia PRIMARY KEY (cd_denuncia);


--
-- TOC entry 2078 (class 2606 OID 16711)
-- Name: pk_cd_publicacao; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY publicacao
    ADD CONSTRAINT pk_cd_publicacao PRIMARY KEY (cd_publicacao);


--
-- TOC entry 2080 (class 2606 OID 16713)
-- Name: pk_cd_resposta; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY responder
    ADD CONSTRAINT pk_cd_resposta PRIMARY KEY (cd_resposta);


--
-- TOC entry 2082 (class 2606 OID 16715)
-- Name: pk_cd_seguir; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY seguir
    ADD CONSTRAINT pk_cd_seguir PRIMARY KEY (cd_seguir);


--
-- TOC entry 2084 (class 2606 OID 16717)
-- Name: pk_cd_usuario_adm; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY usuario_adm
    ADD CONSTRAINT pk_cd_usuario_adm PRIMARY KEY (cd_usuario_adm);


--
-- TOC entry 2086 (class 2606 OID 16719)
-- Name: pk_cd_usuario_comum; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY usuario_comum
    ADD CONSTRAINT pk_cd_usuario_comum PRIMARY KEY (cd_usuario_comum);


--
-- TOC entry 2088 (class 2606 OID 16721)
-- Name: pk_cd_usuario_politico; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY usuario_politico
    ADD CONSTRAINT pk_cd_usuario_politico PRIMARY KEY (cd_usuario_politico);


--
-- TOC entry 2071 (class 1259 OID 16722)
-- Name: fki_cd_post; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_cd_post ON denuncia USING btree (cd_publicacao);


--
-- TOC entry 2074 (class 1259 OID 16723)
-- Name: fki_cd_usuario_adm; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_cd_usuario_adm ON publicacao USING btree (fk_cd_usuario_adm);


--
-- TOC entry 2075 (class 1259 OID 16724)
-- Name: fki_cd_usuario_comum; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_cd_usuario_comum ON publicacao USING btree (fk_cd_usuario_comum);


--
-- TOC entry 2076 (class 1259 OID 16725)
-- Name: fki_cd_usuario_politico; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_cd_usuario_politico ON publicacao USING btree (fk_cd_usuario_politico);


--
-- TOC entry 2089 (class 2606 OID 16726)
-- Name: fk_cd_usuario_adm; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY publicacao
    ADD CONSTRAINT fk_cd_usuario_adm FOREIGN KEY (fk_cd_usuario_adm) REFERENCES usuario_adm(cd_usuario_adm);


--
-- TOC entry 2090 (class 2606 OID 16731)
-- Name: fk_cd_usuario_comum; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY publicacao
    ADD CONSTRAINT fk_cd_usuario_comum FOREIGN KEY (fk_cd_usuario_comum) REFERENCES usuario_comum(cd_usuario_comum);


--
-- TOC entry 2091 (class 2606 OID 16736)
-- Name: fk_cd_usuario_politico; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY publicacao
    ADD CONSTRAINT fk_cd_usuario_politico FOREIGN KEY (fk_cd_usuario_politico) REFERENCES usuario_politico(cd_usuario_politico);


--
-- TOC entry 2224 (class 0 OID 0)
-- Dependencies: 7
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2019-09-19 10:27:59 BRT

--
-- PostgreSQL database dump complete
--

