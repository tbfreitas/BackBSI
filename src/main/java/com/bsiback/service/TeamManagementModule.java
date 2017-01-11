package com.bsiback.service;

import com.bsiback.model.Team;
import com.bsiback.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tarcísio on 12/09/2016.
 */

@Path("/team-management")
public class TeamManagementModule  {

    @GET
    @Path("/teams")
    @Produces("application/json")
    public Response getUserById(){

        SessionFactory sessionFactory;
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Query query = session.createQuery("from User");


        List<?> list = query.list();
        User usr = (User) list.get(0);

        System.out.println(usr.getNome());

        ArrayList<Team> Teams = new ArrayList<Team>();

        Team BigData = new Team();

        BigData.setNome(usr.getNome());
        BigData.setImage("Assets/Images/cobol.png");
        Teams.add(BigData);

        Team Cobol = new Team();

        Cobol.setNome("Cobol");
        Cobol.setImage("Assets/Images/cobol.png");
        Teams.add(Cobol);

        Team Java = new Team();

        Java.setNome("Java");
        Java.setImage("Assets/Images/java.png");
        Teams.add(Java);

        Team ETL = new Team();

//        ETL.setNome("ETL");
//        ETL.setImage("Assets/Images/etl.png");
//        Teams.add(ETL);

        return Response.ok(200).entity(Teams).build();

    }
}
