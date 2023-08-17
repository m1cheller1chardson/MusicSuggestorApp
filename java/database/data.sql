BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');

INSERT INTO songs (artist, title, album, genre, year) VALUES ('ILLENIUM, Wooli, Grabbitz','You Were Right','ILLENIUM','Electronic',2023);
INSERT INTO songs (artist, title, album, genre, year) VALUES ('Metallica','To Live Is To Die','...And Justice For All','Rock',1988);
INSERT INTO songs (artist, title, album, genre, year) VALUES ('Mac Miller','Good News','Good News','Hip-Hop',2020);
INSERT INTO songs (artist, title, album, genre, year) VALUES ('Louis Armstrong','Blue Turning Grey Over You','Satch Plays Fats','Jazz',1984);
INSERT INTO songs (artist, title, album, genre, year) VALUES ('John Denver','Take Me Home, Country Roads','Poems, Prayers, and Promises','Country',1971);
INSERT INTO songs (artist, title, album, genre, year) VALUES ('Andrew Bird','Chorus of the Swan','Ballad of the Red Shoes','Classical',2001);
INSERT INTO songs (artist, title, album, genre, year) VALUES ('Kiesza','Hideaway','Sound Of A Woman','Pop',2014);
INSERT INTO songs (artist, title, album, genre, year) VALUES ('Loudon Wainwright III','Lullaby','Attempted Mustache','Folk',1973);
INSERT INTO songs (artist, title, album, genre, year) VALUES ('Helena Bonham Carter','The Worst Pies in London','Sweeney Todd: The Demon Barber of Fleet Street','Musical Theatre',2007);

INSERT INTO user_songs (user_id, song_id) VALUES (1,1)
INSERT INTO user_songs (user_id, song_id) VALUES (1,2)
INSERT INTO user_songs (user_id, song_id) VALUES (1,3)
INSERT INTO user_songs (user_id, song_id) VALUES (1,4)
INSERT INTO user_songs (user_id, song_id) VALUES (1,5)
INSERT INTO user_songs (user_id, song_id) VALUES (1,6)
INSERT INTO user_songs (user_id, song_id) VALUES (1,7)
INSERT INTO user_songs (user_id, song_id) VALUES (1,8)
INSERT INTO user_songs (user_id, song_id) VALUES (1,9)

COMMIT TRANSACTION;
