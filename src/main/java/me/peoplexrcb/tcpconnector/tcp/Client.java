package me.peoplexrcb.tcpconnector.tcp;

import java.net.Socket;

public class Client {
    private Socket socket;

    public Client(String address, int port) {
        try {
            this.socket = new Socket(address, port);
            new ClientWaitMessageThread().start();
        } catch (Exception e) {
        }
    }

    public Socket getSocket() {
        return socket;
    }

    public void closeConnection() {
        try {
            socket.close();
        } catch (Exception e) {
        }
    }
}