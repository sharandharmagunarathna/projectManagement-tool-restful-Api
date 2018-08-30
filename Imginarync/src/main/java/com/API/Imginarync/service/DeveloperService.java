package com.API.Imginarync.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.API.Imginarync.Database.databaseClass;
import com.API.Imginarync.model.Developer;


public class DeveloperService {
	 
	Connection conn = databaseClass.Dbconnect();
	


	public List <Developer> getDevelopers(){
		List <Developer> developers = new ArrayList<>();
		String sql = "select * from developer";
		try {
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery(sql);
		while(rs.next()) {
		
			Developer dev = new Developer();
			dev.setD_Id(rs.getInt(1));
			dev.setFirst_name(rs.getString(2));
			dev.setLast_name(rs.getString(3));
			
			dev.setEmail(rs.getString(4));
			dev.setTel_number(rs.getString(5));
			
			developers.add(dev);
			
		}
		}
		catch(Exception e) {
			 System.out.println(e);
		}
		return developers;
		
	}
	public Developer getdeveloper(int D_Id) {
		String sql = "select * from developer where D_Id="+D_Id ;
		Developer dev = new Developer();
		try {
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery(sql);
		if(rs.next()) {
		
			
			dev.setD_Id(rs.getInt(1));
			dev.setFirst_name(rs.getString(2));
			dev.setLast_name(rs.getString(3));
		
			dev.setEmail(rs.getString(4));
			dev.setTel_number(rs.getString(5));
			
		
			
		}
		}
		catch(Exception e) {
			 System.out.println(e);
		} 
		return dev;
	}

	public void create(Developer dev) {
		
		String sql = "insert into developer values(?,?,?,?,?)"; 
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1,dev.getD_Id());
			st.setString(2, dev.getFirst_name());
			st.setString(3, dev.getLast_name());
		
			st.setString(4, dev.getEmail());
			st.setString(5, dev.getTel_number());
			st.executeUpdate();
		
			}
			catch(Exception e) {
				 System.out.println(e);
			} 
	}
	
	public void update(Developer dev) {
		String sql ="update developer set First_name=?,Last_name=?,Email=?,Tel_number=? where D_Id=? " ; 
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, dev.getFirst_name());
			st.setString(2, dev.getLast_name());
			
			st.setString(3, dev.getEmail());
			st.setString(4, dev.getTel_number());
			st.setInt(5,dev.getD_Id());
			st.executeUpdate();
		
			}
			catch(Exception e) {
				 System.out.println(e);
			} 
	}
	
	public void delete(int d_Id) {
		
		String sql ="delete from developer where D_Id=? " ; 
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1,d_Id);
			st.executeUpdate();
		
			}
			catch(Exception e) {
				 System.out.println(e);
			} 
		
	}
	
	
	
}









