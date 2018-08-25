package com.newtownx.user;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.spi.NotFoundException;

/**
 * @author pratinyachavva
 *         [{"id":1,"firstName":"Pratinya","lastName":"Chavva"},{"id":2,"firstName":"Newton","lastName":"X"}]
 */
@Path("/user")
public class UserServices {
	UserDao userDao = new UserDao();

	@GET
	@Produces("application/json")
	public Collection<User> getUsers() {
		return userDao.getAllUsers();
	}

	@GET
	@Produces("application/json")
	@Path("/{id}")
	public User getUser(@PathParam("id") long id) {
		return userDao.getUser(id);
	}

	@POST
	@Consumes("application/json")
	public Response createUser(User user) {
		user = userDao.createUser(user);
		return Response.status(200).entity(user).build();
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public User updateUser(User user) {
		try {
			return userDao.updateUser(user);
		} catch (NotFoundException ne) {
			throw ne;
		}
	}

	@DELETE
	@Produces("application/json")
	@Path("/{id}")
	public User removeUser(@PathParam("id") long id) {
		try {
			return userDao.removeUser(id);
		} catch (NotFoundException ne) {
			throw ne;
		}
	}
}
