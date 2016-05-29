package sample;

import java.util.Date;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersIncrementer;

public class DynamicJobParameters implements JobParametersIncrementer  {
	 Date date = null;
	@Override
	public JobParameters getNext(JobParameters parameters) {
		date = new Date();  
		parameters = new JobParametersBuilder().addLong("currentTime", new Long(System.currentTimeMillis())).toJobParameters();  
		return parameters;  
	}

}
