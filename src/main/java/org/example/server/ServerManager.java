package org.example.server;

import org.example.model.Server;
import org.example.util.Constants;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerManager
{

    public static void main(String[] args)
    {
        Server.getInstance().start();
    }


}
