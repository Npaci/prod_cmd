package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFacSingleton {
    private static EntityManagerFactory instance = null;
    private EntityManagerFacSingleton(){}
    public static EntityManagerFactory getInstance(){
        if (instance == null)
            instance = Persistence.createEntityManagerFactory("cmdDB_persUnit");

        return instance;
    }

    public static void close(){
        if(instance != null)
            instance.close();
    }
}

