package com.lee.learn.dp.structualpattern.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {

    private static volatile ConnectionPool connectionPool = null;

    private Vector<Connection> connections;

    /** shared params */
    private String url = "jdbc:mysql//localhost:3306/test";

    private final String user = "root";

    private final String passsword = "password";

    private final String driveName = "com.mysql.jdbc.Driver";

    private int corePoolSize = 1;

    private ThreadLocal<Connection> connection = new ThreadLocal<>();

    public static ConnectionPool getInstance() throws ClassNotFoundException {
        if (connectionPool == null) {
            synchronized (connectionPool) {
                if (connectionPool == null) {
                    connectionPool = new ConnectionPool();
                }
            }
        }
        return connectionPool;
    }

    private ConnectionPool() throws ClassNotFoundException {
        connections = new Vector<>();
        initPool();
    }

    private void initPool() throws ClassNotFoundException {
        corePoolSize = Integer.parseInt(System.getProperty("jdbc.corePoolSize"));
        if (corePoolSize < 0) {
            throw new IllegalArgumentException("corePoolSize can not be less than 0");
        }

        try {
            Class.forName(driveName);
        } catch (ClassNotFoundException e) {
            throw e;
        }
        for (int i = 0; i < corePoolSize; i++) {
            try {
                Connection connection = DriverManager.getConnection(url, user, passsword);
                connections.add(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void release() {
        connections.add(connection.get());
    }

    public Connection getConnection() {
        if (connections.size() > 0) {
            Connection conn = connections.get(0);
            connections.remove(conn);
            connection.set(conn);
            return conn;
        } else {
            return null;
        }
    }

}
