/* Create a table called NAMES */
CREATE TABLE typeid(Id integer PRIMARY KEY , typeId text);
CREATE TABLE user(Id integer PRIMARY KEY, typeId integer, identification text, name text, FOREIGN KEY (typeId)
    REFERENCES typeid(id));
CREATE TABLE product(Id integer PRIMARY KEY, value integer, product text);
CREATE TABLE buy(Id integer PRIMARY KEY, idUser integer, idProduct integer, FOREIGN KEY (idUser) REFERENCES user(id),
FOREIGN KEY (idProduct) REFERENCES product(id));

/* crear datos*/

INSERT INTO typeid VALUES(1,'CC');
INSERT INTO typeid VALUES(2,'TI');
INSERT INTO typeid VALUES(3,'CE');
INSERT INTO typeid VALUES(4,'EX');

INSERT INTO user VALUES(1,1,'123455','Juan');
INSERT INTO user VALUES(2,2,'12345','Rosa');
INSERT INTO user VALUES(3,3,'123456','Jorge');
INSERT INTO user VALUES(4,4,'1234567','Laura');
INSERT INTO user VALUES(5,1,'123455','Valen');
INSERT INTO user VALUES(6,2,'12345','Rosa');
INSERT INTO user VALUES(7,3,'123456','Jorge');
INSERT INTO user VALUES(8,4,'1234567','Laura');

INSERT INTO product VALUES(1,123455,'Credito');
INSERT INTO product VALUES(2,12345,'Prestamo');
INSERT INTO product VALUES(3,1235,'Ahorros');

INSERT INTO buy VALUES(1,1,2);
INSERT INTO buy VALUES(2,2,1);
INSERT INTO buy VALUES(3,2,2);
INSERT INTO buy VALUES(4,3,3);