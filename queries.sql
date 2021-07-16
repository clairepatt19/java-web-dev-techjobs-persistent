## Part 1: Test it with SQL

select * from techjobs.job;
id, employer, name, skills
select DATA_TYPE from techjobs.job;
or
desc techjobs.job;
id -int PK; employer, name, skills -varchar(255)

## Part 2: Test it with SQL

SELECT name FROM techjobs.employer
where location = "St. Louis";

## Part 3: Test it with SQL
drop techjobs.job FROM techjobs;

## Part 4: Test it with SQL
SELECT name, description from skill
JOIN job_skills ON skill.id = job_skills.skills_id;