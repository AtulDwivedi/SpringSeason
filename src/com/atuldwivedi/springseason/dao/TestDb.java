package com.atuldwivedi.springseason.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDb {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?useSSL=false", "root", "root");
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
