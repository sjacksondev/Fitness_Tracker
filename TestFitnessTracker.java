/* Practice Assignment - Page 224 Exercise 3A & 3B
   Author: Sabrina
   Date: 8/1/19
   Filename: TestFitnessTracker.java 

   Class create to test the FitnessTracker class and show each method works correctly.

*/

import java.time.*; // Exercise 3A

public class TestFitnessTracker
{
	public static void main(String[] args) 
	{
		FitnessTracker exercise = new FitnessTracker(); 
		System.out.println(exercise.getExercise() + " was your activity for " + exercise.getMin() + " minutes on " + exercise.getDate() + "." + " GOOD JOB!");
	
		LocalDate day = LocalDate.of(2019, 7, 31); // Exercise 3B
		FitnessTracker exercise2 = new FitnessTracker("Walking", 60, day);
		System.out.println(exercise2.getExercise() + " was your activity for " + exercise2.getMin() + " minutes on " + exercise2.getDate() + "." + " GOOD JOB!");
	
		
	}
}

