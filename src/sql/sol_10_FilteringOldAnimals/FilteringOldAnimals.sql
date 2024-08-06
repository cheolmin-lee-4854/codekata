SELECT date_format(date(date), '%Y') "년",
date_format(date(date), '%m') "월",
date_format(date(date), '%Y%m') "년월",
COUNT(1) "주문건수" 
FROM food_orders f inner join payments p on f.order_id = p.order_id 
WHERE date_format(date(date), '%m')='03' 
group by 1, 2, 3
ORDER BY 1