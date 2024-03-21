-- 코드를 입력하세요
SELECT TO_CHAR(M.SALES_DATE,'YYYY-MM-DD'),M.PRODUCT_ID,M.USER_ID,M.SALES_AMOUNT
FROM
(SELECT SALES_DATE,PRODUCT_ID,USER_ID,SALES_AMOUNT
FROM ONLINE_SALE
UNION 
SELECT SALES_DATE,PRODUCT_ID,NULL,SALES_AMOUNT
FROM OFFLINE_SALE) M
WHERE TO_CHAR(M.SALES_DATE,'YYYY-MM')='2022-03'
ORDER BY M.SALES_DATE ASC,PRODUCT_ID ASC,USER_ID ASC;