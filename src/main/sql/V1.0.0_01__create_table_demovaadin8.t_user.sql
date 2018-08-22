CREATE TABLE demovaadin8.t_user (
  id       SERIAL,
  username TEXT    NOT NULL,
  password TEXT    NOT NULL,
  admin    BOOLEAN NOT NULL,

  PRIMARY KEY (id),
  UNIQUE (username)
);

INSERT INTO demovaadin8.t_user (username, password, admin)
VALUES ('admin', '$2a$13$byD4Ftv39Z76hUfd01URsePSdaV722c7J7NcLfs6o3KdJsAwHhEjq', TRUE);
INSERT INTO demovaadin8.t_user (username, password, admin)
VALUES ('user', '$2a$13$byD4Ftv39Z76hUfd01URsePSdaV722c7J7NcLfs6o3KdJsAwHhEjq', FALSE);
