CREATE DATABASE Semana88
GO
USE Semana88
GO
CREATE TABLE FCITASMEDICAS(

    Motivocita NVARCHAR(255),
    Especialidad NVARCHAR(100),
    MedicoDisponible NVARCHAR(100),
    Sede NVARCHAR(100),
    Fecha DATE,
    Hora TIME,
    DetallesRegistrados NVARCHAR(MAX)
);

GO
INSERT INTO FCITASMEDICAS VALUES('Consulta anual', 'Ginecología', 'Freddy', 'Lima Norte', '2025-05-22', '14:00:00', 'Paciente desea control general.');
INSERT INTO FCITASMEDICAS VALUES('Revision de piel', 'Dermatologia', 'Juan', 'Callao', '2025-05-23', '16:00:00', 'Posible alergia de brazo.');
INSERT INTO FCITASMEDICAS VALUES('Consulta anual', 'Ginecología', 'Julio', 'Chepen', '2025-05-24', '13:00:00', 'Paciente desea chequeo general.');
INSERT INTO FCITASMEDICAS VALUES('Consulta anual', 'Ginecología', 'julio', 'Chepen', '2025-05-22', '14:00:00', 'Paciente desea control general.');
INSERT INTO FCITASMEDICAS VALUES('Consulta anual', 'Ginecología', 'juan', 'Callao', '2025-05-22', '14:00:00', 'Paciente desea control general.');
INSERT INTO FCITASMEDICAS VALUES('Consulta anual', 'Ginecología', 'Freddy', 'Lima Norte', '2025-05-22', '14:00:00', 'Paciente desea control general.');
INSERT INTO FCITASMEDICAS VALUES('Consulta anual', 'Ginecología', 'Freddy', 'Lima Norte', '2025-05-22', '14:00:00', 'Paciente desea control general.');
SELECT * FROM FCITASMEDICAS;
SELECT * FROM FCITASMEDICAS
WHERE Hora > '15:00';
GO

USE Semana88;
GO

CREATE OR ALTER PROCEDURE usp_ListarCitasMedicas

AS
BEGIN
    SELECT 
        MotivoCita,
        Especialidad,
        MedicoDisponible,
        Sede,
        Fecha,
        Hora,
        DetallesRegistrados
    FROM FCITASMEDICAS;
END
GO
CREATE OR ALTER PROCEDURE usp_InsertarCita
    @MotivoCita VARCHAR(255),
    @Especialidad VARCHAR(100),
    @MedicoDisponible VARCHAR(100),
    @Sede VARCHAR(100),
	@Fecha DATE,
    @Hora TIME,
    @DetallesRegistrados NVARCHAR(MAX)
AS
BEGIN
    INSERT INTO FCITASMEDICAS ( MotivoCita, Especialidad, MedicoDisponible, Sede,Fecha,Hora,DetallesRegistrados)
    VALUES (@MotivoCita, @Especialidad, @MedicoDisponible, @Sede,@Fecha,@Hora,@DetallesRegistrados);

END;


GO
USE Semana88;
GO
USE Semana88
GO

CREATE TABLE Estudiantes (
    ID INT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    correo_electronico VARCHAR(100),
    facultad VARCHAR(100) 
);
GO


INSERT INTO Estudiantes 
VALUES (56989565, 'Carlos', 'Figueroa', 'Carlosfigueroa@gmail.com', 'medicina');

INSERT INTO Estudiantes 
VALUES (68978545, 'Juan', 'Rodrigues', 'JuanRodrigues@gmail.com', 'ing.industrial');

INSERT INTO Estudiantes 
VALUES (25645874, 'Jose', 'Estrada', 'JoseEstrada@gmail.com', 'sistemas');

INSERT INTO Estudiantes 
VALUES (32658985, 'Edwin', 'Ramirez', 'EdwinRamirez@gmail.com', 'medicina');

INSERT INTO Estudiantes 
VALUES (21548987, 'Miguel', 'Cisneros', 'MiguelCisneros@gmail.com', 'diseño');

INSERT INTO Estudiantes 
VALUES (96569569, 'Pedro', 'Balta', 'PedroBalta@gmail.com', 'computacion');

INSERT INTO Estudiantes 
VALUES (32656325, 'Luis', 'Erquimedes', 'LuisErquimedes@gmail.com', 'administracion');
GO


SELECT * FROM Estudiantes;

-- 
SELECT * FROM Estudiantes 
WHERE CAST(ID AS VARCHAR) LIKE '96569569%';

USE Semana88;
GO
USE Semana88
GO
CREATE OR ALTER PROCEDURE usp_MostrarEstudiantes

AS
BEGIN
    SELECT 
        ID,
        nombre,
        apellido,
        correo_electronico,
        facultad
    FROM Estudiantes;
END
GO

CREATE OR ALTER PROCEDURE usp_InsertarEstudiante
    @ID INT,
    @nombre VARCHAR(50),
    @apellido VARCHAR(50),
    @correo_electronico VARCHAR(100),
    @facultad VARCHAR(50)
AS
BEGIN
    INSERT INTO Estudiantes (ID, nombre, apellido, correo_electronico, facultad)
    VALUES (@ID, @nombre, @apellido, @correo_electronico, @facultad);

END;


GO

CREATE OR ALTER PROCEDURE usp_UltimoEstudiante
AS
BEGIN
    SELECT TOP 1 *
    FROM Estudiantes
    ORDER BY ID DESC;

END;
GO
CREATE OR ALTER PROCEDURE usp_UltimaCita
AS
BEGIN
    SELECT TOP 1 *
    FROM FCITASMEDICAS
    ORDER BY Motivocita DESC;
END;
GO
