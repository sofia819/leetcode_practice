/*
 * 595. Big Countries
 * https://leetcode.com/problems/big-countries/
 */
 
-- Write your MySQL query statement below
Select name, population, area
From World
Where area > 3000000 OR population > 25000000