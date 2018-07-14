package com.pranav.SpringBootJdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("repository")

@Repository
class AlienReposit {
	@Autowired
	DataSource datasource;
	
	@Autowired 
	
	Alien a1;

	public Alien getAlien(int i) {
		Alien a = new Alien();
		try {
			Connection con = datasource.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Alien where id=" + i);
			if (rs.next()) {
				a.setId(rs.getInt(1));
				a.setEmail(rs.getString(3));
				a.setPname(rs.getString(2));
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

}
