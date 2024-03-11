create
    database temp;
use temp;

drop table if exists products;
CREATE TABLE products
(
    product_id INT PRIMARY KEY,
    name       VARCHAR(255),
    category   VARCHAR(255)
);
-- 插入商品数据
INSERT INTO products (product_id, name, category)
VALUES (1, 'Product A', 'Category 1'),
       (2, 'Product B', 'Category 1'),
       (3, 'Product C', 'Category 2'),
       (4, 'Product D', 'Category 2'),
       (5, 'Product E', 'Category 3');


drop table if exists orders;
CREATE TABLE orders
(
    order_id   INT PRIMARY KEY,
    product_id INT,
    quantity   INT,
    order_date DATE
);
-- 插入订单数据
INSERT INTO orders (order_id, product_id, quantity, order_date)
VALUES (101, 1, 5, '2023-08-01'),
       (102, 2, 3, '2023-08-01'),
       (103, 3, 8, '2023-08-02'),
       (104, 4, 10, '2023-08-02'),
       (105, 5, 15, '2023-08-03'),
       (106, 1, 7, '2023-08-03'),
       (107, 2, 4, '2023-08-04'),
       (108, 3, 6, '2023-08-04'),
       (109, 4, 12, '2023-08-05'),
       (110, 5, 9, '2023-08-05');

select temp.name                                                  as product_name,
       temp.sum                                                   as total_sales,
       RANK() over (partition by temp.category ORDER BY sum desc) as category_rank
from (select name,
             sum(orders.quantity) as sum,
             products.category    as category
      from orders
               INNER JOIN
           products ON orders.product_id = products.product_id
      group by products.category, products.product_id
      order by substr(products.category, 9), sum(orders.quantity)
              desc) as temp
;

select name                                                                            as product_name,
       sum(orders.quantity)                                                            as total_sales,
       RANK() over (partition by products.category ORDER BY sum(orders.quantity) desc) as category_rank
from orders,
     products
where orders.product_id = products.product_id
group by products.category, products.product_id
order by substr(products.category, 9), sum(orders.quantity)
        desc;





















