package com.api.mock.server;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.common.ConsoleNotifier;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppMock {
    private static  final  Logger LOGGER = LoggerFactory.getLogger(AppMock.class);

    public static void main(String[] args) {
        AppMock appMock = new AppMock();
        WireMockConfiguration wireMockConfiguration = new WireMockConfiguration();
        appMock.loadWireMockConfigurations(wireMockConfiguration);
        WireMockServer wireMockServer = new WireMockServer(wireMockConfiguration);
        wireMockServer.start();
    }


    public void loadWireMockConfigurations(WireMockConfiguration wireMockConfiguration) {
        wireMockConfiguration.port(9090);
        wireMockConfiguration.notifier(new ConsoleNotifier(true));
        wireMockConfiguration.usingFilesUnderDirectory("/opt");
    }
}
