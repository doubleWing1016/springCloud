package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HytrixDashboardStart {
    public static void main(String[] args) {
        SpringApplication.run(HytrixDashboardStart.class,args);
    }
}
