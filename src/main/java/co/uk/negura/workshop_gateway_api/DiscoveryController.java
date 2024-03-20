package co.uk.negura.workshop_gateway_api;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DiscoveryController {

    private final DiscoveryClient discoveryClient;

    public DiscoveryController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/discovery/{serviceName}")
    public List<String> getInstances(@PathVariable String serviceName) {
        return this.discoveryClient.getInstances(serviceName)
                .stream()
                .map(serviceInstance -> serviceInstance.getHost() + ":" + serviceInstance.getPort())
                .collect(Collectors.toList());
    }

    @GetMapping("/discovery/services")
    public List<String> getServices() {
        return this.discoveryClient.getServices();
    }
}
