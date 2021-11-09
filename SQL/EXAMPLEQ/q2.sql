-- alter table tens add sub_choice int;

update tens set sub_choice='2'
where left(first_name,1)>'M';
