create or replace type Dia as object(
    -- ATRIBUTOS DEL OBJETO 
	nombre varchar2(10),
	hora varchar2(10),
	-- CONSTRUCTOR DEL OBJETO	
	constructor function Dia(a varchar2) return self as result,
	--FUNCIONES
	member function getNombre return varchar2,
	member function getHora return varchar2
);
/

create or replace type body Dia
IS
	-- CONSTRUCTOR DEL OBJETO
	constructor function Dia(a varchar2) return self as result
	is
		begin
			self.nombre := a;
			self.hora := a;
		return;
	end;
	member function getNombre return varchar2
	is
		begin
			return self.nombre;
	end;
	member function getHora return varchar2
	is
		begin
			return self.hora;
	end;
END;	
/

create type Dias as table of Dia;
/
---------------------------------------------------------------------------------------
create or replace type Tablespace as object(
    -- ATRIBUTOS DEL OBJETO 
	nombre varchar2(10),
	-- CONSTRUCTOR DEL OBJETO	
	constructor function Tablespace(a varchar2) return self as result,
	--FUNCIONES
	member function getNombre return varchar2
);
/

create or replace type body Tablespace
IS
	-- CONSTRUCTOR DEL OBJETO
	constructor function Tablespace(a varchar2) return self as result
	is
		begin
			self.nombre := a;
		return;
	end;
	member function getNombre return varchar2
	is
		begin
			return self.nombre;
	end;
END;	
/

create type Tablespaces as table of Tablespace;
/
----------------------------------------------------------------------------------------
create or replace type DataFile as object(
    -- ATRIBUTOS DEL OBJETO 
	nombre varchar2(10),
	-- CONSTRUCTOR DEL OBJETO	
	constructor function DataFile(a varchar2) return self as result,
	--FUNCIONES
	member function getNombre return varchar2
);
/

create or replace type body DataFile
IS
	-- CONSTRUCTOR DEL OBJETO
	constructor function DataFile(a varchar2) return self as result
	is
		begin
			self.nombre := a;
		return;
	end;
	member function getNombre return varchar2
	is
		begin
			return self.nombre;
	end;
END;	
/

create type DataFiles as table of DataFile;
/




----------------------------------------------------------------------------------------
create table estrategias (dias Dias, tipo varchar2(20),tablespaces Tablespaces,dtfile DataFiles);
























