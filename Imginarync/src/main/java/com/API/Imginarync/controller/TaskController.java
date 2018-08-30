package com.API.Imginarync.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.API.Imginarync.model.Task;
import com.API.Imginarync.service.TaskService;



@Path("tasks")
public class TaskController {

	TaskService tsks = new TaskService();
@GET
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Task> getTask() {
	//System.out.println("dfgff");
	return tsks.getTask() ;
	
}
@GET
@Path("{T_Id}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Task getTask(@PathParam("T_Id") int T_Id) {
	
	return tsks.getTask(T_Id);
		
	}

@POST
@Path("task")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Task createTask(Task tsk) {
	
	System.out.println(tsk);
	tsks.create(tsk);
	
	return tsk;
}

@PUT
@Path("{T_Id}")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Task updateTask(Task tsk) {
	
	System.out.println(tsk);
	tsks.update(tsk);
	
	return tsk;
}

@DELETE
@Path("{T_Id}")
public Task deleteTask(@PathParam("T_Id") int T_Id) {
 Task tsk = tsks.getTask(T_Id);
	if(tsk.getT_Id()!=0) 
		tsks.delete(T_Id);
		return tsk;
	
}







}