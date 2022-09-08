/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidortcp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author bismart
 */
public class Listener extends Thread {

    public Listener() {

    }

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(6000);
            
             System.out.println("servidor escuchando esperando cliente");
            Socket socket_cli = serverSocket.accept();
            
            DataInputStream in
                    = new DataInputStream(socket_cli.getInputStream());
            
            while (true) {
                String mensaje = "";
                mensaje = in.readUTF();
                System.out.println("cliente: " + mensaje);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
