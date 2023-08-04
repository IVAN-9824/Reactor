
CREATE TABLE type_id(id int PRIMARY KEY , type_id varchar(200));

CREATE TABLE users(id int PRIMARY KEY, type_id int, identification varchar(200), name varchar(200), FOREIGN KEY (type_id)
    REFERENCES type_id(Id));

CREATE TABLE product(id int PRIMARY KEY, valor int, product varchar(200));

CREATE TABLE buy(id int PRIMARY KEY, id_user int, id_product int, FOREIGN KEY (id_user) REFERENCES users(id),
FOREIGN KEY (id_product) REFERENCES product(id));


INSERT INTO type_id VALUES(1,'CC');
INSERT INTO type_id VALUES(2,'TI');
INSERT INTO type_id VALUES(3,'CE');
INSERT INTO type_id VALUES(4,'EX');

INSERT INTO users VALUES(1,1,'123455','Juan');
INSERT INTO users VALUES(2,2,'12345','Rosa');
INSERT INTO users VALUES(3,3,'123456','Jorge');
INSERT INTO users VALUES(4,4,'1234567','Laura');
INSERT INTO users VALUES(5,1,'123455','Valen');
INSERT INTO users VALUES(6,2,'12345','Rosa');
INSERT INTO users VALUES(7,3,'123456','Jorge');
INSERT INTO users VALUES(8,4,'1234567','Laura');

INSERT INTO product VALUES(1,123455,'Credito');
INSERT INTO product VALUES(2,12345,'Prestamo');
INSERT INTO product VALUES(3,1235,'Ahorros');

INSERT INTO buy VALUES(1,1,2);
INSERT INTO buy VALUES(2,2,1);
INSERT INTO buy VALUES(3,2,2);
INSERT INTO buy VALUES(4,3,3);