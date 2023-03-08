public class MyDate {
	int day;
	int year;
	int month;
	
	public MyDate() {}
	
	public MyDate(int m, int d, int y) {
		day = d;
		month = m;
		year = y;	
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
	public void setDate(int m, int d, int y) {
		day = d;
		month = m;
		year = y;
	}
	
	

}
