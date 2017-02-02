package com.bsiback.service;

import com.bsiback.dao.TeamDao;
import com.bsiback.dao.UserDao;
import com.bsiback.model.Caracter_User;
import com.bsiback.model.Team;
import com.bsiback.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tarcísio on 12/09/2016.
 */

@Path("/team-management")
public class RestApplication {

    @GET
    @Path("/teams")
    @Produces("application/json")
    public Response getTeams(){

        TeamDao teamDao = new TeamDao();

        ArrayList<Team> Teams = teamDao.getTeams();

        return Response.ok().entity(Teams).header("Access-Control-Allow-Origin", "*").build();

    }

    @GET
    @Path("/teams/{id}")
    @Produces("application/json")
    public Response getWorkersOfTeams(@PathParam("id") int id){

        UserDao userDao = new UserDao();

        ArrayList<User> employersTeam = userDao.listEmployersByTeam(id);

        return Response.ok().entity(employersTeam).header("Access-Control-Allow-Origin", "*").build();

    }
}
