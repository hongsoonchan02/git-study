-- Q1. employees 테이블에서 사원을 사번 기준으로 오름차순 정렬하여 조회하세요.
SELECT * FROM employees
ORDER BY emp_no ASC;
-- Q2. employees 테이블에서 사원을 사번 기준으로 내림차순 정렬하여 조회하세요.
SELECT * FROM employees
ORDER BY emp_no DESC;
-- Q3. salaries 테이블에서 급여를 높은 순으로 정렬하여 조회하세요.
SELECT salary FROM salaries
ORDER BY salary ASC;
-- Q4. employees 테이블에서 입사일 기준으로 오래된 순서대로 정렬하여 조회하세요.
SELECT hire_date FROM  employees
ORDER BY hire_date DESC;
-- Q5. employees 테이블에서 성별 기준으로 정렬한 뒤 사번 기준으로 정렬하여 조회하세요. gender asc, emp_no asc
SELECT * FROM  employees
ORDER BY gender ASC, emp_no ASC;
-- Q6. salaries 테이블에서 가장 높은 급여를 조회하세요.
SELECT max(salary) FROM salaries;  
-- Q7. salaries 테이블에서 가장 낮은 급여를 조회하세요.
SELECT min(salary) FROM salaries;
-- Q8. salaries 테이블에서 평균 급여를 조회하세요.
SELECT avg(salary) FROM salaries;
-- Q9. salaries 테이블에서 전체 급여 합계를 조회하세요.
SELECT sum(salary) FROM salaries;
-- Q10. employees 테이블에서 전체 사원 수를 조회하세요.
SELECT count(*) AS '사원 수' FROM employees;
-- Q11. employees 테이블에서 성별별 사원 수를 조회하세요.
SELECT count(*), gender FROM employees
GROUP BY gender;
-- Q12. dept_emp 테이블에서 부서별 사원 수를 조회하세요.
SELECT count(*), dept_no FROM dept_emp
GROUP BY dept_no;
-- Q13. titles 테이블에서 직급별 사원 수를 조회하세요.
SELECT count(*), title FROM titles
GROUP BY title;
-- Q14. salaries 테이블에서 사번별 평균 급여를 조회하세요.
SELECT avg(salary), emp_no FROM salaries s 
GROUP BY emp_no;
-- Q15. employees 테이블에서 입사 연도별 사원 수를 조회하세요.
SELECT count(*), YEAR(hire_date) FROM employees
GROUP BY YEAR(hire_date);
-- Q16. 성별별 사원 수 중 100000명 이상인 경우만 조회하세요.
SELECT count(*), gender FROM employees
GROUP BY employees.gender  
HAVING count(*) > 100000;
-- Q17. 부서별 사원 수 중 20000명 이상인 부서만 조회하세요.
SELECT count(*), dept_no FROM dept_emp
GROUP BY dept_emp.dept_no 
HAVING count(*) > 20000;
-- Q18. 직급별 사원 수 중 50000명 이상인 직급만 조회하세요.
SELECT count(*), title FROM titles
GROUP BY title 
HAVING count(*) > 50000;
-- Q19. 사번별 평균 급여가 80000 이상인 사원만 조회하세요.
SELECT  avg(salary), emp_no FROM salaries s
GROUP BY emp_no
HAVING avg(salary) >= 80000;
-- Q20. 입사 연도별 사원 수 중 10000명 이상인 연도만 조회하세요.
SELECT count(*), year(hire_date) FROM employees 
GROUP BY year(hire_date)
HAVING count(*) >= 10000;










