/* get only the name and cell number of the 
first child to reister */

select first_name, cell 
from all_students 
order by reg_date asc limit 1;

 