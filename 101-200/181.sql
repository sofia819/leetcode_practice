/* 
 * 181. Employees Earning More Than Their Managers
 * https://leetcode.com/problems/employees-earning-more-than-their-managers/
 */

--Write your MySQL query statement below
select e.Name as Employee
from Employee e join Employee p
  on e.ManagerId = p.Id
    and e.Salary > p.Salary