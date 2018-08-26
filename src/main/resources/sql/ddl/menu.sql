-- Table: gamifycode.menu

-- DROP TABLE gamifycode.menu;

CREATE TABLE gamifycode.menu
(
    id_menu_item SERIAL NOT NULL,
    text_menu_item character varying(255) NOT NULL,
    link_menu_item character varying(255) NOT NULL,
    icon_menu_item character varying(255) ,
    id_role_restriction_menu_item integer[],
    CONSTRAINT menu_pkey PRIMARY KEY (id_menu_item)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE gamifycode.menu
    OWNER to postgres;

-- INSERT DATA

INSERT INTO gamifycode.menu (text_menu_item, link_menu_item, id_role_restriction_menu_item) VALUES ('Administrative Module', '/administrative', 'admin.png', '{1}');
INSERT INTO gamifycode.menu (text_menu_item, link_menu_item, id_role_restriction_menu_item) VALUES ('News Section', '/news', 'news.jpg', '{1,2,3}');
INSERT INTO gamifycode.menu (text_menu_item, link_menu_item, id_role_restriction_menu_item) VALUES ('Post an entry', '/post', 'post.png', '{1,2}');