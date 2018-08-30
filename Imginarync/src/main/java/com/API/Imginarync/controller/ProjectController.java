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

import com.API.Imginarync.model.Project;
import com.API.Imginarync.service.ProjectService;


@Path("projects")

public class ProjectController {
	
	ProjectService prjs = new ProjectService();
@GET
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Project> getProjects() {
	//System.out.println("dfgff");
	return prjs.getProjects() ;
		
	}

@GET
@Path("project/{P_Id}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Project getProject(@PathParam("P_Id") int P_Id) {
	
	return prjs.getProject(P_Id) ;
		
	}
@GET
@Path("devallproject")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Project> getDEvProject(){
	
	return prjs.getDevProject() ;
		
	}



@GET
@Path("developer/{D_Id}-{P_Id}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})

	public List<Project> getdeveloperProject(@PathParam("D_Id") int D_Id,@PathParam("P_Id") int P_Id) {
	//String[] arrSplit =D_Id.split(",");
	//int d=Integer.parseInt(arrSplit[0]);
	//int p=Integer.parseInt(arrSplit[0]);
	return prjs.getdeveloperProject(D_Id,P_Id) ;
		
	}

@GET
@Path("manager/{M_Id}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Project> getmanagerProject(@PathParam("M_Id") int M_Id) {
	
	return prjs.getmanagerProject(M_Id) ;
		
	}

@GET
@Path("overtime/{D_Id}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Project getdeveloperOvertime(@PathParam("D_Id") int D_Id) {
	
	return prjs.getdeveloperOvertime(D_Id) ;
		
	}

@POST
@Path("devproject")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Project createDevProject(Project prj) {
	
	System.out.println(prj);
	prjs.createDevProject(prj);
	
	return prj;
}



@POST
@Path("dev/newproject")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Project createNewProject(Project prj) {
	System.out.println(prj);
	prjs.createNewProject(prj);
	return prj;
	
}


@PUT
@Path("project")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Project updateProject(Project prj) {
	
	System.out.println(prj);
	prjs.update(prj);
	
	return prj;
}

@PUT
@Path("up/{D_Id}")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Project updateDevProject(Project prj) {
	
	System.out.println(prj);
	prjs.updateDevProject(prj);
	
	return prj;
}


@DELETE
@Path("project/{P_Id}")
public Project deleteProject(@PathParam("P_Id") int P_Id) {
  Project prj = prjs.getProject(P_Id);
	if(prj.getP_Id()!=0) 
		prjs.delete(P_Id);
		return prj;
	
}




}
