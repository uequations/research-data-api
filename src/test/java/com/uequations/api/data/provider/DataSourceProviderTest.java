package com.uequations.api.data.provider;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceProviderTest {

    @Test
    public void testGet() {

        DataSourceProvider dataSourceProvider = new DataSourceProvider();
        DataSource dataSource = dataSourceProvider.get();

        try (Connection connection = dataSource.getConnection()) {
            String databaseProductName = connection.getMetaData().getDatabaseProductName();

            Assert.assertThat(databaseProductName, CoreMatchers.is("HSQL Database Engine"));
        } catch (SQLException e) {
            e.getSQLState();
            e.getErrorCode();
        }
    }

}