package jclipper.dubbo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author <a href="mailto:wf2311@163.com">wf2311</a>
 * @since 2021/6/8 15:39.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboDemoApplication.class, args);
    }
}
