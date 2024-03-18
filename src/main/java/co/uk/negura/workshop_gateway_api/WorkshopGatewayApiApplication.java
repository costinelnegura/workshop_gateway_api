package co.uk.negura.workshop_gateway_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WorkshopGatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopGatewayApiApplication.class, args);
	}



}
