package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;

@EnableAutoConfiguration
@RefreshScope
@SpringBootApplication
public class Application {

	@Autowired
	void setEnvironment(Environment e) {
		System.out.println(e.getProperty("configuration.version") + "===> Karoonakar");
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
