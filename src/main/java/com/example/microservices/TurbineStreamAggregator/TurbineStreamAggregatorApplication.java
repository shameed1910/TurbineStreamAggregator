package com.example.microservices.TurbineStreamAggregator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
@EnableCircuitBreaker
public class TurbineStreamAggregatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineStreamAggregatorApplication.class, args);
	}

}
