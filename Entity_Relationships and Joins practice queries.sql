use kmss
create table state
(
	stateid int primary key, 
    statename varchar(40),
    statecode varchar(10)
);
create table user
(
	userid int primary key,
    username varchar(40),
    email varchar(40),
    stid int , foreign key (stid) references state (stateid)
);
insert into state values(1, "AndhraPradesh", "AP"), (2, "Telangana", "TG"), (3, "MadhyaPradesh", "MP"),
 (4, "Maharastra", "MH"), (5, "Karnataka", "KA");
 select * from state
 insert into user values(1001, "Suresh", "suresh@s.com", 2), (1002, "Rambabu", "rambabu@r.com", 1),
 (1003, "Priya", "priya@p.com", 4), (1004, "Harish", "harish@h.com", 3), (1005, "John", "john@j.com", 4),
 (1006, "Mary", "mary@m.com", 2), (1007, "Tom", "tom@t.com", null), (1008, "Sara", "sara@s.com", null)
 
select * from state
 select * from user
 
 select * from user join state on user.stid = state.stateid
 select * from state join user on stateid = user.stid
 select username, email, statename from user join state on user.stid = state.stateid
 select * from user left join state on user.stid = state.stateid
 select * from state left join user on state.stateid = user.stid
 select username, email, statename from user left join state on user.stid = state.stateid
 select statename, statecode, username from state left join user on state.stateid = user.stid
 select * from state right outer join user on state.stateid = user.stid
 select username, email, statecode from user right join state on user.stid = state.stateid
 select * from user full join state on user.stid = state.stateid
  select * from user left join state on user.stid = state.stateid
  union
    select * from user right join state on user.stid = state.stateid

create table person 
(
	personid int primary key,
    name varchar(50),
    dob date,
    gender char
);
desc person
create table aadhar
(
	aadharid int primary key,
    aadharnumber varchar(12) unique,
    issuedate date,
    person_id int, foreign key (person_id) references person(personid)
);
desc aadhar
insert into person values (1, "Nani", '1990-05-15', 'M'), (2, "Arjun", '1985-02-06', 'M'),
(3, "Shreya", '1999-06-03', 'F')

insert into aadhar values(101, '123456789012', '2020-01-01', 1), (102, '987654321098', '2019-05-10', 2),
(103,'456123789456', '2018-11-20', 3);
insert into aadhar values(104, '123456789012', '2020-01-12', 2)

select * from person
select* from aadhar
alter table aadhar add constraint u_aadharnumber unique (aadharnumber)

select personid, name, dob, gender , aadharnumber,  issuedate from person join aadhar on 
person.personid = aadhar.person_id

select * from person left join aadhar on person.personid = aadhar.person_id

CREATE TABLE Customer (
    Customer_ID INT PRIMARY KEY,
    Name VARCHAR(50),
    Email VARCHAR(100),
    Phone VARCHAR(20)
);

CREATE TABLE Product (
    Order_ID INT PRIMARY KEY,
    Customer_ID INT,
    Product_Name VARCHAR(50),
    Quantity INT,
    FOREIGN KEY (Customer_ID) REFERENCES Customer(Customer_ID)
);

insert into Customer (Customer_ID, Name, Email, Phone)
VALUES (1, 'Ajay', 'ajay@.com', '9515149193'), (2, 'Arja', 'arya@.com', '9160747407'),
    (3, 'Geetha', 'geetha@.com', '6304830930');
    
  

insert into Product (Order_ID, Customer_ID, Product_Name, Quantity)
values (101, 1, 'Laptop', 1), (102, 1, 'Smartphone', 2), (103, 2, 'Tablet', 1), (104, 3, 'Headphones', 1);

select * from 
select*from Product

insert into Product (Order_ID, Customer_ID, Product_Name, Quantity)
values (106, 2, 'T-shirts', 2);

SELECT Customer_ID, Order_ID, Product_Name, Quantity FROM Customer JOIN Product 
ON Customer.Customer_ID = Customer.Customer_ID;

create table contact (
	contactid int primary key,
    contactname varchar(50) unique,
    email varchar(40)
);

insert into contact (contactid, contactname, email)
values (1, 'Charan', 'charan@gmail.com'),(2, 'Karunya', 'karunya@gmail.com'),
 (3, 'Shreya Goshal', 'shreya@gmail.com');
    
    
create table instagram(
	instaid int primary key,
    instaname varchar(40) unique
);

insert into instagram (instaid, instaname)
values (101, 'charan_singer'), (102, 'karunya_music'),
(103, 'shreyas_voice');

create table  Contact_Instagram (
    
    primary key (contactid, instaid),
    contactid int, foreign key (contactid) references Contact(contactid),
    instaid int, foreign key (instaid) references Instagram(instaid)
);

insert into Contact_Instagram (contactid, instaid)
values (1, 101), (2, 102), (3, 103); 
select * from contact
select * from instagram
select * from Contact_Instagram


 