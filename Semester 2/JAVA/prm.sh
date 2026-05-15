#!/bin/bash
read -p "Enter A Number::" n
pr=1
while((pr=1;pr<$n;pr++))
n=($n%$pr)
if pr=(n/=0)
   then
   echo"$n is prime"
   else
   echo"$n is not prime"
fi

#Syntax
1.ALTER 
#add column
#ALTER table table_name add column_name datatype;

#Drop column
#alter table table_name drop column column_name;

#modify datatype
#alter table table_name modify column_name new_datatype;

#rename column
#alter table table_name rename column old_name to new_name;

2.UPDATE
#update table_name set col1 = value where condition;

#multiple data updates
#update table_name set col1 = value1,col2 = value2 where condition;

#update all rows
#update table_name set col1 = val1;

#update with calculation
#update table_name set col = col * operation where condition
#eg :update Employee set salary = salary * 1.1 where DeptNO = 'D01';

3.Aggregate functions
#select COUNT(*) from table; #total rows
#select COUNT(col) from table; #non-nul values only
#select COUNT(DISTINCT col) from table; #unique values

#select SUM(col) from table; //total sum
#select AVG(col) from table; //average
#select MAX(col) from table; //Highest
#select MIN(col) from table; //Lowest

#eg:SELECT DEPTNO,COUNT(*),AVG(Salary) from Employee GROUP BY DEPTNO;

4.Clauses
#ORDER BY
#SELECT empid,name,salary from employee order by salary desc, name ASC;
// table il olla field vechu mattanam

#GROUP BY + AGGREGATE fn

SELECT deptno,COUNT(*) as emp_count from employee group by deptno;

#HAVING
SELECT deptno,COUNT(*) as emp_count from employee group by deptno having count(*) >= 2 AND SUM(salary) > 50000;

#LIMIT
SELECT empid,name,salary from employee order by salary desc LIMIT 3;
