/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidortcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author bismart
 */
public class ServidorTCP {
 
    
    public ServidorTCP() {

    }
    
    public void initServer(){
        new Listener().start();
    }
    
}
