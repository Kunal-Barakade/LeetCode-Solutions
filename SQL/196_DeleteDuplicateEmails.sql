delete from Person
where id in ( select id
              from (select id, row_number() over(partition by email order by id asc) as srno
                   from Person) as person2
            where srno > 1) ;