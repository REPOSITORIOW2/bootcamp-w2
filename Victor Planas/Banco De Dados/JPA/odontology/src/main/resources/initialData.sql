INSERT INTO `dentists`
(`id_dentist`,`name`,`last_name`, `address`, `dni`, `birth_date`, `phone`, `email`, `code_mp`)
VALUES
(1,"abobrinha", "doutor", "castleo ra tim bum", "5544", '1988-11-11', "4433", "drabobrinha@gmai.com", "1513"),
       (2,"joao", "balao", "Rua ra tim bum", "1323", '1998-11-11', "3466", "geneviv@gmai.com", "4566"),
       (3,"joana", "balona", "avenida ra tim bum", "24545", '1989-11-11', "13436", "saf@rasf.com", "1256");


INSERT INTO `users`
(`id_user`, `user_name`, `password`, `user_status`)
VALUES
(1, 'USUARIO1', 'USUARIO1', 'ATIVO'),
(2, 'USUARIO2', 'USUARIO2', 'ATIVO'),
(3, 'USUARIO3', 'USUARIO3', 'INATIVO');

INSERT INTO `diarys`
(`id_diary`, `start_time`, `ending_time`, `id_dentist`)
VALUES
(1, '08:00:00', '18:00:00', 1),
(2, '09:00:00', '19:00:00', 2),
(3, '10:00:00', '20:00:00', 3);

INSERT INTO `patients`
(`id_patient`, `name`, `last_name`, `address`, `dni`, `birth_date`, `phone`, `email`)
VALUES
(1,'ALBERTO', 'JUNIOR', 'RUA DOS SANTOS', '3322', '2000-02-02', '123412', 'ASDASD@GMAIL'),
(2,'BERTO', 'JUNHO', 'RUA DOS ANJOS', '1133', '2001-02-02', '45554', 'ASFASF@GMAIL'),
(3,'CARLOS', 'JULIANO', 'RUA DOS SONHOS', '4455', '2002-02-02', '5421', 'POPOPOP@GMAIL');

INSERT INTO `turn_status`
(`id_turn_status`, `name`, `description`)
VALUES
(1, 'Concluido', 'turno concluido'),
(2, 'Cancelado', 'turno cancelado'),
(3, 'Pendente', 'turno pendente'),
(4, 'Reprogramado', 'turno reprogramado');

INSERT INTO `turns`
(`id_turn`, `day`, `id_diary`, `id_turn_status`, `id_patient`)
VALUES
(1, '2021-07-22', 1, 1, 1),
(2, '2021-07-20', 2, 2, 2),
(3, '2021-07-19', 3, 3, 3),
(4, '2021-07-22', 1, 1, 1),
(5, '2021-07-22', 1, 4, 1),
(6, '2021-07-22', 1, 4, 1);