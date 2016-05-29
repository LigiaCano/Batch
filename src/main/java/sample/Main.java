package sample;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component

public class Main implements CommandLineRunner {
	 public static void main(String [] args) {
		 SpringApplication.run(JobRunner.class);
	 }

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("running...");
	}

//	@Autowired
//	JobLauncher jobLauncher;
//
//	@Autowired
//	Job job;
//
//	public static void main(String... arg) throws JobExecutionAlreadyRunningException, JobRestartException,
//			JobInstanceAlreadyCompleteException, JobParametersInvalidException {
//		ApplicationContext context = new AnnotationConfigApplicationContext(BatchConfiguration.class);
//		Main main = context.getBean(Main.class);
//		String dateParam = new Date().toString();
//		JobParameters jobParameters = new JobParametersBuilder().addString("date", dateParam).toJobParameters();
//		System.out.println(dateParam);
//		// .addLong("time",System.currentTimeMillis()).toJobParameters();
//		JobExecution jobExecution = main.jobLauncher.run(main.job, jobParameters);
//		System.out.println("Exit Status : " + jobExecution.getStatus());
//	}
}
