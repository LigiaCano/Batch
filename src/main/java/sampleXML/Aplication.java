package sampleXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aplication{
	public static void main(String[] args) {
		String[] str = { "classpath:META-INF/batch/job-config.xml", "classpath:META-INF/batch/batch-config.xml" };
		ApplicationContext ctx = new ClassPathXmlApplicationContext(str);
	}
	
}
