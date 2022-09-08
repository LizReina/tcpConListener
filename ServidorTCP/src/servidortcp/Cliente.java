/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidortcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.*;
// importar la libreria java.net
import java.io.*;
// importar la libreria java.io

/**
 *
 * @author bismart
 */
public class Cliente {
    
    
    // método principal de la clase
 public static void main(String argv[]) {
 
// Creamos una instancia BuffererReader en la
// que guardamos los datos introducido por el usuario
 
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
// declaramos un objeto socket para realizar la comunicación
 Socket socket;
 
// declaramos e instanciamos un objeto de tipo byte
 byte[] mensaje_bytes = new byte[256];
 
// declaramos una variable de tipo string
 String mensaje="";
 
// Declaramos un bloque try y catch para controlar la ejecución del subprograma
 try {
 
// Instanciamos un socket con la dirección del destino y el
// puerto que vamos a utilizar para la comunicación
 socket = new Socket("127.0.0.1",6000);
 
// Declaramos e instanciamos el objeto DataOutputStream
// que nos valdrá para enviar datos al servidor destino
 DataOutputStream out =
 new DataOutputStream(socket.getOutputStream());
 
// Creamos un bucle do while en el que enviamos al servidor el mensaje
// los datos que hemos obtenido despues de ejecutar la función
// "readLine" en la instancia "in"
 
 do {
 mensaje = in.readLine();
// enviamos el mensaje codificado en UTF
 out.writeUTF(mensaje);
// mientras el mensaje no encuentre la cadena fin, seguiremos ejecutando
// el bucle do-while
 } while (true);
 }
// utilizamos el catch para capturar los errores que puedan surgir
 catch (Exception e) {
// si existen errores los mostrará en la consola y después saldrá del
// programa
 System.err.println(e.getMessage());
 System.exit(1);
 }
 }
}

