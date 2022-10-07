package me.peoplexrcb.tcpconnector.tcp;

import me.peoplexrcb.tcpconnector.TCPConnectorMod;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;

public class ClientWaitMessageThread extends Thread {
    @Override
    public void run() {
        try {
            DataInputStream in = (DataInputStream) TCPConnectorMod.INSTANCE.getClient().getSocket().getInputStream();
            String phrase = in.readUTF();

            TCPConnectorMod.INSTANCE.setPhrase(phrase);
            TCPConnectorMod.INSTANCE.getClient().closeConnection();
        } catch (Exception e) {
        }
    }
}