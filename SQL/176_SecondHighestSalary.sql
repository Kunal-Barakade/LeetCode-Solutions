select (select distinct salary AS SecondHighestSalary
from Employee
where salary IN (select max(salary)
                 from Employee
                 where salary < (select max(salary)
                                from Employee))) AS SecondHighestSalary ;