package com.usersapi.controller;

import com.usersapi.dao.UserDAO;
import com.usersapi.model.Users;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Romel
 */
@Path("/user")
public class UserController {

    private UserDAO userDAO = new UserDAO();

    @GET
    @Path("/id/{id_user}")
    @Produces(MediaType.APPLICATION_JSON)
    public Users getUsersById(@PathParam("id_user") String id_user) {
        return userDAO.getUserById(id_user);
    }

    @GET
    @Path("/username/{user_name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Users getUsersByUsername(@PathParam("user_name") String user_name) {
        return userDAO.getUserByUsername(user_name);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Users> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @POST
    @Path("/register")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Users addUser(Users user) {
        return userDAO.addUser(user);
    }

}
