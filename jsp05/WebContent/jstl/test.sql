create table tempmember (
id varchar2(20) not null,
passwd varchar2(20),
name varchar2(20),
mem_num1 varchar2(6),
mem_num2 varchar2(7),
e_mail varchar2(30),
phone varchar2(30),
zipcode varchar2(7),
address varchar2(60),
job varchar2(30),
primary key(id)
);



insert into tempmember values('aaaa','1111','ȫ�浿','123456','7654321','hong@naver.com','02-1234-1234','100-100','����Ư����','�������');
insert into tempmember values('bbbb','2222','�̼���','345612','3217654','lee@naver.com','032-1234-1234','200-200','��õ������','��õ����');
insert into tempmember values('cccc','3333','������','456123','5432176','kim@naver.com','033-1234-1234','300-300','������','����������');

commit;

select * from tempmember;