-- 코드를 작성해주세요
SELECT ii.ITEM_ID, ii.ITEM_NAME, ii.RARITY
FROM ITEM_INFO ii
JOIN ITEM_TREE it ON ii.ITEM_ID = it.ITEM_ID
JOIN ITEM_INFO parent_ii ON it.PARENT_ITEM_ID = parent_ii.ITEM_ID
WHERE parent_ii.RARITY = 'RARE'
ORDER BY ii.ITEM_ID DESC;