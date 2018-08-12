-- Table: gamifycode.posts

-- DROP TABLE gamifycode.posts;

CREATE TABLE gamifycode.posts
(
  id_post SERIAL NOT NULL,
  content character varying(255),
  title character varying(255),
  id_user_post integer,
  CONSTRAINT posts_pkey PRIMARY KEY (id_post),
  CONSTRAINT post_user_fk FOREIGN KEY (id_post)
      REFERENCES gamifycode.users (id_user) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE gamifycode.posts
  OWNER TO postgres;
