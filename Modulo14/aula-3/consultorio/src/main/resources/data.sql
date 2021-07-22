INSERT INTO dentist(name, last_name, address, dni, birth_date, phone, email, code_mp)
VALUES (
    "Breno",
    "Waldovando",
    "Rua do Breno Waldo",
    "123",
    "2020-01-01",
    "(11) 91231-1231",
    "brenowaldo@gmail.com",
    "987"
),
(
    "Andressa",
    "Pacheca",
    "Rua da Andressa",
    "456",
    "2010-01-01",
    "(22) 92231-4231",
    "dressinha@gmail.com",
    "4561"
),
(
    "Roberto",
    "Nice",
    "Rua da Arueira",
    "42069",
    "2001-05-09",
    "(48) 99464-6541",
    "neatroberto@gmail.com",
    "123"
),
(
    "Juan",
    "Férenãff",
    "Rua da bombacha",
    "06942",
    "1992-08-29",
    "(61) 99464-6541",
    "fairenough@gmail.com",
    "111"
);

INSERT INTO diary(start_time, ending_time, dentist_id) VALUES
    ('09:00:00', '09:30:00', 1),
    ('09:30:00', '10:00:00', 1),
    ('10:00:00', '10:30:00', 1),
    ('10:30:00', '11:00:00', 1),
    ('11:30:00', '12:00:00', 2),
    ('13:00:00', '13:30:00', 2),
    ('13:30:00', '14:00:00', 2),
    ('14:00:00', '14:30:00', 2),
    ('14:30:00', '15:00:00', 3),
    ('15:00:00', '15:30:00', 3),
    ('15:30:00', '16:00:00', 3),
    ('16:00:00', '16:30:00', 3),
    ('16:30:00', '17:00:00', 4),
    ('17:00:00', '17:30:00', 4),
    ('17:30:00', '18:00:00', 4),
    ('18:00:00', '18:30:00', 4);

INSERT INTO patient(name, last_name, address, dni, birth_date, phone, email) VALUES
    ("Paciente 1", "Sobrenome 1", "Rua 1", 111, "1996-05-10", "(11) 1111-1111", "email_paciente1@gmail.com"),
    ("Paciente 2", "Sobrenome 2", "Rua 2", 222, "2010-07-08", "(11) 2222-2222", "email_paciente2@gmail.com"),
    ("Paciente 3", "Sobrenome 3", "Rua 3", 333, "1590-01-03", "(11) 3333-3333", "email_paciente3@gmail.com"),
    ("Paciente 4", "Sobrenome 4", "Rua 4", 444, "1032-11-29", "(11) 4444-4444", "email_paciente4@gmail.com");

INSERT INTO turn_status(name, description) VALUES
    ("CONCLUIDO" , "Concluido"),
    ("CANCELADO" , "Cancelado"),
    ("PENDENTE" , "Pendente");

INSERT INTO turn(day, diary_id, patient_id, turn_status_id) VALUES
    ("2005-10-11", 1, 1, 1),
    ("2005-10-21", 1, 2, 1),
    ("2005-10-21", 1, 3, 1),
    ("2005-10-21", 1, 4, 1),
    ("2005-10-11", 1, 1, 1),
    ("2015-11-12", 9, 1, 2),
    ("2015-11-13", 9, 2, 2),
    ("2015-11-13", 9, 3, 2),
    ("2015-11-13", 9, 4, 1),
    ("2015-11-13", 13, 4, 1),
    ("2015-11-13", 13, 5, 1),
    ("2015-11-12", 13, 6, 1),
    ("2015-11-15", 13, 7, 1),
    ("2015-11-15", 9, 1, 1),
    ("2015-11-12", 2, 1, 2),
    ("2021-09-24", 2, 3, 3),
    ("2021-06-20", 3, 3, 2),
    ("2021-04-14", 3, 2, 1),
    ("2005-09-23", 3, 2, 1),
    ("2005-10-11", 1, 2, 1),
    ("2005-10-11", 1, 4, 2),
    ("2005-10-11", 3, 1, 2);

INSERT INTO user(password, user_name, user_status) VALUES 
    ("password", "User1", "Disponivel"),
    ("senha", "User2", "Disponivel"),
    ("senha123", "User3", "Disponivel"),
    ("popo123", "User4", "Disponivel");
