-- Table: gamifycode.users

-- DROP TABLE gamifycode.users;

CREATE TABLE gamifycode.users
(
  id_user integer NOT NULL,
  email character varying(255) NOT NULL,
  name character varying(255) NOT NULL,
  password character varying(255) NOT NULL,
  username character varying(255) NOT NULL,
  CONSTRAINT users_pkey PRIMARY KEY (id_user),
  CONSTRAINT email_unique UNIQUE (email),
  CONSTRAINT username_unique UNIQUE (username)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE gamifycode.users
  OWNER TO postgres;
