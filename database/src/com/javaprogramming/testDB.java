package com.javaprogramming;

import java.sql.*;

public class testDB {

    public static void main(String[] args) {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn= DriverManager.getConnection("jdbc:sqlite:E:\\Programming\\Java\\database\\test.db");
            Statement statement=conn.createStatement();
//            conn.setAutoCommit(false);
//            statement.execute("CREATE TABLE IF NOT EXISTS contacts1(name text,phone integer,email text)");
//            statement.execute("INSERT INTO CONTACTS(name,phone,email) values"+
//                    "('sai9',345678,'sai@gmail.com')"
//                    );
            statement.execute("select * from contacts");
            ResultSet results=statement.getResultSet();
            while (results.next()){
                System.out.println(
                        results.getString("name")
                +" "+
                                results.getInt("phone")
                );
            }
            statement.close();
            conn.close();
        }catch(SQLException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
