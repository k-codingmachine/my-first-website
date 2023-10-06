select *
from jobs
order by job_title ;

select *
from employees
where salary BETWEEN 10000 and 12000;

select *
from jobs
where job_id in ('IT_PROG' ,'ST_MAN');

select *
from departments
where manager_id is not null;

select *
from employees
where job_id like 'AD%';

