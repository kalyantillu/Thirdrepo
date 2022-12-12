package com.Anotherspringjdbc1;

import com.springjdbc1.*;
import com.springdata.*;
public class Secondsptest {

	public static void main(String[] args) {

		Secondspjdbc n = new Secondspjdbc();
		n.setCsid(1001);
		n.setCsname("Mahesh");
		n.setCssal(20000);
		
		Secondspjdbc l = new Secondspjdbc();
		l.setCsid(1002);
		l.setCsname("Naresh");
		l.setCssal(40000);
		
		Secondspdata st = new SecondspImpl();
		st.insert(l);
	}

}
