package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserDao userDaoHibernate = new UserDaoHibernateImpl();

        //userDaoHibernate.dropUsersTable();
        //userDaoHibernate.cleanUsersTable();

        userDaoHibernate.createUsersTable();


        userDaoHibernate.saveUser("Name1", "LastName1", (byte) 20);
        userDaoHibernate.saveUser("Name2", "LastName2", (byte) 25);
        userDaoHibernate.saveUser("Name3", "LastName3", (byte) 31);
       userDaoHibernate.saveUser("Name4", "LastName4", (byte) 38);

       userDaoHibernate.removeUserById(2);
       userDaoHibernate.getAllUsers();
       userDaoHibernate.cleanUsersTable();
       //userDaoHibernate.dropUsersTable();
    }
}
