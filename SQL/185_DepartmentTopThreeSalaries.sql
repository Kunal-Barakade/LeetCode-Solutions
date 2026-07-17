select Department, Employee, salary
from (select  d.name as "Department", e.name as "Employee", salary , dense_rank() over(partition by d.name order by salary desc) as rnk    
      from Employee e join Department d
       on departmentId = d.id) as empdept 
where rnk <= 3;
