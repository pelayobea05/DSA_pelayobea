/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crud_access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Crud_Access {

    public static void main(String[] args) {

        try {

            String url = "jdbc:ucanaccess://YOUR_ACCESS_PATH";

            Connection con = DriverManager.getConnection(url);

            System.out.println("Connected to Access!");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM Students");

            while (rs.next()) {

                System.out.println("ID: " + rs.getInt("ID"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Section: " + rs.getString("section"));
                System.out.println("Course: " + rs.getString("course"));

                System.out.println("--------------------");
            }

            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
