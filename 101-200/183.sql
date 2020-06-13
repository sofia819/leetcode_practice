/*
 * 183. Customers Who Never Order
 * https://leetcode.com/problems/customers-who-never-order/
 */

-- Write your MySQL query statement below
Select Name as Customers
From Customers
Where Id not in (select CustomerId from Orders)