/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

/**
 *
 * @author usuario
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class RemoteBat{

    /**
     * @param args the command line arguments
     */
    private String ip = "";
    private String est = "";
    
    public RemoteBat(String ip, String est){
        this.ip = ip;
        this.est = est;
    }
    
//    public static void main(String[] args) {
//        // TODO code application logic here
//        startSender();
//    }
    
     public void startSender() {
        (new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println(ip);
                    Socket s = new Socket(ip, 5000);
                    BufferedWriter out = new BufferedWriter(
                            new OutputStreamWriter(s.getOutputStream()));

                    while (true) {
                        out.write(est);
                        out.newLine();
                        out.flush();
                        
                        break;                        
                    }
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
        }).start();
    }
}

