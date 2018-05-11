package com.example.user.send;

import java.sql.Connection;

public class DB extends _Default {

    private Connection conn;
    private String host = "";
    private String db = "android";
    private int port = 2345;
    private String user = "android";
    private String pass = "*android*";

    public DB() {

        super();
    }
}
