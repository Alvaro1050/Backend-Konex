CREATE DATABASE konex;

CREATE TABLE Medicamento
(
    id                SERIAL PRIMARY KEY,
    nombre            VARCHAR(50)    NOT NULL,
    laboratorio       VARCHAR(50)    NOT NULL,
    fecha_fabricacion DATE           NOT NULL,
    fecha_vencimiento DATE           NOT NULL,
    cantidad          INTEGER        NOT NULL,
    valor_unitario    DECIMAL(10, 2) NOT NULL
);


CREATE TABLE Venta
(
    id             SERIAL PRIMARY KEY,
    fecha_hora     TIMESTAMP      NOT NULL,
    medicamento_id INTEGER        NOT NULL,
    cantidad       INTEGER        NOT NULL,
    valor_unitario DECIMAL(10, 2) NOT NULL,
    valor_total    DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (medicamento_id) REFERENCES Medicamento (id)
);


-- Insertar datos en la tabla "Medicamento"
INSERT INTO Medicamento (nombre, laboratorio, fecha_fabricacion, fecha_vencimiento, cantidad, valor_unitario)
VALUES ('Aspirina', 'Bayer', '2022-01-01', '2025-01-01', 100, 5.00),
       ('Paracetamol', 'Johnson & Johnson', '2022-02-01', '2025-02-01', 50, 7.50),
       ('Ibuprofeno', 'Pfizer', '2022-03-01', '2025-03-01', 80, 6.00),
       ('Amoxicilina', 'GlaxoSmithKline', '2022-04-01', '2025-04-01', 70, 8.00),
       ('Metamizol', 'Sanofi', '2022-05-01', '2025-05-01', 60, 10.00);

-- Insertar datos en la tabla "Venta"
INSERT INTO Venta (fecha_hora, medicamento_id, cantidad, valor_unitario, valor_total)
VALUES ('2023-01-01 10:00:00', 1, 20, 5.00, 100.00),
       ('2023-01-02 11:00:00', 2, 10, 7.50, 75.00),
       ('2023-01-03 12:00:00', 3, 15, 6.00, 90.00),
       ('2023-01-04 13:00:00', 4, 25, 8.00, 200.00),
       ('2023-01-05 14:00:00', 5, 30, 10.00, 300.00);
