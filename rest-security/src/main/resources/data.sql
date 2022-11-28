
insert into student
(name,surname) values
('Kerim','Selimov'),
('Gulay','Hesenova'),
('Alim','Ceferov'),
('Zumrud','Eliyeva');

insert into users 
(username,password,enabled) values
('murad','{noop}1',1),
('gulay','{bcrypt}$2a$12$LPFpSQRfsygHG4hiBdqvueaBqP9yK78dJnOe3qbQMumJF08ZsPMhO',1),
('rauf','{noop}1',0);

insert into authorities
(username,authority) values
('murad','admin'),
('murad','students:find:all'),
('gulay','user'),
('gulay','students:find:by:id'),
('rauf','manager'),
('rauf','students:find:all');
