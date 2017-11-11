package appexec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import Controller.Controller;
import File.Ejecutar;
import File.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppExec {

    public static void startServer() {
        (new Thread() {
            @Override
            public void run() {
                ServerSocket ss;
                try {
                    //Controller ct = new Controller();
                    ss = new ServerSocket(5000);

                    Socket s = ss.accept();
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(s.getInputStream()));
                    String line = null;
                    System.out.println(s.isConnected());
                    while (true) {
                        System.out.println("Estoy aqui papi...");
                        line = in.readLine();
                        if (line != null) {
                            
                            File f = new File();
                            f.write(line, "backup.txt", "Backups");
                            String plantilla = "@echo off\n" + "rman target / @C:\\oraclexe\\app\\oracle\\Backups\\backup.txt"
                                    + "\n exit";
                            f.write(plantilla, "bat.bat", "Bats");
                            Ejecutar exe = new Ejecutar();
                            exe.cargarBat("bat");
                            line = null;
                            in.close();
                            s.close();
                            ss.close();
                            in = null;
                            s = null;
                            ss = null;
                            ss = new ServerSocket(5000);
                            s = ss.accept();
                            in = new BufferedReader(
                                    new InputStreamReader(s.getInputStream()));
                            //System.out.println(s.isConnected());
                        } else {
                            System.out.println("Fuera del if puto...");
                        }
                    }
                    //System.out.println("Fuera del while puto...");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static void main(String[] args) throws InterruptedException {
        //startServer();
        Thread hilo = (new Thread() {
            @Override
            public void run() {
                Controller ct = new Controller();
                while (true) {
                    ct.execute();
                    try {
                        Thread.sleep(3000);
                        System.out.println("Hola.");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(AppExec.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        startServer();
        hilo.start();
    }

}