package pl.jaceksysiak.springdemo;

public class CricketCoach implements Coach {

	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//non-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside non-arg constructor");
	}
	
	//define a constructor for dependency injection
//	public CricketCoach(FortuneService theFortuneService) {
//		this.fortuneService = theFortuneService;
//	}
	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
		
	}
 
	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
