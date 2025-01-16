package org.emeifeng.emeifengservewebstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EmeifengServeWebStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmeifengServeWebStarterApplication.class, args);
	}

}
