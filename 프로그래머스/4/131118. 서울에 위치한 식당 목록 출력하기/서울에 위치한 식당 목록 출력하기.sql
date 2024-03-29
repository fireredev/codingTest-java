-- 코드를 입력하세요
SELECT R.REST_ID,R.REST_NAME,R.FOOD_TYPE,R.FAVORITES,R.ADDRESS,ROUND(AVG(I.REVIEW_SCORE),2) AS SCORE
FROM  REST_INFO R JOIN REST_REVIEW I
ON    R.REST_ID = I.REST_ID
WHERE ADDRESS LIKE '서울%'
GROUP BY R.REST_ID,R.REST_NAME,R.FOOD_TYPE,R.FAVORITES,R.ADDRESS
ORDER BY SCORE DESC,FAVORITES DESC;

