SELECT
   Person.firstName,
   Person.lastName,
   Address.city,
   Address.state
FROM Person
LEFT JOIN address
ON Person.PersonId=Address.PersonId;
