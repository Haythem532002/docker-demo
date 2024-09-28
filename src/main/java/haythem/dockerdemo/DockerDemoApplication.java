package haythem.dockerdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(DemoEntityRepository repository) {
        return args -> {
            repository.save(new DemoEntity("docker", "demo"));
        };
    }

}
