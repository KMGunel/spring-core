CREATE TABLE computers (
  id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  brand varchar(45) ,
  price double
); 

insert into computers
(brand,price) values
('Dell','1500'),
('Acer','1200'),
('Asus','1100'),
('MacAir','1800'),
('Honor','1000');