package com.email.dao;

import com.email.dto.EmailDB;

public interface EmailDAO {
	public  boolean insertData(String name,String mail,String password,int mailbox);

}
