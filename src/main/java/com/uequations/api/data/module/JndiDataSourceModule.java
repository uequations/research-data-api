package com.uequations.api.data.module;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * @author Mensah Alkebu-Lan
 */
public class JndiDataSourceModule {

    private static final String JNDI_DATA_SOURCE_SUBCONTEXT = "jdbc";

    void bindJndiDataSource(DataSource dataSource, String name) throws NamingException {
        Context context = new InitialContext();
        context.createSubcontext(JNDI_DATA_SOURCE_SUBCONTEXT);
        context.bind("jndi/" + name, dataSource);
    }
}
