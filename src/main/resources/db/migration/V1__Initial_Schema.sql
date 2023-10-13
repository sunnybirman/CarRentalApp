-- V1__Initial_Schema.sql
CREATE TABLE customer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    birthdate DATE
);

CREATE TABLE vehicle (
    id INT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR(255) NOT NULL,
    model VARCHAR(255) NOT NULL,
    model_year INT NOT NULL,
    vin VARCHAR(17),
    price DECIMAL(10, 2) NOT NULL
);

CREATE TABLE leasing_contract (
    id INT AUTO_INCREMENT PRIMARY KEY,
    contract_number VARCHAR(255) NOT NULL,
    monthly_rate DECIMAL(10, 2) NOT NULL,
    customer_id INT NOT NULL,
    vehicle_id INT NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer(id),
    FOREIGN KEY (vehicle_id) REFERENCES vehicle(id)
);
