

CREATE TABLE IF NOT EXISTS exchange_value ( 
   id INT NOT NULL, 
   currency_from VARCHAR(50) NOT NULL, 
   currency_to VARCHAR(20) NOT NULL, 
   conversion_multiple DECIMAL NOT NULL, 
   port INT NOT NULL 
);