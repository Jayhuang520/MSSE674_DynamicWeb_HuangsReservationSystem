#create database huangshotel;

#drop table location;
use huangshotel;

CREATE TABLE customer(
	idCustomer INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
    lastName VARCHAR(20) NULL,
    firstName VARCHAR(20) NULL,
    userName VARCHAR(20) NULL,
    passWord VARCHAR(20) NULL,
    birthday VARCHAR(20) NULL,
    cardType VARCHAR(20) NULL,
    cardNumber VARCHAR(20) NULL,
    expDate VARCHAR(20) NULL,
    cvv VARCHAR(20) NULL,
    PRIMARY KEY(idCustomer)
);

SELECT * from customer;

UPDATE customer
set lastName = 'huang',
firstName = 'jay',
userName = 'jayhuang',
passWord = '123456',
birthday = '08/18/1994',
cardType = 'Discover',
cardNumber = '1111-2222-3333-4444',
expDate = '08/28',
cvv = '123'
WHERE idCustomer = 1;

INSERT INTO huangshotel.customer (lastName,firstName,userName,passWord,birthday,cardType,cardNumber,expDate,cvv) VALUES(
"huang", "jay", "jayhuang", "123456", "08/18/1994","Discover","1111-2222-3333-4444","08/28","123");