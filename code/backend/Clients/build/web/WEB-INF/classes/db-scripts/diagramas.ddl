ALTER TABLE BiometricData DROP FOREIGN KEY FKBiometricD753774;
DROP TABLE IF EXISTS Client;
DROP TABLE IF EXISTS BiometricData;
DROP TABLE IF EXISTS `User`;
CREATE TABLE Client (Username varchar(255) NOT NULL, Password varchar(255), Name varchar(255), Email varchar(255), Sex varchar(255), Birthday date, PRIMARY KEY (Username));
CREATE TABLE BiometricData (ID int(10) NOT NULL AUTO_INCREMENT, ClientUsername varchar(255) NOT NULL, Height int(10) NOT NULL, Weight float NOT NULL, Wrist int(10) NOT NULL, Chest int(10) NOT NULL, Tricep int(10) NOT NULL, Waist int(10) NOT NULL, Quadricep int(10) NOT NULL, Twin int(10) NOT NULL, `Date` date, BMI float NOT NULL, PRIMARY KEY (ID));
CREATE TABLE `User` (Username varchar(255) NOT NULL, Token varchar(255), PRIMARY KEY (Username));
ALTER TABLE BiometricData ADD CONSTRAINT FKBiometricD753774 FOREIGN KEY (ClientUsername) REFERENCES Client (Username);
