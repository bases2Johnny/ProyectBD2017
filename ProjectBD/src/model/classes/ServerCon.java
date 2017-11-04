package model.classes;

import model.Servidor;

public class ServerCon {

    public static String getText(Servidor server) {
        String plantilla = String.format("s% =\n"
                + "  (DESCRIPTION =\n"
                + "    (ADDRESS = (PROTOCOL = TCP)(HOST = s%)(PORT = s%))\n"
                + "    (CONNECT_DATA =\n"
                + "      (SERVER = DEDICATED)\n"
                + "      (SERVICE_NAME = s%)\n"
                + "    )\n"
                + "  )", server.getNombre().toUpperCase(), server.getIp().toUpperCase(),
                server.getPuerto().toUpperCase(), server.getDB().toUpperCase());
        return plantilla;
    }
}
