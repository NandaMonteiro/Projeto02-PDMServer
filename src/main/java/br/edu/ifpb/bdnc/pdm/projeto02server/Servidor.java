/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.pdm.projeto02server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author NandaPC
 */
public class Servidor {
    
    public static void main(String[] args) throws IOException {
        try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(10998));
        
            Socket socket = serverSocket.accept();
            socket.getOutputStream().write("Hello Word".getBytes());
            socket.getOutputStream().flush();
            
            System.out.println("Hello");
        
        socket.close();
        
        serverSocket.close();
        }
        catch(IOException e){
          e.printStackTrace();
        }
    }
}
