package com.newtownx.user;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.jboss.resteasy.spi.NotFoundException;

/**
 * @author pratinyachavva
 *
 */
public class UserDao {
	static Map<Long, User> users = null;
	//In memory storage
	static {
		users = new HashMap<>();
	}
	
	//Get All Users
	public Collection<User> getAllUsers() {
			return users.values();
	}
	
	//Get User
	public User getUser(long id) {
		return users.get(id);
	}
	
	//Add User
	public User createUser(User user) {
		long id = users.size()+1;
		user.setId(id);
		users.put(id, user);
		return user;
	}
	
	//Delete User
	public User removeUser(long id) {
		if(users.containsKey(id))
			return users.remove(id);
		else
			throw new NotFoundException("User not found");
	}
	
	//Update User
	public User updateUser(User user) {
		if(users.containsKey(user.getId()))
			return users.put(user.getId(), user);
		else
			throw new NotFoundException("User not found");
	}	
}