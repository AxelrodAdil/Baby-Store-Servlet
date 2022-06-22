CREATE TABLE valid_order_status (
    valid_order_status_id BIGINT NOT NULL PRIMARY KEY,
    valid_order_status_name VARCHAR(100) NOT NULL
);

CREATE SEQUENCE valid_order_status_seq START WITH 1;

INSERT INTO valid_order_status (valid_order_status_id, valid_order_status_name)
VALUES (1, 'RECEIVED');
INSERT INTO valid_order_status (valid_order_status_id, valid_order_status_name)
VALUES (2, 'PROGRESS');
INSERT INTO valid_order_status (valid_order_status_id, valid_order_status_name)
VALUES (3, 'DELIVERY');
INSERT INTO valid_order_status (valid_order_status_id, valid_order_status_name)
VALUES (4, 'COMPLETED');

--

CREATE TABLE IF NOT EXISTS users_info
(
    user_info_id BIGINT NOT NULL PRIMARY KEY,
    user_info_name VARCHAR(73),
    user_info_surname VARCHAR(73),
    user_info_phone BIGINT NOT NULL
);

CREATE SEQUENCE users_info_seq START WITH 1;

--

CREATE TABLE IF NOT EXISTS bank_cards
(
    bank_card_id BIGINT NOT NULL PRIMARY KEY,
    user_info_id BIGINT REFERENCES users_info(user_info_id),
    bank_card_number BIGINT NOT NULL UNIQUE,
    bank_card_expiration_year BIGINT NOT NULL,
    bank_card_expiration_month BIGINT NOT NULL,
    bank_card_owner VARCHAR(100) NOT NULL,
    bank_card_cvv BIGINT NOT NULL,
    bank_card_balance FLOAT8 NOT NULL
);

CREATE SEQUENCE bank_cards_seq START WITH 1;

CREATE INDEX users_info_ref_idx ON bank_cards(user_info_id);

--

CREATE TABLE IF NOT EXISTS roles
(
    role_id BIGINT NOT NULL PRIMARY KEY,
    role_name VARCHAR(25) NOT NULL
);

CREATE SEQUENCE roles_seq START WITH 1;

--

CREATE TABLE IF NOT EXISTS users
(
    user_id BIGINT NOT NULL PRIMARY KEY,
    user_info_id BIGINT REFERENCES users_info(user_info_id),
    role_id BIGINT REFERENCES roles(role_id),
    user_email VARCHAR(100) NOT NULL UNIQUE,
    user_password VARCHAR(150) NOT NULL,
    user_status BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE SEQUENCE users_seq START WITH 1;

CREATE INDEX roles_ref_idx ON users(role_id);

--

CREATE TABLE IF NOT EXISTS user_orders
(
    user_order_id BIGINT NOT NULL PRIMARY KEY,
    user_order_address VARCHAR(300) NOT NULL,
    user_order_date DATE NOT NULL,
    user_order_delivery_date DATE NOT NULL,
    user_order_status_id BIGINT REFERENCES valid_order_status(valid_order_status_id)
);

CREATE SEQUENCE user_orders_seq START WITH 1;

CREATE INDEX valid_order_status_ref_idx ON user_orders(user_order_status_id);

--

CREATE TABLE IF NOT EXISTS categories
(
    category_id BIGINT NOT NULL PRIMARY KEY,
    category_name VARCHAR(100) NOT NULL UNIQUE
);

CREATE SEQUENCE categories_seq START WITH 1;

--

CREATE TABLE IF NOT EXISTS promotions
(
    promotion_id BIGINT NOT NULL PRIMARY KEY,
    promotion_status BOOLEAN NOT NULL,
    promotion_name VARCHAR(100) NOT NULL,
    promotion_description VARCHAR(3000),
    promotion_discount_percent BIGINT NOT NULL,
    promotion_beginning_date DATE NOT NULL,
    promotion_expiration_date DATE NOT NULL,
    promotion_photo_path VARCHAR(150) NOT NULL
);

CREATE SEQUENCE promotions_seq START WITH 1;

--

CREATE TABLE IF NOT EXISTS products
(
    product_id BIGINT NOT NULL PRIMARY KEY,
    category_id BIGINT REFERENCES categories(category_id),
    promotion_id BIGINT REFERENCES promotions(promotion_id),
    product_name VARCHAR(100) NOT NULL UNIQUE,
    product_description VARCHAR(3000),
    product_price FLOAT8 NOT NULL,
    product_status BOOLEAN NOT NULL DEFAULT TRUE,
    product_photo_path VARCHAR(150) NOT NULL,
    product_orders_number BIGINT NOT NULL
);

CREATE SEQUENCE products_seq START WITH 1;

CREATE INDEX categories_ref_idx ON products(category_id);
CREATE INDEX promotions_ref_idx ON products(promotion_id);

--

CREATE TABLE IF NOT EXISTS orders
(
    order_id BIGINT NOT NULL PRIMARY KEY,
    order_number BIGINT NOT NULL,
    user_id BIGINT REFERENCES users(user_id),
    user_order_id BIGINT REFERENCES user_orders(user_order_id),
    product_id BIGINT REFERENCES products(product_id)
);

CREATE SEQUENCE orders_seq START WITH 1;

CREATE INDEX users_ref_idx ON orders(user_id);
CREATE INDEX user_orders_ref_idx ON orders(user_order_id);
CREATE INDEX products_ref_idx ON orders(product_id);
