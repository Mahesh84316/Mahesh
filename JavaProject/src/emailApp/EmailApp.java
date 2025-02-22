package emailApp;

import java.util.Scanner;

import com.email.dao.EmailDAO;
import com.email.dao.EmailDAOImpl;

public class EmailApp {
	public static void main(String[] args) {
		EmailDAO edao = new EmailDAOImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first name:" );
		String fname = sc.next();
		System.out.println("enter the last name:");
		String lname = sc.next();
		Email e=new Email(fname,lname);
		String name = fname+" "+lname;
		String mail = e.getMail();
		int mailbox = e.getMailbox();
		String pass = e.getPassword();
		edao.insertData(name, mail, pass, mailbox);
		
		
		System.out.println(e.showInfo());
		
	}

}
