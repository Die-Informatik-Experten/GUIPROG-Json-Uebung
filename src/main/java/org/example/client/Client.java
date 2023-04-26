package org.example.client;

import org.example.util.Constants;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client
{
    public static void main(String[] args)
    {
        try
        {
            Socket socket = new Socket(Constants.IP_ADDRESS, Constants.PORT);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
            socket.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
