DELETE FROM user;
DELETE FROM role;
INSERT INTO user VALUES (1, 'johnJ', 'johnj@here.net', 'johnpassword', 'John', 'Johnson', '1991-01-01', '53594', 'Classical'), (2, 'joeJ', 'joej@there.com', 'joepassword', 'Joe', 'Johnson', '1989-02-08', '53711', 'Metal'), (3, 'kyleS', 'kyles@where.gov', 'kylepassword', 'Kyle', 'Smith', '1991-10-30', '53901', 'Electronic');
INSERT INTO role VALUES (1, 'user', 'johnJ', 1);