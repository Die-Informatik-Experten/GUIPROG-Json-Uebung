package org.example.model;

import org.example.control.CarController;
import org.example.util.Constants;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    private ServerSocket serverSocket;

    private static Server instance;

    public static Server getInstance()
    {
        // Requests Server and then creates a new one or returns Server
        return instance == null ? instance = new Server() : instance;
    }

    private Server()
    {
        try
        {
            serverSocket = new ServerSocket(Constants.PORT);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void start()
    {
        Socket client;
        PrintWriter printWriter;
        try
        {
            while(true)
            {
                client = serverSocket.accept();
                printWriter = new PrintWriter(client.getOutputStream(), true);
                printWriter.println(CarController.createExample().toJSON());
                printWriter.close();
                client.close();
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

}
