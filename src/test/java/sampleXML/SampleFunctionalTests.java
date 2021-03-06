package sampleXML;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import org.junit.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
"classpath:META-INF/batch/batch-config.xml",
"classpath:META-INF/batch/test-config.xml"})
public class SampleFunctionalTests {
	
	 @Autowired
	 private JobLauncherTestUtils jobLauncherTestUtils;
	 
	 @Test
	 public void launchJob() throws Exception {
		 JobExecution jobExecution = jobLauncherTestUtils.launchJob();
	     Assert.assertEquals(jobExecution.getStatus(), BatchStatus.COMPLETED);
	 }

}
