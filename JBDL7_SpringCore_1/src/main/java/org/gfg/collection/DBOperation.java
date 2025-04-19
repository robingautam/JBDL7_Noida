package org.gfg.collection;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DBOperation implements InitializingBean, DisposableBean {

    String dbConnection;

    public String getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(String dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public String toString() {
        return "DBOperation{" +
                "dbConnection='" + dbConnection + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Going to open db connection");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Going to destroy the db connection");
    }
}
