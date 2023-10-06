select city, country_id
from locations
order by country_id asc, city desc;  // 1차 조건은 오름차순 2차조건은 내림차순(생략시 asc)

select first_name, last_name
from employees
order by first_name;

select * 
from employees
where not last_name = 'woo' or last_name = 'King';

select * 
from employees
where not employee_id = 100;


select * 
from employees
where last_name = 'woo' or last_name = 'King';

select * 
from employees
where employee_id = 100;
