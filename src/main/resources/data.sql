insert into address (street_name, street_number)
values
('Svetozara Miletica', 23),
('Jovana Jovanovica', 10),
('Nikole Pasica', 45);

insert into product (barcode, count, type)
values
(123456, 230, 'food'),
(223456, 3, 'building material'),
(323456, 23, 'phones');

insert into storage (location)
values
('Belgrade'),
('Novi Sad'),
('Vranje');

insert into user (name, address_id, storage_id)
values
('Janko', 1, 1),
('Boris', 2, 1),
('Nikolina', 3, 3);


insert into user_products (user_id, products_id)
values
(1, 1),
(2, 1),
(3, 2);

# insert into users (title, content, created_on, updated_on)
# values
# ('Hello World!', 'First note in notes application', '2019-11-07 08:00:00', '2019-11-07 18:30:45')