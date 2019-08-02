/* Practice Assignment - Page 224 Exercise 3A & 3B
   Author: Sabrina
   Date: 8/1/19
   Filename: FitnessTracker2.java 

   FitnessTracker class created so the default constructor can call the three parameters.

   */


import java.time.*; // Exercise 3A

public class FitnessTracker2 
{
	private String exercise; 
	private int min;
	LocalDate date;

	public FitnessTracker2() 
	{
		this("Running", 30, LocalDate.of(2019, 8, 1));
	}
	
	public FitnessTracker2(String activity, int minutes, LocalDate day) // Exercise 3B
	{
		exercise = activity;
		min = minutes;
		date = day;
	}
	public String getExercise()
	{
		return exercise;
	}

	public int getMin()
	{
		return min;
	}
	public LocalDate getDate()
	{
		return date;
	}
}