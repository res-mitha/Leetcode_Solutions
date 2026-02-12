# Write your MySQL query statement below
UPDATE Salary
SET sex= CASE
             WHEN sex='f' THEN 'm'
             when sex='m' THEN 'f'
         END;