
insert into student
(name,surname) values
('Kerim','Selimov'),
('Gulay','Hesenova'),
('Alim','Ceferov'),
('Zumrud','Eliyeva');

insert into users 
(username,password,address,email,phone,enabled) values
('murad','{noop}1','Yasamal','murad@ru','05564',1),
('gulay','{bcrypt}$2a$12$LPFpSQRfsygHG4hiBdqvueaBqP9yK78dJnOe3qbQMumJF08ZsPMhO','Sumqayit','murad@ru','05564',1),
('rauf','{noop}1','Baki','murad@ru','05564',0);

insert into authorities
(username,authority) values
('murad','admin'),
('murad','students:find:all'),
('gulay','user'),
('gulay','students:find:by:id'),
('rauf','manager'),
('rauf','students:find:all');
