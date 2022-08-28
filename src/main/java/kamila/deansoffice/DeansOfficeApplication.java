package kamila.deansoffice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class DeansOfficeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeansOfficeApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository){
		return args ->{
			Address address = new Address("Poland", "Gliwice", "12-300");
			Student student = new Student(
					"Asia",
					"Makota",
					"asia@poczta.com",
					Gender.OTHER,
					address,
					List.of("abc", "def"),
					BigDecimal.TEN,
					LocalDateTime.now()
			);

			Query query = new Query();
			repository.insert(student);
		};
	}

}
