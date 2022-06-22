INSERT INTO users_info (user_info_id, user_info_name, user_info_surname, user_info_phone)
VALUES (1, 'Адиль', 'Мыктыбек', 77007777777);

INSERT INTO users_info (user_info_id, user_info_name, user_info_surname, user_info_phone)
VALUES (2, 'Уильям', 'Мясник', 77008888888);

INSERT INTO users_info (user_info_id, user_info_name, user_info_surname, user_info_phone)
VALUES (3, 'Джон', 'Хоумлендер', 77009999999);

--

INSERT INTO bank_cards (bank_card_id, user_info_id, bank_card_number, bank_card_expiration_year, bank_card_expiration_month, bank_card_owner, bank_card_cvv, bank_card_balance)
VALUES (1, 1, 5111111111115551, 2023, 03, 'ADIL MYKTYBEK', 073, 19000.37);

INSERT INTO bank_cards (bank_card_id, user_info_id, bank_card_number, bank_card_expiration_year, bank_card_expiration_month, bank_card_owner, bank_card_cvv, bank_card_balance)
VALUES (2, 2, 5111222277775552, 2022, 01, 'BILLY BUTCHER', 001, 5000.55);

INSERT INTO bank_cards (bank_card_id, user_info_id, bank_card_number, bank_card_expiration_year, bank_card_expiration_month, bank_card_owner, bank_card_cvv, bank_card_balance)
VALUES (3, 3, 5111333300005553, 2024, 06, 'JOHN HOMELANDER', 002, 2000.99);

--

INSERT INTO roles (role_id, role_name) VALUES (1, 'user');
INSERT INTO roles (role_id, role_name) VALUES (2, 'admin');

--

INSERT INTO users (user_id, user_info_id, role_id, user_email, user_password)
VALUES (1, 1, 2, 'taraza309@gmail.com',
        'c7ad44cbad762a5da0a452f9e854fdc1e0e7a52a38015f23f3eab1d80b931dd472634dfac71cd34ebc35d16ab7fb8a90c81f975113d6c7538dc69dd8de9077ec');

INSERT INTO users (user_id, user_info_id, role_id, user_email, user_password)
VALUES (2, 2, 1, 'william.butcher@mail.com',
        'b14361404c078ffd549c03db443c3fede2f3e534d73f78f77301ed97d4a436a9fd9db05ee8b325c0ad36438b43fec8510c204fc1c1edb21d0941c00e9e2c1ce2');

INSERT INTO users (user_id, user_info_id, role_id, user_email, user_password)
VALUES (3, 3, 1, 'john.homelander@mail.com',
        'b14361404c078ffd549c03db443c3fede2f3e534d73f78f77301ed97d4a436a9fd9db05ee8b325c0ad36438b43fec8510c204fc1c1edb21d0941c00e9e2c1ce2');

--

INSERT INTO user_orders (user_order_id, user_order_address, user_order_date, user_order_delivery_date, user_order_status_id)
VALUES (1, 'г. Алматы, проспект Аль-Фараби, 71/23', '2022-06-18', '2022-06-19', 4);

INSERT INTO user_orders (user_order_id, user_order_address, user_order_date, user_order_delivery_date, user_order_status_id)
VALUES (2, 'г. Астана, проспект Кабанбай батыр, 58Б', '2022-05-08', '2022-09-15', 3);

INSERT INTO user_orders (user_order_id, user_order_address, user_order_date, user_order_delivery_date, user_order_status_id)
VALUES (3, 'г. Тараз, микрорайон Самал, 26', '2022-06-14', '2022-06-15', 4);

INSERT INTO user_orders (user_order_id, user_order_address, user_order_date, user_order_delivery_date, user_order_status_id)
VALUES (4, 'г. Астана, проспект Кабанбай батыр, 58Б', '2022-06-22', '2022-07-15', 2);

INSERT INTO user_orders (user_order_id, user_order_address, user_order_date, user_order_delivery_date, user_order_status_id)
VALUES (5, 'г. Астана, проспект Кабанбай батыр, 58Б', '2022-06-23', '2022-07-12', 1);

--

INSERT INTO categories (category_id, category_name) VALUES (1, 'diapers');
INSERT INTO categories (category_id, category_name) VALUES (2, 'boy');
INSERT INTO categories (category_id, category_name) VALUES (3, 'girl');
INSERT INTO categories (category_id, category_name) VALUES (4, 'boy-baby');
INSERT INTO categories (category_id, category_name) VALUES (5, 'girl-baby');

--

INSERT INTO promotions (promotion_id, promotion_status, promotion_name, promotion_description,
                        promotion_discount_percent, promotion_beginning_date, promotion_expiration_date,
                        promotion_photo_path)
VALUES (1, FALSE, 'Sales!', 'Buy goods at a discount :)', 30, '2022-04-20',
        '2022-06-10', 'promotions/sale.jpg');

INSERT INTO promotions (promotion_id, promotion_status, promotion_name, promotion_description,
                        promotion_discount_percent, promotion_beginning_date, promotion_expiration_date,
                        promotion_photo_path)
VALUES (2, TRUE, 'Enough diapers for everyone!', 'Buy diapers at a discount :)', 20, '2022-06-20',
        '2022-08-20', 'promotions/diapers.jpg');

INSERT INTO promotions (promotion_id, promotion_status, promotion_name, promotion_description,
                        promotion_discount_percent, promotion_beginning_date, promotion_expiration_date,
                        promotion_photo_path)
VALUES (3, TRUE, 'Preparing boys for school', 'Buy goods for boys at a discount :)', 50, '2022-06-20',
        '2022-08-20', 'promotions/boys.jpg');

INSERT INTO promotions (promotion_id, promotion_status, promotion_name, promotion_description,
                        promotion_discount_percent, promotion_beginning_date, promotion_expiration_date,
                        promotion_photo_path)
VALUES (4, TRUE, 'Preparing girls for school', 'Buy goods for girls at a discount :)', 50, '2022-06-20',
        '2022-08-20', 'promotions/girls.jpg');

--

INSERT INTO products (product_id, category_id, promotion_id, product_name, product_description,
                      product_price, product_photo_path, product_orders_number)
VALUES (1, 1, 1, 'Huggies', 'Huggies is with you during every step of your journey into motherhood.', 1890,
        'diapers/Huggies.jpeg', 100);

INSERT INTO products (product_id, category_id, promotion_id, product_name, product_description,
                      product_price, product_photo_path, product_orders_number)
VALUES (2, 1, 1, 'Pampers', 'Pampers Swaddlers feature Dual Leak-Guard Barriers, Soft Flexi-Sides for a secure, comfortable fit.', 1690,
        'diapers/Pampers.jpg', 5);

INSERT INTO products (product_id, category_id, promotion_id, product_name, product_description,
                      product_price, product_photo_path, product_orders_number)
VALUES (3, 2, 3, 'BackpackBoys-Marvel', 'Avengers assemble!', 5090,
        'boys/Bbag1.jpg', 20);

INSERT INTO products (product_id, category_id, promotion_id, product_name, product_description,
                      product_price, product_photo_path, product_orders_number)
VALUES (4, 2, 3, 'BackpackBoys-CaptainAmerica', 'I have not seen "ice" in 10,000 years', 5090,
        'boys/Bbag2.jpg', 20);

INSERT INTO products (product_id, category_id, promotion_id, product_name, product_description,
                      product_price, product_photo_path, product_orders_number)
VALUES (5, 3, 4, 'BackpackGirls-SpaceTyson', 'Space', 5090,
        'girls/Gbag2.jpg', 20);

INSERT INTO products (product_id, category_id, promotion_id, product_name, product_description,
                      product_price, product_photo_path, product_orders_number)
VALUES (6, 3, 4, 'BackpackGirls-MonstersInc', 'MikeWazowski', 5090,
        'girls/Gbag1.jpg', 20);

--

INSERT INTO orders (order_id, order_number, user_id, user_order_id, product_id)
VALUES (1, 10, 3, 1, 1);

INSERT INTO orders (order_id, order_number, user_id, user_order_id, product_id)
VALUES (2, 1, 3, 2, 1);

INSERT INTO orders (order_id, order_number, user_id, user_order_id, product_id)
VALUES (3, 2, 3, 3, 2);

INSERT INTO orders (order_id, order_number, user_id, user_order_id, product_id)
VALUES (4, 1, 2, 4, 4);

INSERT INTO orders (order_id, order_number, user_id, user_order_id, product_id)
VALUES (5, 1, 1, 5, 5);