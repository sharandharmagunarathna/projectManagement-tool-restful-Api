package com.API.Imginarync.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Manager {
	private int m_Id;
	private String first_name;
	private String last_name;
	private String email;
	private String tel_number;
	public int getM_Id() {
		return m_Id;
	}
	public void setM_Id(int m_Id) {
		this.m_Id = m_Id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel_number() {
		return tel_number;
	}
	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}
	@Override
	public String toString() {
		return "Developer [m_Id=" + m_Id + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", tel_number=" + tel_number + "]";
	}
	
}
