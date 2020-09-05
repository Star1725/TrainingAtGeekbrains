package com.geekbrains.javaCoreAdvancedLevel.lesson06.servers;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Server {
    private static int PORT = 8189;
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private static final String NAME_SERVER = "Сервер";
    private static final String NAME_CLIENT = "Клиент";

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    public void start(){
        final boolean[] isGetMsgFromNetMore = {false};
        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("Сервер запущен");
            //когда кто-то подключится к serverSocket, он нам вернёт клиентский сокет, и сможенм по нему общаться с тем клиентом
            //который к нам подключился
            clientSocket = serverSocket.accept();
            System.out.println("Клиент подключился");
            //будем читать сообщения клиента - ПРМ
            //Scanner in = new Scanner(clientSocket.getInputStream());//Scanner не очень подходит
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            //будем отправлять сообщения клиенту - ПРД
            //PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);//PrintWriter - не очень подходит
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

            BufferedReader readerServer = new BufferedReader( new InputStreamReader(System.in));

            //приём сообщения от клиента и вывод его в консоль
            new Thread(() -> {
                try {
                    while (true){
                        String clientMsg = in.readUTF();
                        System.out.println(getNameClient(isGetMsgFromNetMore) + " (" + getCurTime() + "): " + clientMsg);
                        isGetMsgFromNetMore[0] = true;
                        if (clientMsg.equals("/end")){
                            System.out.println("Клиент отключился");
                            break;
                        }
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } finally {
                    try {
                        clientSocket.close();
                        serverSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            //получение сообщения из консоли и отправка клиенту
            new Thread(() -> {
                try {
                    while (true) {
                        String serverMsg = readerServer.readLine();
                        isGetMsgFromNetMore[0] = false;
                        out.writeUTF(serverMsg);
                        if (serverMsg.equals("/end")) {
                            System.out.println("Сервер отключился");
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        clientSocket.close();
                        serverSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getNameClient(boolean[] isGetMsgFromNetMore) {
        return isGetMsgFromNetMore[0] ? new String(new char[NAME_CLIENT.length()]).replace("\0", " ") : NAME_CLIENT;
    }

    private String getCurTime() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        return dateFormat.format(calendar.getTime());
    }
}
