package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

public static void main(String[] args) throws SQLException {
	DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root").createStatement().executeUpdate("insert into employee (id, name, gender, salary) values (11, 'Suresh', 'Male', 9200)");
	
	
	System.out.println("Insertion Successful!!");

	}


}
