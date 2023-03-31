package javaenums;

public enum DayOfWeek {
	MONDAY("MONDAY"),
	TUESDAY("TUESDAY"),
	WEDNESDAY("WEDNESDAY"),
	THURSDAY("THURSDAY"),
	FRIDAY("FRIDAY"),
	SATURDAY("SATURDAY"),
	SUNDAY("SUNDAY");
	private final String name;

	DayOfWeek(String name) {
		this.name= name;
	}

	public String getName() {
		return name;
	}
	
	

	

}
