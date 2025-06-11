package lang.immutable.test;

public class MyDate {
	
	 private final int year;
	 private final int month;
	 private final int day;
	 
	 public MyDate(int year, int month, int day) {
		 this.year = year;
		 this.month = month;
		 this.day = day;
	}
	 
	 public ImmutableMyDate withYear(int newYear) {
		 return new ImmutableMyDate(newYear, month, day);
	 }
	 
	 public ImmutableMyDate wihtMonth(int newMonth) {	 
		 return new ImmutableMyDate(year, newMonth, day);
	 }
	 
	 public ImmutableMyDate withDay(int newDay) {	 
		 return new ImmutableMyDate(year, month, newDay);
	 }
	 
		 @Override
		 public String toString() {
		 return year + "-" + month + "-" + day;
	}
}
