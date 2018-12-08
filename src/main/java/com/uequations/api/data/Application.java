package com.uequations.api.data;

import org.wso2.msf4j.MicroservicesRunner;

/**
 * @author Mensah Alkebu-Lan
 */
public class Application {

    private static final String RESEARCH_DATA_API_ENDPOINT_PATH = "/api/data/v1";

    public static void main(String[] args) {
        new MicroservicesRunner()
                .start();
    }
}
