/* Practice Assignment - Page 224 Exercise 3A & 3B
   Author: Sabrina
   Date: 8/1/19
   Filename: TestFitnessTracker2.java 

   To test the default constructor created to call the three parameters.

   */

import java.time.*; // Exercise 3A

public class TestFitnessTracker2
{
	public static void main(String[] args) 
	{
		FitnessTracker2 exercise = new FitnessTracker2(); 
		System.out.println(exercise.getExercise() + " was your activity for " + exercise.getMin() + " minutes on " + exercise.getDate() + "." + " GOOD JOB!");
	
		LocalDate day = LocalDate.of(2019, 7, 31); // Exercise 3B
		FitnessTracker2 exercise2 = new FitnessTracker2("Walking", 60, day);
		System.out.println(exercise2.getExercise() + " was your activity for " + exercise2.getMin() + " minutes on " + exercise2.getDate() + "." + " GOOD JOB!");
	
		FitnessTracker2 exercise3 = new FitnessTracker2("Swimming", 90, LocalDate.of(2019, 7, 30)); // Exercise 3C
		System.out.println(exercise3.getExercise() + " was your activity for " + exercise3.getMin() + " minutes on " + exercise3.getDate() + "." + " GOOD JOB!");
	
	}
}

