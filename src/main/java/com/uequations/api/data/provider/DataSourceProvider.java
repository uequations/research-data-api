package com.uequations.api.data.provider;

import com.google.inject.Provider;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

/**
 * @author Mensah Alkebu-Lan
 */
public class DataSourceProvider implements Provider<DataSource> {

    private static final String DEFAULT_DRIVER_CLASS_NAME = "org.hsqldb.jdbcDriver";
    private static final String DEFAULT_JDBC_URL = "jdbc:hsqldb:mem:demo";
    private static final String DEFAULT_USERNAME = "sa";
    private static final String DEFAULT_PASSWORD = "";
    private static final String DEFAULT_CONNECTION_PROPERTIES = "";

    private DataSource buildDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(System.getProperty("DRIVER_CLASS_NAME", DEFAULT_DRIVER_CLASS_NAME));
        dataSource.setUrl(System.getProperty("JDBC_URL", DEFAULT_JDBC_URL));
        dataSource.setUsername(System.getProperty("USERNAME", DEFAULT_USERNAME));
        dataSource.setPassword(System.getProperty("PASSWORD", DEFAULT_PASSWORD));
        dataSource.setConnectionProperties(System.getProperty("CONNECTION_PROPERTIES", DEFAULT_CONNECTION_PROPERTIES));
        return dataSource;
    }

    @Override
    public DataSource get() {
        return buildDataSource();
    }
}
