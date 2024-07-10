-- 코드를 입력하세요
SELECT count(user_id) as users
FROM USER_INFO
WHERE YEAR(JOINED) = '2021' && AGE >= 20 && AGE <= 29