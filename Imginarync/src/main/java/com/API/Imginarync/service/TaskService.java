package com.API.Imginarync.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.API.Imginarync.Database.databaseClass;

import com.API.Imginarync.model.Task;

public class TaskService {
	Connection conn = databaseClass.Dbconnect();
	public List<Task> getTask() {
		List <Task> tasks = new ArrayList<>();
		String sql = "select * from task";
		try {
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery(sql);
		while(rs.next()) {
		
			Task tsk = new Task();
			
			tsk.setT_Id(rs.getInt(1));
			tsk.setTask_name(rs.getString(2));
			tsk.setDescription(rs.getString(3));
			tsk.setStart_date(rs.getDate(4));
			tsk.setEnd_date(rs.getDate(5));
			tsk.setNumbe_of_hours(rs.getInt(6));
			tsk.setOvertime(rs.getInt(7));
			tasks.add(tsk);
			
		}
		}
		catch(Exception e) {
			 System.out.println(e);
		}
		return tasks;
		
	}
	public Task getTask(int T_Id) {
		String sql = "select * from task where T_Id="+T_Id ;
		Task tsk = new Task();
		try {
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery(sql);
		if(rs.next()) {
		
			
			tsk.setT_Id(rs.getInt(1));
			tsk.setTask_name(rs.getString(2));
			tsk.setDescription(rs.getString(3));
			tsk.setStart_date(rs.getDate(4));
			tsk.setEnd_date(rs.getDate(5));
			tsk.setNumbe_of_hours(rs.getInt(6));
			tsk.setOvertime(rs.getInt(7));
			
		}
		}
		catch(Exception e) {
			 System.out.println(e);
		} 
		return tsk;
	}
	public void create(Task tsk) {
		// TODO Auto-generated method stub
		String sql = "insert into task values(?,?,?,?,?,?,?)"; 
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1,tsk.getT_Id());
			st.setString(2,tsk.getTask_name());
			st.setString(3,tsk.getDescription());
			st.setDate(4, tsk.getStart_date());
			st.setDate(5, tsk.getEnd_date());
			st.setInt(6, tsk.getNumbe_of_hours());
			st.setInt(7, tsk.getOvertime());
			st.executeUpdate();
		
			}
			catch(Exception e) {
				 System.out.println(e);
			} 
	}
	public void update(Task tsk) {
		// TODO Auto-generated method stub
		String sql ="update task set Task_name=?,Description=?,Start_date=?,End_date=?,Number_of_hours=?,Overtime=? where T_Id=? " ; 
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			
			
			st.setString(1,tsk.getTask_name());
			st.setString(2,tsk.getDescription());
			st.setDate(3, tsk.getStart_date());
			st.setDate(4, tsk.getEnd_date());
			st.setInt(5, tsk.getNumbe_of_hours());
			st.setInt(6, tsk.getOvertime());
			st.setInt(7,tsk.getT_Id());
			st.executeUpdate();
			}
			catch(Exception e) {
				 System.out.println(e);
			} 
	}
	public void delete(int t_Id) {
		// TODO Auto-generated method stub
		String sql ="delete from task where T_Id=? " ; 
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1,t_Id);
			st.executeUpdate();
		
			}
			catch(Exception e) {
				 System.out.println(e);
			} 
		
	}
}
