CREATE TABLE CUSTOMER(
ID BIGINT AUTO_INCREMENT PRIMARY KEY,
EMAIL VARCHAR(100) UNIQUE,
FIRST_NAME VARCHAR(50),
LAST_NAME VARCHAR(50),
AGE INT,
GENDER VARCHAR(6),
PAN_CARD_NBR VARCHAR(10),
DOB DATE,
MEM_EXPR_DATE DATE
);