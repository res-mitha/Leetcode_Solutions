# Write your MySQL query statement b
SELECT email AS email
FROM person
GROUP BY email
HAVING COUNT(email)>1