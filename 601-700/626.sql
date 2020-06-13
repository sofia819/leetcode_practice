/*
 * 626. Exchange Seats
 * https://leetcode.com/problems/exchange-seats/
 */

-- Write your MySQL query statement below


select
  (case 
        when id % 2 = 0 then id - 1
        when id % 2 = 1 and id < (select count(*)
    from seat)then id + 1
        else id
end) as id, student
from seat
order by id;