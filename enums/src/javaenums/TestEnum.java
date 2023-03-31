package javaenums;

public class TestEnum {

	public static void main(String[] args) {
		DayOfWeek today=DayOfWeek.SATURDAY;
		System.out.println("Today is" +today.getName());
		switch(today)
		{
		case MONDAY:
			System.out.println("WORK HARD");
			break;
		case TUESDAY:
			System.out.println("WORK LITTLE MORE");
			break;
		case WEDNESDAY:
			System.out.println("WORK WORK LITTLE MORE");
			break;
		case THURSDAY:
			System.out.println("WORK WORK WORK LITTLE MORE");
			break;
		case FRIDAY:
			System.out.println("YEAH weekend has arrived");
			
			break;
		case SATURDAY:
			System.out.println("ENJOY MORNING COFFEE");
			break;
		case SUNDAY:
			System.out.println("DO ALL CLEANING WORKS");
			break;
		}

	}

}
