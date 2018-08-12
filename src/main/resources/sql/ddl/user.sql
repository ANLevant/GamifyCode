-- Table: gamifycode.users

-- DROP TABLE gamifycode.users;

CREATE TABLE gamifycode.users
(
  id_user SERIAL NOT NULL,
  email character varying(255) NOT NULL,
  name character varying(255) NOT NULL,
  password character varying(255) NOT NULL,
  username character varying(255) NOT NULL,
  id_role_user integer NOT NULL,
  CONSTRAINT users_pkey PRIMARY KEY (id_user),
  CONSTRAINT user_role_fk FOREIGN KEY (id_role_user)
      REFERENCES gamifycode.roles (id_role) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE gamifycode.users
  OWNER TO postgres;

INSERT INTO gamifycode.users (email, name, password, username, id_role_user) VALUES ('levant.alejandro@hotmail.com', 'Alejandro Serrano', 'Azakura1213', 'ANLevant', 1);