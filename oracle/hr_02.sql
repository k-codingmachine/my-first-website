select *
from employees
where employee_id >=120 and employee_id <130; // 위문장

select *
from employees
where employee_id BETWEEN 120 and 130; // 위 아래문장 동일

select *
from employees
where salary BETWEEN 10000 and 20000;

select *
from employees
where first_name ='Steven' or first_name ='Jonn' or first_name ='King';

select *
from employees
where first_name in('Steven' ,'Jonn','King'); // 위 문장과 동일

select *
from employees
where first_name not in('Steven' ,'Jonn','King');

select *
from employees
where commission_pct is null;

select *
from employees
where commission_pct is not null;

select *
from employees
where last_name like 'Ma%';

select *
from employees
where last_name like '%ll%';

select *
from employees
where last_name like 'S__';