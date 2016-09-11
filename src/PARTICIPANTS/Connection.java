/*
 * This class will be used to create connection
 * to talk to server.
 */

package PARTICIPANTS;

import java.net.*;
import java.io.*;


/**
 *
 * @author Admin
 */
public class Connection {

   DatagramSocket ds;
    
    public Connection() throws SocketException{
        ds = new DatagramSocket(50074); 
    }
    
     public void getConnection(String ip, String port) throws UnknownHostException, IOException{
    
    int iPort = Integer.parseInt(port);
    
    byte[] ms = new byte[1024]; 
    String a=ip+":"+port;
    ms=a.getBytes();
    DatagramPacket ps = new DatagramPacket(ms, ms.length, InetAddress.getByName(ip),iPort); 
    ds.send(ps);

}
    
}
