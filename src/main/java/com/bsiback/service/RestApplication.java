package com.bsiback.service;

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
    @Path("/users")
    @Produces("application/json")
    public Response getUserById(){


        SessionFactory sessionFactory;
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        //Transaction tx = session.beginTransaction();

        Query query = session.createQuery("from User");

        ArrayList<User> Users = new ArrayList<User>();

        List<?> list = query.list();

        for(int i = 0 ; i < list.size(); i++){
            User usr = (User) list.get(i);
            Users.add(usr);
        }

        return Response.ok(200).entity(Users).build();

    }

    @GET
    @Path("/teams")
    @Produces("application/json")
    public Response getTeams(){

        SessionFactory sessionFactory;
        sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        //Transaction tx = session.beginTransaction();

        Query query = session.createQuery("from Team");

        ArrayList<Team> Teams = new ArrayList<Team>();

        List<?> list = query.list();

        for(int i = 0 ; i < list.size(); i++){
            Team team = (Team) list.get(i);
            Teams.add(team);
        }

        return Response.ok(200).entity(Teams).build();

    }
}
