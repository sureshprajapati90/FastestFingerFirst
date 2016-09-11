/*
 * This class will be used to create connection
 * to talk to participant.
 */
package AMITABH;

import java.net.*;
import java.io.*;

/**
 *
 * @author Pramod
 */
public class Connection {
  DatagramSocket  ds;
  DatagramPacket ps;  
    public void getConnection()throws IOException{
    ds = new DatagramSocket(5544);
   byte[] ms = new byte[1024];
    ps = new DatagramPacket(ms,ms.length);
   ds.receive(ps);
   System.out.println(new String(ps.getData()));
}
}
