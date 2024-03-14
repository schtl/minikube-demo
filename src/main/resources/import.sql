// wird nur im DEV Mode ausgeführt (./mvnw clean quarkus:dev)
// quarkus.hibernate-orm.sql-load-script=import.sql in der application.prop läde immer
INSERT INTO vehicle (brand, model) VALUES ('Opel', 'Kadett');
INSERT INTO vehicle (brand, model) VALUES ('VW', 'Käfer 1400');
INSERT INTO vehicle (brand, model) VALUES ('Opel', 'Blitz');
INSERT INTO vehicle (brand, model) VALUES ('VW', 'eGolf');
