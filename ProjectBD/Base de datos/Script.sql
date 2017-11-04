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

























