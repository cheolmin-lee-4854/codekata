SELECT count(distinct name) count
FROM ANIMAL_INS
WHERE (NAME IS NOT NULL) AND TRIM(NAME)<>""