package com.email.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.email.dto.EmailDB;
import com.email.connection.Connector;

public class EmailDAOImpl implements EmailDAO{
private Connection con;
	
	public EmailDAOImpl()
	{
		this.con=Connector.requestConnection();
	}

	

	@Override
	public boolean insertData(String name,String email,String password,int mailbox) {
		String query="insert into emaildb values(?,?,?,?)";
		int i =0;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setInt(4, mailbox);
			i =ps.executeUpdate();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}

}
