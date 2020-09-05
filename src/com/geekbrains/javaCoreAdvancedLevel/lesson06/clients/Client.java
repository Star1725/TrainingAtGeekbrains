package com.geekbrains.javaCoreAdvancedLevel.lesson06.clients;

import java.io.*;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Client {
    private final String IP_ADDRESS = "localhost";
    private final int PORT = 8189;
    private Socket socket;
    private DataInputStream inNet;
    private DataOutputStream outNet;
    private BufferedReader inConsole;
    private static final String NAME_SERVER = "Сервер";
    private static final String NAME_CLIENT = "Клиент";
    private final boolean[] isGetMsgFromNetMore = {false};

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
    public void start(){

        try {
            socket = new Socket(IP_ADDRESS, PORT);
            inNet = new DataInputStream(socket.getInputStream());
            outNet = new DataOutputStream(socket.getOutputStream());
            inConsole = new BufferedReader(new InputStreamReader(System.in));
            //поток для приёма сообщения от сервера и печать в консоль
            new Thread(() -> {
                try {
                    while (true) {
                        //ПРМ
                        String serverMsg = inNet.readUTF();
                        System.out.println(getNameApponent(isGetMsgFromNetMore) + " (" + getCurTime() + "): " + serverMsg);
                        isGetMsgFromNetMore[0] = true;
                        if (serverMsg.equals("/end")) {
                            break;
                        }
                    }
            } catch (IOException e) {
                    e.printStackTrace();
            } finally {
                    try {
                        System.out.println("Server close socket");
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
            }).start();
            //поток для передачи сообщения из консоли к серверу
            new Thread(() -> {
                try {
                    while (true) {
                        //ПРД
                        String clientMsg = inConsole.readLine();
                        isGetMsgFromNetMore[0] = false;
                        outNet.writeUTF(clientMsg);
                        if (clientMsg.equals("/end")) {
                            break;
                        }
                    }
                } catch (IOException e) {
                e.printStackTrace();
                } finally {
                    try {
                        System.out.println("Client close socket");
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getCurTime() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        return dateFormat.format(calendar.getTime());
    }

    private String getNameApponent(boolean[] isGetMsgFromNetMore) {
        return isGetMsgFromNetMore[0] ? new String(new char[NAME_SERVER.length()]).replace("\0", " ") : NAME_SERVER;
    }
}
