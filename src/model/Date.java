package model;


public class Date {
	
	// Attributes

	
	private int day;
	private int month;
	private int year;
	
	
	//Methods
	
	
	
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
	}


	/**
	* Description This method allows to get the number of date's day. 
	* @return Date's day.
	*/

	public int getDay() {
		return day;
	}

	/**
	* Description This method allows to change a date's day.
	* pre  : the param is different to null.
	* post: The date's day is changed.
	* @param day Date's day. This param must be between one and thirty one.
	*/

	public void setDay(int day) {
		this.day = day;
	}

	/**
	* Description This method allows to get the number of date's month. 
	* @return Date's month.
	*/

	public int getMonth() {
		return month;
	}

	/**
	* Description This method allows to change a date's month.
	* pre  : the param is different to null.
	* post: The date's month is changed.
	* @param month Date's month. This param must be between one and twelve.
	*/

	public void setMonth(int month) {
		this.month = month;
	}

	/**
	* Description This method allows to get the number of date's year. 
	* @return Date's year.
	*/

	public int getYear() {
		return year;
	}

	/**
	* Description This method allows to change a date's year.
	* pre  : the param is different to null.
	* post: The date's year is changed.
	* @param year Date's year. This param must be higher than zero.
	*/

	public void setYear(int year) {
		this.year = year;
	}

	/**
	* Description This method changes the date to String. 
	* pre: The date is different to null.
	* @return A date in the format (Day/Month/Year).
	*/

    public String getEntry(){
		
		String entry= (getDay()+"/"+ getMonth()+"/" +getYear());
		
		return entry;
	}
	
	/**
	* Description This method gives us the total of days a pet has lived. 
	* @return A pet's total number of days.
	*/
	
	public double getDays(){
		
	double days= ((getDay()*1)+(getMonth()*12)+(getYear()*365));
		
	return days;
				
	}
  
	
  
  
}

	






		
