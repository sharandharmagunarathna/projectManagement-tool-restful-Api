package com.API.Imginarync.service;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import com.API.Imginarync.Database.databaseClass;
import com.API.Imginarync.model.Project;

public class ProjectService {
	 
	Connection conn = databaseClass.Dbconnect();
	


	public List <Project> getProjects(){
		List <Project> projects = new ArrayList<>();
		String sql = "SELECT p.p_Id,p.project_name ,d.d_Id,p.m_Id,d.hours,d.overtime,d.contribution,p.start_date,p.end_date  from project p, developer_project d where p.p_Id=d.p_Id";
		try {
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery(sql);
		while(rs.next()) {
		
			Project prj = new Project();
			prj.setP_Id(rs.getInt(1));
			prj.setProject_name(rs.getString(2));
			prj.setD_Id(rs.getInt(3));
			prj.setM_Id(rs.getInt(4));
			prj.setHours(rs.getInt(5));
			prj.setOvertime(rs.getInt(6));
			prj.setContribution(rs.getString(7));
			prj.setStart_date(rs.getDate(8));
			prj.setEnd_date(rs.getDate(9));
			projects.add(prj);
			
		}
		}
		catch(Exception e) {
			 System.out.println(e);
		}
		return projects;
		
	}
	public Project getProject(int P_Id) {
		String sql = "SELECT p.p_Id,p.project_name ,d.d_Id,p.m_Id,d.hours,d.overtime,d.contribution,p.start_date,p.end_date from project p, developer_project d where p.p_Id=d.p_Id && p.p_Id="+P_Id;
		Project prj = new Project();
		try {
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery(sql);
		while(rs.next()) {
		

			
			prj.setP_Id(rs.getInt(1));
			prj.setProject_name(rs.getString(2));
			prj.setD_Id(rs.getInt(3));
			prj.setM_Id(rs.getInt(4));
			prj.setHours(rs.getInt(5));
			prj.setOvertime(rs.getInt(6));
			prj.setContribution(rs.getString(7));
			prj.setStart_date(rs.getDate(8));
			prj.setEnd_date(rs.getDate(9));
			
		
			
		}
		}
		catch(Exception e) {
			 System.out.println(e);
		} 
		return prj;
	}

	
	public List <Project> getdeveloperProject(int d_Id,int p_Id) {
		// TODO Auto-generated method stub
		List <Project> projects = new ArrayList<>();
		String sql = "SELECT p.p_Id,p.project_name ,d.d_Id,p.m_Id,d.hours,d.overtime,d.contribution,p.start_date,p.end_date from project p, developer_project d where p.p_Id=d.p_Id and d.d_Id="+d_Id+" and p.p_Id="+p_Id ;
		try {
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery(sql);
		while(rs.next()) {
		

			Project prj = new Project();
			prj.setP_Id(rs.getInt(1));
			prj.setProject_name(rs.getString(2));
			prj.setD_Id(rs.getInt(3));
			prj.setM_Id(rs.getInt(4));
			prj.setHours(rs.getInt(5));
			prj.setOvertime(rs.getInt(6));
			prj.setContribution(rs.getString(7));
			prj.setStart_date(rs.getDate(8));
			prj.setEnd_date(rs.getDate(9));
			projects.add(prj);
		
			
		}
		}
		catch(Exception e) {
			 System.out.println(e);
		} 
		return projects;

		
	}
	
	public List<Project> getmanagerProject(int m_Id) {
		List <Project> projects = new ArrayList<>();
		String sql = "SELECT p.p_Id,p.project_name ,d.d_Id,p.m_Id,d.hours,d.overtime,d.contribution,p.start_date,p.end_date from project p, developer_project d where p.p_Id=d.p_Id && p.m_ID=" +m_Id ;
		
		try {
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery(sql);
		while(rs.next()) {
		

			Project prj = new Project();
			prj.setP_Id(rs.getInt(1));
			prj.setProject_name(rs.getString(2));
			prj.setD_Id(rs.getInt(3));
			prj.setM_Id(rs.getInt(4));
			prj.setHours(rs.getInt(5));
			prj.setOvertime(rs.getInt(6));
			prj.setContribution(rs.getString(7));
			prj.setStart_date(rs.getDate(8));
			prj.setEnd_date(rs.getDate(9));
			projects.add(prj);
		
			
		}
		}
		catch(Exception e) {
			 System.out.println(e);
		} 
		return projects;

	}
	
	
	public Project getdeveloperOvertime(int d_Id) {
		String sql = "SELECT  d_Id,overtime from developer_project where d_id="+d_Id ;
		Project prj = new Project();
		try {
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery(sql);
		while(rs.next()) {
		

			
			
			prj.setD_Id(rs.getInt(1));
			prj.setOvertime(rs.getInt(2));
			
			
			
		
			
		}
		}
		catch(Exception e) {
			 System.out.println(e);
		} 
		return prj;
	}
	
	
	
	
	public void createDevProject(Project prj) {
		
		String sql = "insert into developer_project values(?,?,?,?,?)"; 
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1,prj.getD_Id());
			st.setInt(2,prj.getP_Id());
			st.setInt(3, prj.getHours());
			st.setInt(4, prj.getOvertime());
			st.setString(5, prj.getContribution());
			
			st.execute();
			calContribution(prj.getP_Id());
			}
			catch(Exception e) {
				 System.out.println(e);
			} 
	}
	
	

	
	
	public void update(Project prj) {
		String sql ="update project set project_name=?,m_Id=?,start_date=?, end_date=? where p_Id=?" ; 
		try {
			PreparedStatement st = conn.prepareStatement(sql);

			st.setInt(5,prj.getP_Id());
			st.setString(1,prj.getProject_name());
			st.setInt(2,prj.getM_Id());
			st.setDate(3, prj.getStart_date());
			st.setDate(4, prj.getEnd_date());
			
			st.executeUpdate();
			}
			catch(Exception e) {
				 System.out.println(e);
			} 
	}
	
	public void delete(int p_Id) {
		
		String sql ="delete from project where P_Id=? " ; 
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1,p_Id);
			st.executeUpdate();
			
		
			}
			catch(Exception e) {
				 System.out.println(e);
			} 
		
	}
	public void createNewProject(Project prj) {
		// TODO Auto-generated method stub
		
		String sql = "insert into project values(?,?,?,?,?,?)"; 
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1,0);
			st.setInt(2,prj.getP_Id());
			st.setString(3,prj.getProject_name());
			st.setInt(4, prj.getM_Id());
			st.setDate(5, prj.getStart_date());
			st.setDate(6, prj.getStart_date());
			
			st.execute();
		
			}
			catch(Exception e) {
				 System.out.println(e);
			} 

		
	}
	
public void calContribution(int p_ID) {
	boolean sell=false;
	int count=0;

	int i=0;
	String sql="SELECT sum(hours) As 'tot',count(p_Id) from developer_project where p_Id ="+p_ID;
	String sql1="SELECT d_Id,hours from developer_project where p_Id ="+p_ID;
	double tot=0;
	try {
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery(sql);
		while(rs.next()) {
		 tot=rs.getDouble(1);
		 count=rs.getInt(2);	
		     }
		 sell =true;
		}
		catch(Exception e) {
			 System.out.println(e);
		      }
	int did[] = new int[count];
	double contri[]=new double[count];
	if(sell) {		
	try {
		Statement stm = conn.createStatement();
		ResultSet rst =stm.executeQuery(sql1);
		while(rst.next()) {
		int d_Id=rst.getInt(1);
		double hours=rst.getDouble(2);
		double cont=(hours/tot)*100;
		did[i]=d_Id;
		contri[i]=Math.round(cont);
		i++;
	    	}//while
		}
		catch(Exception e) {
			 System.out.println("loku eka"+e);
		} 
	

}
	
	
	
	////////////////////////////////////update
	
		
		
	for(int j=0; j<did.length;j++) {
		 System.out.println(did[j]+" "+contri[j]);
		try {
			
	String sql2="update developer_project set contribution=? where d_Id=? and p_Id=?";
		PreparedStatement st = conn.prepareStatement(sql2);
		st.setDouble(1,contri[j]);
		st.setInt(2,did[j]);
		st.setInt(3,p_ID);
		
		st.executeUpdate();
	}
		
	catch(Exception e) {
		 System.out.println(e);
	                  }
	}
	}
public void updateDevProject(Project prj) {
	String sql ="update developer_project set d_Id=?,hours=?,overtime=?,contribution=? where p_Id=?"; 
	try {
		PreparedStatement st = conn.prepareStatement(sql);

		
		st.setInt(1,prj.getD_Id());
		st.setInt(2, prj.getHours());
		st.setInt(3, prj.getOvertime());
		st.setString(4, prj.getContribution());
		st.setInt(5,prj.getP_Id());
		st.executeUpdate();
	//	calContribution(prj.getP_Id());
		}
		catch(Exception e) {
			 System.out.println(e);
		} 
	
}
public List<Project> getDevProject() {
	List <Project> projects = new ArrayList<>();
	String sql = "Select * from developer_project";
	try {
	Statement st = conn.createStatement();
	ResultSet rs =st.executeQuery(sql);
	while(rs.next()) {
	
		Project prj = new Project();
		prj.setD_Id(rs.getInt(1));
	    prj.setP_Id(rs.getInt(2));
		prj.setHours(rs.getInt(3));
		prj.setOvertime(rs.getInt(4));
		prj.setContribution(rs.getString(5));
		
		projects.add(prj);
		
	}
	}
	catch(Exception e) {
		 System.out.println(e);
	}
	return projects;
	
}
	
	
	
}









