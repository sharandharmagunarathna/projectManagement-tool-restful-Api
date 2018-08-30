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

import com.API.Imginarync.model.Manager;

import com.API.Imginarync.service.ManagerService;



@Path("managers")

public class ManagerController {
	
	ManagerService devs = new ManagerService();
@GET
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Manager> getManagers() {
	//System.out.println("dfgff");
	return devs.getManagers() ;
		
	}

@GET
@Path("manager/{M_Id}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Manager getManager(@PathParam("M_Id") int M_Id) {
	
	return devs.getManager(M_Id) ;
		
	}
@POST
@Path("manager")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Manager createManager(Manager dev) {
	
	System.out.println(dev);
	devs.create(dev);
	
	return dev;
}



@PUT
@Path("manager")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Manager updateManager(Manager dev) {
	
	System.out.println(dev);
	devs.update(dev);
	
	return dev;
}

@DELETE
@Path("manager/{M_Id}")
public Manager deleteManager(@PathParam("M_Id") int M_Id) {
	Manager dev = devs.getManager(M_Id);
	if(dev.getM_Id()!=0) 
		devs.delete(M_Id);
		return dev;
	
}




}
