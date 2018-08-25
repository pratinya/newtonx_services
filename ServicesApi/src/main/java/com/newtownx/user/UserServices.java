/**
 * 
 */
package com.newtownx.user;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * @author pratinyachavva
 *
 */
@Path("/user")
public class UserServices {
	
	List<User> users = new ArrayList<>();
	
	public UserServices() {
		User pratinya = new User("Pratinya", "Chavva");
		pratinya.setId(1);
		
		User newtonx = new User("Newton", "X");
		newtonx.setId(2);
		
		users.add(pratinya);
		users.add(newtonx);
	}
	
	@GET
	@Produces("application/json")
	public List<User> getUsers() {
		return users;
		//return Response.status(Response.Status.OK).entity(users).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/{id}")
	public User getUser(@PathParam("id") int id) {
		return users.get(id-1);
	}
}
