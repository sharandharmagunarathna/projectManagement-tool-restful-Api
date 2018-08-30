package com.API.Imginarync.model;





import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Task {
	
	private int t_Id;
	private String task_name;
	private String description;
	private Date start_date ;
	private Date end_date;
	private int numbe_of_hours;
	private int overtime;
	public int getT_Id() {
		return t_Id;
	}
	public void setT_Id(int t_Id) {
		this.t_Id = t_Id;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public int getNumbe_of_hours() {
		return numbe_of_hours;
	}
	public void setNumbe_of_hours(int numbe_of_hours) {
		this.numbe_of_hours = numbe_of_hours;
	}
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	@Override
	public String toString() {
		return "Task [t_Id=" + t_Id + ", task_name=" + task_name + ", description=" + description + ", start_date="
				+ start_date + ", end_date=" + end_date + ", numbe_of_hours=" + numbe_of_hours + ", overtime="
				+ overtime + "]";
	}
  
	
}
