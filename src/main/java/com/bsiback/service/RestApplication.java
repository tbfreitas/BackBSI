package com.bsiback.service;
import com.bsiback.dao.TeamDao;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
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


        List<?> Teams = new TeamDao().getList();

        return Response.ok().entity(Teams).header("Access-Control-Allow-Origin", "*").build();

    }

//    @GET
//    @Path("/teams/{id}")
//    @Produces("application/json")
//    public Response getWorkersOfTeams(@PathParam("id") int id){
//
//        GerericDao  userDao = new UserDao();
//
//        ArrayList<User> employersTeam = userDao.listEmployersByTeam(id);
//
//        return Response.ok().entity(employersTeam).header("Access-Control-Allow-Origin", "*").build();
//
//    }
}
