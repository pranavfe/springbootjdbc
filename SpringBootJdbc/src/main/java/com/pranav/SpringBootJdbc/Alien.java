package com.pranav.SpringBootJdbc;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	private int id;
	private String pname;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", pname=" + pname + ", email=" + email + "]";
	}

}
