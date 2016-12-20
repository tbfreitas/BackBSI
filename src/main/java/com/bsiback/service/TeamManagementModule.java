package com.bsiback.service;

import com.bsiback.model.Team;
import org.hibernate.Session;
import org.hibernate.Transaction;

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

        // First unit of work
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List employees = session.createQuery("FROM teams").list();
        System.out.println( employees.size() + " message(s) found:" );




        tx.commit();
        session.close();




        System.out.println( employees.size() + " message(s) found:" );


        ArrayList<Team> Teams = new ArrayList<Team>();

        Team BigData = new Team();

        BigData.setNome("BigData");
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

        ETL.setNome("ETL");
        ETL.setImage("Assets/Images/etl.png");
        Teams.add(ETL);

        return Response.ok(200).entity(Teams).build();

    }
}
