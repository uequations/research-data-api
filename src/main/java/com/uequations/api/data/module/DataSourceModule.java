package com.uequations.api.data.module;

import com.google.inject.AbstractModule;
import com.uequations.api.data.provider.DataSourceProvider;

import javax.sql.DataSource;

/**
 * @author Mensah Alkebu-Lan
 */
public class DataSourceModule extends AbstractModule {

    @Override
    public void configure() {
        bind(DataSource.class).toProvider(DataSourceProvider.class);
    }
}

