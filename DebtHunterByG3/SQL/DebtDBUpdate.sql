DROP TABLE debts;
DROP TABLE paymenthistory;
DROP TABLE users;


CREATE TABLE debts (
    debt_id      INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
    debt_name    VARCHAR(40) NOT NULL,
    debtor_mail  VARCHAR(40) NOT NULL,
    description  VARCHAR(200) NOT NULL,
    cost         INTEGER NOT NULL,
    users_id     INTEGER
);

ALTER TABLE debts ADD CONSTRAINT debts_pk PRIMARY KEY ( debt_id );

CREATE TABLE debts (
    debt_id      INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
    debt_name    VARCHAR(40) NOT NULL,
    debtor_mail  VARCHAR(40) NOT NULL,
    description  VARCHAR(200) NOT NULL,
    cost         INTEGER NOT NULL,
    users_id     INTEGER
);

ALTER TABLE debts ADD CONSTRAINT debts_pk PRIMARY KEY ( debt_id );

CREATE TABLE paymenthistory (
    payment_id     INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
    cost           VARCHAR(40) NOT NULL,
    debts_debt_id  INTEGER
);

ALTER TABLE paymenthistory ADD CONSTRAINT paymenthistory_pk PRIMARY KEY ( payment_id );

CREATE TABLE users (
    id         INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
    email      VARCHAR(40) NOT NULL,
    password   VARCHAR(40) NOT NULL,
    firstname  VARCHAR(40) NOT NULL,
    lastname   VARCHAR(40) NOT NULL,
    tel        VARCHAR(10) NOT NULL
);

ALTER TABLE users ADD CONSTRAINT users_pk PRIMARY KEY ( id );

ALTER TABLE debts
    ADD CONSTRAINT debts_users_fk FOREIGN KEY ( users_id )
        REFERENCES users ( id );

ALTER TABLE paymenthistory
    ADD CONSTRAINT paymenthistory_debts_fk FOREIGN KEY ( debts_debt_id )
        REFERENCES debts ( debt_id );

CREATE TABLE paiddebts (
    paid_id      INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
    paid_name    VARCHAR(40) NOT NULL,
    paid_mail  VARCHAR(40) NOT NULL,
    paid_description  VARCHAR(200) NOT NULL,
    paid_cost         INTEGER NOT NULL,
    users_id     INTEGER         
);

ALTER TABLE paiddebts ADD CONSTRAINT paiddebts_pk PRIMARY KEY ( paid_id );

ALTER TABLE paiddebts
    ADD CONSTRAINT paiddebts_users_fk FOREIGN KEY ( users_id )
        REFERENCES users ( id );