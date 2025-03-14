INSERT INTO user (nome, email, password, role) 
VALUES ('Admin User', 'admin@festival.com', '{bcrypt}adminpasswordhash', 'ADMIN');

INSERT INTO user (nome, email, password, role) 
VALUES ('Regular User', 'user@festival.com', '{bcrypt}userpasswordhash', 'USER');

INSERT INTO venue (nome, indirizzo, capienza) 
VALUES ('Teatro Centrale', 'Via Roma, 123', 500);

INSERT INTO event (titolo, descrizione, data, orario, prezzo, venue_id) 
VALUES ('Concerto di Musica Classica', 'Un concerto di musica classica', '2025-06-15', '20:00', 25.00, 1);