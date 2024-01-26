# Write your MySQL query statement below
UPDATE Salary SET sex = IF(sex = 'm', 'f','m');
# here it is like ternary operator if sex = 'm' then f otherwise m
# another way is to use CASE WHEN 
# can have multiple WHEN
# UPDATE salary SET sex =
# CASE sex
#     WHEN 'm' THEN 'f'
#     ELSE 'm'
# END;