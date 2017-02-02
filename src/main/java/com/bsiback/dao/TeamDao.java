package com.bsiback.dao;

import com.bsiback.model.Team;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tarcisio on 02-02-2017.
 */
public class TeamDao {

    public ArrayList<Team> getTeams(){

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

        return Teams;

    }
}
