# Write your MySQL query statement below
SELECT name,population,area
FROM WORLD
WHERE area >=3000000 OR population >= 25000000




-- optimized one 
-- SELECT name, population, area
-- FROM WORLD w
-- WHERE w.area >= 3000000 OR w.population >= 25000000;
