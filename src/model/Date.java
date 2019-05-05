package model;


public class Date {
	
	// Attributes

	
	private int day;
	private int month;
	private int year;
	
	
	//Methods
	
	
	
	/**
	* Constructor method for class Date. Date has the format ( day/ month/ year)
	* @param day  is a day of the month. This param must be between 1 and 31.
	* @param month is a month of the. This param must be between 1 and 12.
	* @param year is a year. This param must be a number higher than zero.
	*/
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
	}


	/**
	* This method allows to get the number of date's day. 
	* @return Date's day.
	*/

	public int getDay() {
		return day;
	}

	/**
	* This method allows to change a date's day.
	* pre  : the param is different to null.
	* post: The date's day is changed.
	* @param day Date's day. This param must be between one and thirty one.
	*/

	public void setDay(int day) {
		this.day = day;
	}

	/**
	* This method allows to get the number of date's month. 
	* @return Date's month.
	*/

	public int getMonth() {
		return month;
	}

	/**
	* This method allows to change a date's month.
	* pre  : the param is different to null.
	* post: The date's month is changed.
	* @param month Date's month. This param must be between one and twelve.
	*/

	public void setMonth(int month) {
		this.month = month;
	}

	/**
	* This method allows to get the number of date's year. 
	* @return Date's year.
	*/

	public int getYear() {
		return year;
	}

	/**
	* This method allows to change a date's year.
	* pre  : the param is different to null.
	* post: The date's year is changed.
	* @param year Date's year. This param must be higher than zero.
	*/

	public void setYear(int year) {
		this.year = year;
	}

	/**
	* This method changes the date to String. 
	* pre: The date is different to null.
	* @return A date in the format (Day/Month/Year).
	*/

    public String getEntry(){
		
		String entry= (getDay()+"/"+ getMonth()+"/" +getYear());
		
		return entry;
	}
	
	/**
	* This method gives us the total of days a pet has lived. 
	* @return A pet's total number of days.
	*/
	
	public double getDays(){
		
	double days= ((getDay()*1)+(getMonth()*12)+(getYear()*365));
		
	return days;
				
	}
  
	
  
  
}

	






		
