-- 코드를 작성해주세요
Select
ID,EMAIL,FIRST_NAME,LAST_NAME
FROM DEVELOPER_INFOS 
Where SKILL_3 = 'Python' OR SKILL_2 = 'Python' OR SKILL_1 = 'Python'
ORDER BY ID 