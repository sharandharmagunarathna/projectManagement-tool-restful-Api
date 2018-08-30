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

import com.API.Imginarync.model.Developer;

import com.API.Imginarync.service.DeveloperService;



@Path("developers")

public class DeveloperController {
	
	DeveloperService devs = new DeveloperService();
@GET
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Developer> getDevelopers() {
	//System.out.println("dfgff");
	return devs.getDevelopers() ;
		
	}

@GET
@Path("developer/{D_Id}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Developer getDeveloper(@PathParam("D_Id") int D_Id) {
	
	return devs.getdeveloper(D_Id) ;
		
	}
@POST
@Path("developer")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Developer createDeveloper(Developer dev) {
	
	System.out.println(dev);
	devs.create(dev);
	
	return dev;
}

@PUT
@Path("developer")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Developer updateDeveloper(Developer dev) {
	
	System.out.println(dev);
	devs.update(dev);
	
	return dev;
}

@DELETE
@Path("developer/{D_Id}")
public Developer deleteDeveloper(@PathParam("D_Id") int D_Id) {
	Developer dev = devs.getdeveloper(D_Id);
	if(dev.getD_Id()!=0) 
		devs.delete(D_Id);
		return dev;
	
}




}
