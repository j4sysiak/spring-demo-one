package pl.jaceksysiak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean
		 System.out.println(theCoach.getDailyWorkout());
		
		//let's call our new method for fortunes
		 System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
