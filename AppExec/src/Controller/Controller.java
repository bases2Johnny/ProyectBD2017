package Controller;

import Model.Estrategia;
import Model.Model;
import java.util.ArrayList;
import java.util.Date;

public class Controller {

    public Controller() {
        this.model = new Model();
    }

    public ArrayList<Estrategia> getEstrategias() {
        return this.model.getEstrategias();
    }

    public void verificar(Date date,Estrategia e) {
        String[] hour = e.getHora().split(":");
        if (date.getHours() == Integer.parseInt(hour[0])) {
            if (date.getMinutes() > Integer.parseInt(hour[1])) {
                if("0".equals(e.getEjecutado())){
                    model.write(e.getEstrategia(), "Backup.txt", "Backups");
                    String bat = "@echo off \n" + "rman target / @C:\\oraclexe\\app\\oracle\\Backups\\Backup.txt \nexit";
                    model.write(bat, "Bat.bat", "Bats");
                    model.execute("Bat");
                    model.update(e.getName());
                }   
            }
        }
    }

    public void execute() {
        Date date = new Date();
        int day = date.getDay();
        String[] days;
        for (Estrategia e : this.getEstrategias()) {
            days = e.getDias().split(",");
            for (String d : days) {
                switch (d) {
                    case "Lunes":
                        if (day == 1) {
                            verificar(date,e);
                        }
                        break;
                    case "Martes":
                        if (day == 2) {
                            verificar(date,e);
                        }
                        break;
                    case "Miercoles":
                        if (day == 3) {
                            verificar(date,e);
                        }
                        break;
                    case "Jueves":
                        if (day == 4) {
                            verificar(date,e);
                        }
                        break;
                    case "Viernes":
                        if (day == 5) {
                            verificar(date,e);
                        }
                        break;
                    case "Sabado":
                        if (day == 6) {
                            verificar(date,e);
                        }
                        break;
                    case "Domingo":
                        if (day == 7) {
                            verificar(date,e);
                        }
                        break;
                }
            }
        }
    }
    private final Model model;
}
