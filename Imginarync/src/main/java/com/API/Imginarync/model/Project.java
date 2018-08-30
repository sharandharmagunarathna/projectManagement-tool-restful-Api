package com.API.Imginarync.model;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Project {
	
	private int p_Id;
	private String project_name;
	private int hours;
	private int overtime;
	private String contribution;
	private int m_Id;
	private int d_Id;
	private Date start_date;
	private Date end_date;
	public int getP_Id() {
		return p_Id;
	}
	public void setP_Id(int p_Id) {
		this.p_Id = p_Id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	public String getContribution() {
		return contribution;
	}
	public void setContribution(String contribution) {
		this.contribution = contribution;
	}
	public int getM_Id() {
		return m_Id;
	}
	public void setM_Id(int m_Id) {
		this.m_Id = m_Id;
	}
	public int getD_Id() {
		return d_Id;
	}
	public void setD_Id(int d_Id) {
		this.d_Id = d_Id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	@Override
	public String toString() {
		return "Project [p_Id=" + p_Id + ", project_name=" + project_name + ", hours=" + hours + ", overtime="
				+ overtime + ", contribution=" + contribution + ", m_Id=" + m_Id + ", d_Id=" + d_Id + ", start_date="
				+ start_date + ", end_date=" + end_date + "]";
	}
	
	

	
	
	}

	
	

