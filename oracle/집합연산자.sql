--집합 연산자
//union : 위의 문장과 아래문장을 합친다.(중복된 데이터 제거)
select employee_id, first_name
from employees
where employee_id <= 160
union 
select employee_id, first_name
from employees
where employee_id >=140;


select employee_id, first_name
from employees
where employee_id <= 160
INTERSECT
select employee_id, first_name
from employees
where employee_id >=140;