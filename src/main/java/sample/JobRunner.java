package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
public class JobRunner {
	@Scheduled(fixedRate = 5000)
		public void runJob() {
		SpringApplication.run(BatchConfiguration.class);
		}

}
