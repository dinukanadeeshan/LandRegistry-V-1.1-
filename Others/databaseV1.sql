/* Version 1.2 */
drop database LandRegistry;
create database LandRegistry;
use LandRegistry;
create Table User(
	userName varchar(100) not null,
	password varchar(100) not null,
	privilage int not null,
	constraint primary key (userName, password)
)ENGINE=INNODB;
create table Office(
	officeCode varchar(10) not null,
	name varchar(20) not null,
	constraint primary key (officeCode)
)ENGINE=INNODB;
create Table Notry(
	notryCode varchar(15) not null,
	name varchar(50) not null,
	address varchar(100) not null,
	notryOrJudge varchar(10),
	dateOfAppointment date,
	gender varchar(10) not null,
	officeCode Varchar(10) not null,
	constraint primary key(notryCode),
	constraint foreign key (officeCode) references Office(officeCode) on delete cascade on update cascade
)ENGINE=INNODB;
create table Medium(
	mediumCode varchar(15) not null,
	name varchar(20) not null,
	constraint primary key(mediumCode)
)ENGINE=INNODB;	
insert into Medium values('S','Sinhala');
insert into Medium values('E','English');
insert into Medium values('T','Tamil');
create table MediumDetail(
	notryCode varchar(15) not null,
	mediumCode varchar(15) not null,
	constraint primary key(notryCode,mediumCode),
	constraint foreign key (notryCode) references Notry(notryCode) on delete cascade on update cascade,
	constraint foreign key (mediumCode) references Medium(mediumCode) on delete cascade on update cascade
)ENGINE=INNODB;

create Table Client(
	clientCode varchar(10) not null,
	name varchar(30) not null,
	address varchar(70) not null,
	constraint primary key (clientCode)
)ENGINE=INNODB;
/*create table Province(
	provinceCode varchar(20) not null,
	name varchar(30) not null,
	constraint primary key (provinceCode)
)ENGINE=INNODB;
create table District(
	districtCode varchar(20) not null,
	provinceCode varchar(20) not null,
	name varchar(30) not null,
	constraint primary key (districtCode),
	constraint foreign key (provinceCode) references Province (provinceCode) on delete cascade on update cascade
)ENGINE=INNODB;
create table Division(
	divisionCode varchar(20) not null,
	districtCode varchar(20) not null,
	name varchar(30) not null,
	constraint primary key (divisionCode),
	constraint foreign key (districtCode) references District (districtCode) on delete cascade on update cascade
)ENGINE=INNODB;
*/
create Table LocalAuthority(
	authorityCode varchar(20) not null,
	name varchar(30) not null,
	constraint primary key (authorityCode)
)ENGINE=INNODB;
create Table VillageOrTown(
	authorityCode varchar(20) not null,
	villageCode varchar(20) not null,
	name varchar(30) not null,
	constraint primary key (villageCode),
	constraint foreign key (authorityCode) references LocalAuthority (authorityCode) on delete cascade on update cascade
)ENGINE=INNODB;

create table Boundry(
	boundryId varchar(30) not null,
	south varchar(100) not null,
	north varchar(100) not null,
	west varchar(100) not null,
	east varchar(100) not null,
	constraint primary key (boundryId)
)ENGINE=INNODB;
create table Extent(
	ExtId varchar(30) not null,
	acre int not null,
	rood int not null,
	perch int not null,
	constraint primary key (ExtId)
)ENGINE=INNODB;
create table BookType(
	typeCode varchar(15) not null,
	name varchar(20) not null,
	constraint primary key (typeCode)
)ENGINE=INNODB;

create Table NatureOfDeed(
	natureCode varchar(20) not null,
	name varchar(30) not null,
	registrationDuty decimal(4,2),
	constraint primary key (natureCode)
)ENGINE=INNODB;

create table DayBookRecord(
	dayBookNo varchar(20) not null,
	recDate date not null,
	recTime time not null,
	clientCode varchar(10) not null,
	redistrationDuty double,
	constraint primary key(dayBookNo),
	constraint foreign key(clientCode) references Client(clientCode) on update cascade on delete cascade
)ENGINE=INNODB;
create table ReturningDetail(
	dayBookNo varchar(50) not null,
	returnDate date not null,
	remark varchar(1000),
	clientCode varchar(10) not null,
	constraint primary key(dayBookNo),
	constraint foreign key (clientCode) references Client(clientCode) on delete cascade on update cascade,
	constraint foreign key (dayBookNo) references DayBookRecord(dayBookNo) on delete cascade on update cascade
)ENGINE=INNODB;
/* create table Plan(
	planId varchar(20) not null,
	planNo varchar(20) not null,
	planDate date not null,
	nameOfSurveyor varchar(30) not null,
	constraint primary key (planId)
)ENGINE=INNODB; */
create table Land(
	landCode varchar(30) not null,
	volume varchar(20) not null,
	folio int not null, 
	name varchar(30) not null,
	villageCode varchar(20) not null,
	boundryId varchar(30) not null,
	ExtId varchar(30) not null,
	lotNo varchar(20),
	parentLand varchar(30) null,
/* 	planId varchar(20) not null, */
	constraint primary key (landCode),
	constraint foreign key (villageCode) references VillageOrTown(villageCode) on delete cascade on update cascade,
	constraint foreign key (boundryId) references Boundry(boundryId) on delete cascade on update cascade,
	/* constraint foreign key (planId) references Plan(planId) on delete cascade on update cascade, */
	constraint foreign key (parentLand) references Land(landCode),
	constraint foreign key (ExtId) references Extent(ExtId) on delete cascade on update cascade
)ENGINE=INNODB;
/* create table LDOLand(
	landCode varchar(30) not null,
	noOfPermit_Grant varchar(20) not null,
	dateOfPermit_Grant date not null,
	constraint primary key (landCode),
	constraint foreign key (landCode) references Land(landCode) on delete cascade on update cascade
)ENGINE=INNODB; */
create Table Grantor(
	GrId varchar(30) not null,
	name varchar(30) not null,
	address varchar(60) not null,
	constraint primary key(GrId)
)ENGINE=INNODB;
create Table Grantee(
	GeId varchar(30) not null,
	name varchar(30) not null,
	address varchar(60) not null,
	constraint primary key(GeId)
)ENGINE=INNODB;

create table Deed(
	deedId varchar(30) not null,
	dayBookNo varchar(50) not null,
	refVolume varchar(20),
	refFolio int not null,
	notryCode varchar(15) not null,
	bookType varchar(15) not null,
	natureCode varchar(20) not null,
	deedDate date not null,
	notryNo int not null,
	mediumCode varchar(15) not null,
	noOfLands int not null,
	deedValue decimal(10,2) not null,
	constraint primary key(deedId),
	constraint foreign key(dayBookNo) references DayBookRecord(dayBookNo) on delete cascade on update cascade,
	constraint foreign key(notryCode) references Notry(notryCode) on delete cascade on update cascade,
	constraint foreign key(BookType) references BookType(typeCode) on delete cascade on update cascade,
	constraint foreign key(mediumCode) references Medium(mediumCode) on delete cascade on update cascade,
	constraint foreign key(natureCode) references NatureOfDeed(natureCode) on delete cascade on update cascade
)ENGINE=INNODB;
create Table Registration(
	deedId varchar(30) not null,
	landCode varchar(30) not null,
	registeredDate date not null,
	GrId varchar(30) not null,
	GeId varchar(30) not null,
	note varchar(3000) not null,
	constraint primary key(deedId, landCode),
	constraint foreign key(deedId) references Deed(deedId) on delete cascade on update cascade,
	constraint foreign key(GrId) references Grantor(GrId) on delete cascade on update cascade,
	constraint foreign key(GeId) references Grantee(GeId) on delete cascade on update cascade,
	constraint foreign key(landCode) references Land(landCode) on delete cascade on update cascade
)ENGINE=INNODB;

insert into LocalAuthority values('LA001', 'Akuressa');
insert into LocalAuthority values('LA002', 'Athuraliya');

insert into LocalAuthority values('LA003', 'Maliduwa');
insert into VillageOrTown values('LA001','V0001','Paraduwa');
insert into VillageOrTown values('LA002','V0002','Thibbotuwawa');
insert into VillageOrTown values('LA002','V0003','Maramba');
insert into VillageOrTown values('LA001','V0004','Imbulgoda');
insert into VillageOrTown values('LA003','V0005','Bangama');
insert into VillageOrTown values('LA002','V0006','Thalahagama');
insert into VillageOrTown values('LA002','V0007','Velihena'); 

insert into Grantee values('Ge001','Daljdfh','skjfhakjsdhfkjhsdf');
insert into Grantee values('Ge002','Flsgsjs','lasidkfjeuds');

insert into Grantor values('Gr001','.adhfajh','skjfhakjsdhfkjhsdf');
insert into Grantor values('Gr002','djfjgnvm','lasidkfjeuds');


insert into BookType values('L','LDO');
insert into BookType values('G','General');
insert into NatureOfDeed values('N001','AGREEMENT',12.50);
insert into NatureOfDeed values('N002','AGREEMENT CANCELLATION',12.50);
insert into NatureOfDeed values('N003','ADDRESS',1.00);
insert into NatureOfDeed values('N004','GIFT',0.00);
insert into NatureOfDeed values('N005','LEASE',0.00);
insert into NatureOfDeed values('N006','LAND SETTLEMENT',0.00);
insert into NatureOfDeed values('N007','PISCAL',0.00);
insert into NatureOfDeed values('N008','TRANSFER',0.00);
insert into NatureOfDeed values('N009','MORTGAGE BOND',17.50);
insert into NatureOfDeed values('N010','MORTGAGE CANCELLATION',10.50);
insert into NatureOfDeed values('N011','DECLARATION',12.50);

insert into Notry values('L0137', 'Lalith P P M', 'Mahawidiya, Kotapola', 'Judge', '1989-04-19', 'Male');
insert into Notry values('L0137', 'Lalith P P M', 'Mahawidiya, Kotapola', 'Judge', '1989-04-19', 'Male');
insert into Notry values('L0137', 'Lalith P P M', 'Mahawidiya, Kotapola', 'Judge', '1989-04-19', 'Male');
insert into Notry values('L0137', 'Lalith P P M', 'Mahawidiya, Kotapola', 'Judge', '1989-04-19', 'Male');
insert into Notry values('L0137', 'Lalith P P M', 'Mahawidiya, Kotapola', 'Judge', '1989-04-19', 'Male');
insert into Notry values('L0137', 'Lalith P P M', 'Mahawidiya, Kotapola', 'Judge', '1989-04-19', 'Male');
insert into Notry values('L0137', 'Lalith P P M', 'Mahawidiya, Kotapola', 'Judge', '1989-04-19', 'Male');
insert into Notry values('L0137', 'Lalith P P M', 'Mahawidiya, Kotapola', 'Judge', '1989-04-19', 'Male');
insert into Notry values('L0137', 'Lalith P P M', 'Mahawidiya, Kotapola', 'Judge', '1989-04-19', 'Male');
insert into Client values();
insert into DayBookRecord values('G00001/13','2013-03-04','12:30:00','L0137','12.50');

insert into DayBookRecord values('DB001','3',2012,'2009-12-31', '12:30:21', '933660613');
insert into Deed values('D0001','DB001', 'Gr002', 'Ge001', 'A0002', 'L', 'GD', '2013-01-20', 100, 'S', 1, 100000.00);

select dt.name as Deed_Type, nod.name as Nature, n.name as Notry, d.notryNo, d.deedDate, d.deedValue, (nod.percentage*d.deedValue)/100 as reg_duty ,ge.name as Grantee , gr.name as Grantor
from DayBookRecord dbr, Deed d, NatureOfDeed nod, Notry n, BookType dt, Grantor gr, Grantee ge
where dbr.dayBookNo = d.dayBookNo and d.natureCode = nod.natureCode and n.notryCode = d.notryCode and dt.typeCode = d.BookType and 
gr.GrId = d.GrId and ge.GeId = d.GeId and dbr.DayBookNo = '3' and dbr.curr_year = 2012 ;

select l.volume, l.folio, l.name as Land_Name, la.name as Local_Authority, v.name as Village_Name, e.acre, e.rood, e.perch, b.north, b.west, b.east, b.south 
from Land l, Extent e, Boundry b, VillageOrTown v, LocalAuthority la 
where l.boundryId = b.boundryId and e.ExtId = l.ExtId and l.VCode = v.VCode and la.LACode = v.LACode ;

SELECT d.dayBookNo, l.volume, l.folio, l.name, v.name, e.acre, e.rood, e.perch, l.lotNo, n.name, n.address, d.notryNo, d.deedValue, nod.registrationDuty 
FROM Deed d, Land l, VillageOrTown v, Extent e, Notry n, NatureOfDeed nod, Registration r  
WHERE d.notryCode = n.notryCode and v.villageCode = l.villageCode and e.ExtId = l.ExtId and nod.natureCode = d.natureCode and r.landCode = l.landCode and r.deedId = d.deedId and r.registeredDate = '2013-03-13';


SELECT d.dayBookNo, nod.name, n.name, n.address, d.notryNo, d.deedValue, gr.name, gr.address, ge.name, ge.address, r.note, nod.registrationDuty  
 FROM Deed d, Land l, Grantor gr, Grantee ge, Notry n, NatureOfDeed nod, Registration r  
WHERE d.notryCode = n.notryCode  and nod.natureCode = d.natureCode and r.landCode = l.landCode and r.deedId = d.deedId and  l.volume = 'G25' AND l.folio = 23 and r.geId = ge.geId and r.grid = gr.grId; 

SELECT db.recTime, db.dayBookNo, (select name from Client where db.clientCode=clientCode) as ClientName, (select address from Client where db.clientCode=clientCode) as ClientAddress,
    (select name from NatureOfDeed where natureCode In (select natureCode from Deed where dayBookNo=db.dayBookNo)) AS Nature, (select name from Notry where notryCode In (select notryCode from Deed where dayBookNo=db.dayBookNo)) as NotryName,
	(select address from Notry where notryCode In (select notryCode from Deed where dayBookNo=db.dayBookNo)) as NotryAddress, (select notryNo from Deed where dayBookNo=db.dayBookNo) as NotryNo,
	(select deedDate from Deed where dayBookNo=db.dayBookNo) as DeedDate, (select registrationDuty from NatureOfDeed where natureCode In (select natureCode from Deed where dayBookNo=db.dayBookNo)) AS RegDuty
FROM	DayBookRecord db;

SELECT ge.GeId, ge.name, ge.address 
FROM Grantee ge, Registration r 
where ge.GeId = r.GeId and r.landCode = 'L001' 
ORDER BY r.registeredDate desc , 1 desc 
LIMIT 1;