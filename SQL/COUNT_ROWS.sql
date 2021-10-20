SELECT 
    id, COUNT(id)
FROM
    it_marks
GROUP BY 
    id
HAVING 
    COUNT(id) > 1;