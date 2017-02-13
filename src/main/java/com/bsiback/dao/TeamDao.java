package com.bsiback.dao;

import com.bsiback.model.Caracter_User;
import com.bsiback.model.Team;
import com.bsiback.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tarcisio on 02-02-2017.
 */
public class TeamDao extends GenericDao<Team , Long>{

    public TeamDao() {
        super(Team.class);
    }



//    public List<User> getUsers(int id){
//
//        SessionFactory sessionFactory;
//        sessionFactory = new Configuration()
//                .configure()
//                .buildSessionFactory();
//
//        Session session = sessionFactory.openSession();
//
//        Query query = session.createQuery("from User u where u.team = :id");
//        query.setParameter("id", id);
//
//        ArrayList<User> employersTeam = new ArrayList<User>();
//
//        List<?> list = query.list();
//
//        for(int i = 0 ; i < list.size(); i++){
//
//            User user = (User) list.get(i);
//            int userId = user.getId();
//
//            Query userQuery = session.createQuery("from Caracter_User c where c.id = :userId");
//            userQuery.setParameter("userId", userId);
//
//            List<?> userList = userQuery.list();
//            user.setCarac( (Caracter_User) userList.get(0));
//            employersTeam.add(user);
//
//        }
//
//        return employersTeam;
//    }

}
