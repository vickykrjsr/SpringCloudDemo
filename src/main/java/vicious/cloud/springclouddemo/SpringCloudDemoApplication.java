package vicious.cloud.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class SpringCloudDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudDemoApplication.class, args);

    }

    @Scheduled(cron = "*/10 * * * * *")
    public void testDeploy(){
        System.out.println("Current System Time in millis is : " + System.currentTimeMillis());
    }

}
