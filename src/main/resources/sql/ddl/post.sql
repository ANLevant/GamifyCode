-- Table: gamifycode.posts

-- DROP TABLE gamifycode.posts;

CREATE TABLE gamifycode.posts
(
  id_post integer NOT NULL,
  content character varying(255) NOT NULL,
  title character varying(255) NOT NULL,
  CONSTRAINT posts_pkey PRIMARY KEY (id_post),
  CONSTRAINT content_unique UNIQUE (content),
  CONSTRAINT title_unique UNIQUE (title)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE gamifycode.posts
  OWNER TO postgres;
