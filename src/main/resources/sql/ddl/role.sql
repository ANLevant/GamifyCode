-- Table: gamifycode.roles

-- DROP TABLE gamifycode.roles;

CREATE TABLE escaladaeveryday.roles
(
  id_role integer NOT NULL,
  role_name character varying(255) NOT NULL,
  CONSTRAINT roles_pkey PRIMARY KEY (id_role),
  CONSTRAINT role_name_unique UNIQUE (role_name)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE escaladaeveryday.roles
  OWNER TO postgres;
