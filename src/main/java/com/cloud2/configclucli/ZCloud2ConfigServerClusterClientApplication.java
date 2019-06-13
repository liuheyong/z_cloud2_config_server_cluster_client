package com.cloud2.configclucli;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZCloud2ConfigServerClusterClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZCloud2ConfigServerClusterClientApplication.class).web(true).run(args);
    }

}
