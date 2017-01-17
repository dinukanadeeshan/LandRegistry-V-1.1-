/* Version 1.2 */
create database LandRegistry;
use LandRegistry;
create Table Notry(
	notryCode varchar(15) not null,
	appointedFileNo varchar(20) ,
	name varchar(50) not null,
	privateAddress varchar(100),
	officeAddress varchar(100) not null,
	notryOrJudge varchar(10),
	dateOfAppointment date,
	mobileNo varchar(10),
	landNo varchar(10),
	gender varchar(10) not null,
	constraint primary key(notryCode)
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
create Table Irregularity(
	ICode varchar(15) not null,
	IType varchar(50) not null,
	constraint primary key (ICode)
)ENGINE=INNODB;
insert into Irregularity values('I001','NO SIGNATURE');
insert into Irregularity values('I002','UNDER VALUE');
insert into Irregularity values('I003','NO STAMP DUTY');
insert into Irregularity values('I004','NO RUBBER SEAL');
insert into Irregularity values('I005','NO WITNESS SIGNATURE');
insert into Irregularity values('I006','NO DEED NUMBER');
create Table Client(
	code varchar(10) not null,
	name varchar(30) not null,
	address varchar(70) not null,
	constraint primary key (code)
)ENGINE=INNODB;
create Table LocalAuthority(
	LACode varchar(20) not null,
	name varchar(30) not null,
	constraint primary key (LACode)
)ENGINE=INNODB;
create Table Village(
	LACode varchar(20) not null,
	VCode varchar(20) not null,
	name varchar(30) not null,
	constraint primary key (VCode),
	constraint foreign key (LACode) references LocalAuthority (LACode) on delete cascade on update cascade
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
create table DeedType(
	typeCode varchar(15) not null,
	name varchar(20) not null,
	constraint primary key (typeCode)
)ENGINE=INNODB;

create Table NatureOfDeed(
	natureCode varchar(30) not null,
	name varchar(40) not null,
	percentage int,
	constraint primary key (natureCode)
)ENGINE=INNODB;

create table DayBookRec(
	DayBookRecId varchar(50) not null,
	DayBookNo int not null,
	curr_year int(4) not null,
	recDate date not null,
	recTime time not null,
	clientCode varchar(10) not null,
	constraint primary key(DayBookRecId),
	constraint foreign key(clientCode) references Client(code) on update cascade on delete cascade
)ENGINE=INNODB;
create table ReturningDetail(
	DayBookRecId varchar(50) not null,
	RdId varchar(50) not null,
	returnDate date not null,
	remark varchar(1000),
	clientCode varchar(10) not null,
	constraint primary key(RdId),
	constraint foreign key (clientCode) references Client(code) on delete cascade on update cascade,
	constraint foreign key (DayBookRecId) references DayBookRec(DayBookRecId) on delete cascade on update cascade
)ENGINE=INNODB;
create table Land(
	landCode varchar(30) not null,
	volume varchar(20) not null,
	folio int not null, 
	name varchar(30) not null,
	VCode varchar(20) not null,
	boundryId varchar(30) not null,
	ExtId varchar(30) not null,
	lotNo int ,
	asstNo varchar(20),
	constraint primary key (landCode),
	constraint foreign key (VCode) references Village(VCode) on delete cascade on update cascade,
	constraint foreign key (boundryId) references Boundry(boundryId) on delete cascade on update cascade,
	constraint foreign key (ExtId) references Extent(ExtId) on delete cascade on update cascade
)ENGINE=INNODB;
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
	DayBookRecId varchar(50) not null,
	refVolume varchar(20),
	refFolio int not null,
	notryCode varchar(15) not null,
	deedType varchar(15) not null,
	natureCode varchar(30) not null,
	deedDate date not null,
	notryNo int not null,
	mediumCode varchar(15) not null,
	noOfLands int not null,
	deedValue double not null,
	constraint primary key(deedId),
	constraint foreign key(DayBookRecId) references DayBookRec(DayBookRecId) on delete cascade on update cascade,
	constraint foreign key(notryCode) references Notry(notryCode) on delete cascade on update cascade,
	constraint foreign key(deedType) references DeedType(typeCode) on delete cascade on update cascade,
	constraint foreign key(mediumCode) references Medium(mediumCode) on delete cascade on update cascade,
	constraint foreign key(natureCode) references NatureOfDeed(natureCode) on delete cascade on update cascade
)ENGINE=INNODB;
create Table Registration(
	deedId varchar(30) not null,
	landCode varchar(30) not null,
	registeredDate date not null,
	GrId varchar(30) not null,
	GeId varchar(30) not null,
	remark varchar(1000),
	constraint primary key(deedId, landCode),
	constraint foreign key(deedId) references Deed(deedId) on delete cascade on update cascade,
	constraint foreign key(GrId) references Grantor(GrId) on delete cascade on update cascade,
	constraint foreign key(GeId) references Grantee(GeId) on delete cascade on update cascade,
	constraint foreign key(landCode) references Land(landCode) on delete cascade on update cascade
)ENGINE=INNODB;
create table IrregularityReport(
	deedId varchar(30) not null,
	ICode varchar(15) not null,
	reportNO varchar(15) not null,
	reportDate date not null,
	constraint primary key(deedId,ICode),
	constraint foreign key(deedId) references Deed(deedId) on delete cascade on update cascade,
	constraint foreign key(ICode) references Irregularity(ICode) on delete cascade on update cascade
)ENGINE=INNODB;


insert into LocalAuthority values('LA001', 'Akuressa');
insert into LocalAuthority values('LA002', 'Athuraliya');

insert into LocalAuthority values('LA003', 'Maliduwa');
insert into Village values('LA001','V0001','Paraduwa');
insert into Village values('LA002','V0002','Thibbotuwawa');
insert into Village values('LA002','V0003','Maramba');
insert into Village values('LA001','V0004','Imbulgoda');
insert into Village values('LA003','V0005','Bangama');
insert into Village values('LA002','V0006','Thalahagama');
insert into Village values('LA002','V0007','Velihena'); 

insert into Grantee values('Ge001','Daljdfh','skjfhakjsdhfkjhsdf');
insert into Grantee values('Ge002','Flsgsjs','lasidkfjeuds');

insert into Grantor values('Gr001','.adhfajh','skjfhakjsdhfkjhsdf');
insert into Grantor values('Gr002','djfjgnvm','lasidkfjeuds');


insert into DeedType values('L','LDO');
insert into DeedType values('G','General');
insert into NatureOfDeed values('GD','Gift',8);

insert into DayBookRec values('DB001','3',2012,'2009-12-31', '12:30:21', '933660613');

insert into Deed values('D0001','DB001', 'Gr002', 'Ge001', 'A0002', 'L', 'GD', '2013-01-20', 100, 'S', 1, 100000.00);

select dt.name as Deed_Type, nod.name as Nature, n.name as Notry, d.notryNo, d.deedDate, d.deedValue, (nod.percentage*d.deedValue)/100 as reg_duty ,ge.name as Grantee , gr.name as Grantor
from DayBookRec dbr, Deed d, NatureOfDeed nod, Notry n, DeedType dt, Grantor gr, Grantee ge
where dbr.DayBookRecId = d.DayBookRecId and d.natureCode = nod.natureCode and n.notryCode = d.notryCode and dt.typeCode = d.deedType and 
gr.GrId = d.GrId and ge.GeId = d.GeId and dbr.DayBookNo = '3' and dbr.curr_year = 2012 ;

select l.volume, l.folio, l.name as Land_Name, la.name as Local_Authority, v.name as Village_Name, e.acre, e.rood, e.perch, b.north, b.west, b.east, b.south 
from Land l, Extent e, Boundry b, Village v, LocalAuthority la 
where l.boundryId = b.boundryId and e.ExtId = l.ExtId and l.VCode = v.VCode and la.LACode = v.LACode ;

select 