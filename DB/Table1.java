// Column Name	Data Type	Constraint	Description
// MId	INTEGER	PRIMARY KEY		Unique Match Id for a tournament
// TId	INTEGER	FOREIGN KEY	Existing tournament Id present in tournament table
// Player1	INTEGER	FOREIGN KEY	Player1 should not be equal to Player2	Existing player Id present in player table
// Player2	INTEGER	FOREIGN KEY	Existing player Id present in player table
// MatchDt	DATE	NOT NULL	Match Date
// Winner	INTEGER	FOREIGN KEY	Existing player Id present in Player table
// Score	VARCHAR2(30)	NOT NULL	Match Score
// Write your query here


CREATE TABLE Match(
MId integer,
TId integer,
Player1 integer,
Player2 integer,
MatchDt date CONSTRAINT mt_nn NOT NULL,
Winner integer,
Score varchar2(30) CONSTRAINT s_nn NOT NULL,
CONSTRAINT m_PK PRIMARY KEY(MId, TId),
CONSTRAINT w_FK FOREIGN KEY (winner) REFERENCES Player(PId),
CONSTRAINT m_FK FOREIGN KEY(TId) REFERENCES Tournament(TId),
CONSTRAINT p1_Fk FOREIGN KEY (Player1) REFERENCES Player(PId),
CONSTRAINT p2_FK FOREIGN KEY (Player2) REFERENCES Player(PId),
CONSTRAINT Player_check CHECK (Player1 <> Player2));
