package com.springdata;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc1.Secondspjdbc;

public class SecondspImpl implements Secondspdata {

	private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
	
	@Override
	public void insert(Secondspjdbc a) {

		String sql = "INSERT INTO custjdbc VALUES(?,?,?)";
		Object[] arg = {a.getCsid(),a.getCsname(),a.getCssal()};
		int c = jdbcTemplate.update(sql,arg);
		
		System.out.println("No of row inserted is "+c);

	}
     
	public DataSource getDataSource()
	{
		String url = "jdbc:mysql://localhost:3306/springdb";
		String username = "root";
		String password = "Rove@123";
		DataSource dataSource = new DriverManagerDataSource(url, username, password);
		return dataSource;
	}
	
}
