-- Table: gamifycode.roles

-- DROP TABLE gamifycode.roles;

CREATE TABLE gamifycode.roles
(
  id_role SERIAL NOT NULL,
  role_name character varying(255) NOT NULL,
  CONSTRAINT roles_pkey PRIMARY KEY (id_role),
  CONSTRAINT role_name_unique UNIQUE (role_name)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE gamifycode.roles
  OWNER TO postgres;

-- INSERT DATA

INSERT INTO gamifycode.roles (role_name) VALUES ('ADMIN');
INSERT INTO gamifycode.roles (role_name) VALUES ('EDITOR');
INSERT INTO gamifycode.roles (role_name) VALUES ('CUSTOMER');