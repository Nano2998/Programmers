-- 코드를 작성해주세요
SELECT
    COUNT(*) AS FISH_COUNT
FROM
    FISH_INFO
WHERE
    FISH_TYPE IN (
        select 
            FISH_TYPE
        FROM 
            FISH_NAME_INFO
        WHERE 
            FISH_NAME IN ('BASS', 'SNAPPER')
        )