
public class DaysEnum {

	public void testingEnum() {
		String monday = Days.MONDAY.name();
		Days userInput = Days.valueOf("SUNDAY");
		Days today = Days.FRIDAY;
		String response = null;

		switch (today) {
		case MONDAY:
			response = "Get to work!";
			break;
		case FRIDAY:
			response = "Time to Chillax!!!";
			break;
		default:
			response = "Practice Java!";
		}
		System.out.println(response);
		System.out.println(monday);
		System.out.println(userInput);

	}

}
