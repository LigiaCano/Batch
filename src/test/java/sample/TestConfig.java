package sample;

import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ BatchConfiguration.class })
public class TestConfig {
	@Bean
	public JobLauncherTestUtils jobLauncherTestUtils() {
		return new JobLauncherTestUtils();
	}

}
