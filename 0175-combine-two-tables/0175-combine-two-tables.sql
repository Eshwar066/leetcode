# Write your MySQL query statement below   //left join

# select P.firstName,P.lastName,A.city,A.state from Person P LEFT JOIN Address A
# Using (personId)

SELECT P.firstName, P.lastName, A.city, A.state
FROM Person P LEFT JOIN Address A
on P.personId = A.personId