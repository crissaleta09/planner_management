
-- 1. friend
INSERT INTO friend (name, email, birthdate, level)
VALUES ('Lucía García', 'lucia@email.com', '1995-05-20', 'AMIGO');

INSERT INTO friend (name, email, birthdate, level)
VALUES ('Marcos Rojo', 'marcos@email.com', '1992-11-10', 'AMIGO');

INSERT INTO friend (name, email, birthdate, level)
VALUES ('Ana Conocida', 'ana@email.com', '1998-01-30', 'CONOCIDO');

-- 2. Encuentros (Relacionados con los friend de arriba)
-- Asumiendo que tienes una tabla 'encuentros'
INSERT INTO meeting (friend_id, date, type, description)
VALUES (1, '2023-10-01 18:30:00', 'CAFE', 'Hablamos de su nuevo trabajo');

INSERT INTO meeting (friend_id, date, type, description)
VALUES (1, '2023-10-15 21:00:00', 'CENA', 'Celebramos su cumpleaños');

-- 3. Estado Anímico
INSERT INTO animic_state (friend_id, date, state, note)
VALUES (1, '2023-10-20', 'TRISTE', 'Problemas personales');

