package com.API.Imginarync.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.API.Imginarync.Database.databaseClass;
import com.API.Imginarync.model.Manager;


public class ManagerService {
	 
	Connection conn = databaseClass.Dbconnect();
	


	public List <Manager> getManagers(){
		List <Manager> managers = new ArrayList<>();
		String sql = "select * from manager";
		try {
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery(sql);
		while(rs.next()) {
		
			Manager mng = new Manager();
			mng.setM_Id(rs.getInt(1));
			mng.setFirst_name(rs.getString(2));
			mng.setLast_name(rs.getString(3));
			
			mng.setEmail(rs.getString(4));
			mng.setTel_number(rs.getString(5));
			
			managers.add(mng);
			
		}
		}
		catch(Exception e) {
			 System.out.println(e);
		}
		return managers;
		
	}
	public Manager getManager(int M_Id) {
		String sql = "select * from manager where M_Id="+M_Id ;
		Manager mng = new Manager();
		try {
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery(sql);
		if(rs.next()) {
		
			
			mng.setM_Id(rs.getInt(1));
			mng.setFirst_name(rs.getString(2));
			mng.setLast_name(rs.getString(3));
		
			mng.setEmail(rs.getString(4));
			mng.setTel_number(rs.getString(5));
			
		
			
		}
		}
		catch(Exception e) {
			 System.out.println(e);
		} 
		return mng;
	}

	public void create(Manager mng) {
		
		String sql = "insert into manager values(?,?,?,?,?)"; 
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1,mng.getM_Id());
			st.setString(2, mng.getFirst_name());
			st.setString(3, mng.getLast_name());
		
			st.setString(4, mng.getEmail());
			st.setString(5, mng.getTel_number());
			st.executeUpdate();
		
			}
			catch(Exception e) {
				 System.out.println(e);
			} 
	}
	
	public void update(Manager mng) {
		String sql ="update manager set First_name=?,Last_name=?,Email=?,Tel_number=? where M_Id=? " ; 
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, mng.getFirst_name());
			st.setString(2, mng.getLast_name());
			
			st.setString(3, mng.getEmail());
			st.setString(4, mng.getTel_number());
			st.setInt(5,mng.getM_Id());
			st.executeUpdate();
		
			}
			catch(Exception e) {
				 System.out.println(e);
			} 
	}
	
	public void delete(int m_Id) {
		
		String sql ="delete from manager where M_Id=? " ; 
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1,m_Id);
			st.executeUpdate();
		
			}
			catch(Exception e) {
				 System.out.println(e);
			} 
		
	}
	
	
	
}









