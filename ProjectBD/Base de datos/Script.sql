/* ----------------------------- DATABASE LINK ----------------------------- */
-- USUARIO
create user servidor identified by servidor;

grant connect to servidor;

grant dba to servidor;

grant resource to servidor;

-- DATABASE LINK A USUARIO 'nombre'
create public database link nivardo
connect to nivardo identified by nivardo
using '(DESCRIPTION =
    (ADDRESS = (PROTOCOL = TCP)(HOST = 192.168.2.7)(PORT = 1521))
    (CONNECT_DATA =
      (SERVER = DEDICATED)
      (SERVICE_NAME = ORCL)
    )
  )';

-- Para comprobar la conexion 
select * from dual@nivardo;

-- Para eliminar el database link
drop public database link nivardo;

/* ···························· TABLA DE ESTRATEGIAS ···························· */
create table estrategias (name varchar2(20),estrategia varchar2(2000),
dias varchar2(2000),hora varchar2(10),estado varchar2(2),ejecutado varchar2(2));

/* ···························· TABLA DE DATABASE LINK ···························· */

create table databaselinkserver (nombreconexion varchar2(20) , nombredb varchar2(20), ip varchar2(20), 
puerto varchar2(5), username varchar2(50), pass varchar2(50));



























