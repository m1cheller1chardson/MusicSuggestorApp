BEGIN TRANSACTION;

DROP TABLE IF EXISTS users;

CREATE TABLE users (
	user_id SERIAL,
	username varchar(50) NOT NULL UNIQUE,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE songs (
    song_id SERIAL,
    artist VARCHAR(100),
    title VARCHAR(200),
    album VARCHAR(200),
    genre VARCHAR(100),
    year INTEGER
);

CREATE TABLE user_songs (
    user_id INTEGER,
    song_id INTEGER,
    favorited BOOLEAN,
    date DATE,
    PRIMARY KEY (user_id, cookout_id),
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users(user_id),
    CONSTRAINT fk_song_id FOREIGN KEY (song_id) REFERENCES songs(song_id)
);

COMMIT TRANSACTION;
