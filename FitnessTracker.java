/* Practice Assignment - Page 224 Exercise 3A & 3B
   Author: Sabrina
   Date: 8/1/19
   Filename: FitnessTracker.java 

   Class create to track fitness activity, the numbers spent and the date. */


import java.time.*; // Exercise 3A

public class FitnessTracker 
{
	private String exercise; 
	private int min;
	LocalDate date;

	public FitnessTracker() 
	{
		exercise = "Running";
		min = 30;
		date = LocalDate.of(2019, 8, 1);
	}
	
	public FitnessTracker(String activity, int minutes, LocalDate day) // Exercise 3B
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