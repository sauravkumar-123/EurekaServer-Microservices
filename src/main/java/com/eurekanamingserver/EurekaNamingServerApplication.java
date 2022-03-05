package com.eurekanamingserver;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaNamingServerApplication {

	@Value("${server.port}")
	private String portno;
	
	private final static Logger logger=LoggerFactory.getLogger(EurekaNamingServerApplication.class);
	public static void main(String[] args) {
		logger.info("<--------------Eureka Server Start-------------->");
		SpringApplication.run(EurekaNamingServerApplication.class, args);
		logger.info("<--------------Eureka Server End-------------->");
	}

	@PostConstruct
	public void init() {
		logger.info("<---------EurekaNamingServer Run On PortNo:------------>"+portno);
	}
}
