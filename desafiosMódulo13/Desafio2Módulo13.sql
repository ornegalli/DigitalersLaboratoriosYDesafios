#EJERCICIO 2
SELECT *, "ANTERIOR" AS ESTADO FROM TOP_SPOTIFY
WHERE TITULO LIKE "%BREAK%" 
UNION
SELECT *, "ÚLTIMO" AS ESTADO FROM ÚLTIMOS_LANZAMIENTOS 
WHERE TITULO LIKE "%BREAK%" ORDER BY TITULO;