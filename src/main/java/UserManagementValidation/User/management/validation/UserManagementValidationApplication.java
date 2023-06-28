package UserManagementValidation.User.management.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"configuration","controller","model","service","repository"})
public class UserManagementValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementValidationApplication.class, args);
	}

}
