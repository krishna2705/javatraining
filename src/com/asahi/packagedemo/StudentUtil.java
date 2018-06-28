package com.asahi.packagedemo;

public class StudentUtil 
{
	public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) 
	{
        // your code
		int noOfStudent = studentIdList.length;
		double[] gpa = new double[noOfStudent];
		
		for(int i = 0; i < noOfStudent; i++)
		{
			char[] studentGrade = studentsGrades[i];
			int noOfCourses = studentGrade.length;
			int sumOfGrades = 0;
			for(int j = 0; j < noOfCourses; j++)
			{
				char grade = studentGrade[j];
				int gradeValue = getStringVal(grade);				
				sumOfGrades += gradeValue;
			}
			double currentGpa = (float)sumOfGrades/noOfCourses;
			gpa[i] = currentGpa;
		}
		System.out.println("calculateGPA >>>> " + gpa);
		return gpa;
    }
	
	public static int getStringVal(char ch) {
		int gradeValue = 0;
		switch(ch) {
			case 'A' : gradeValue = 4;
			           break;
			case 'B' : gradeValue = 3;
			           break;
			case 'C' : gradeValue = 2;
			           break;
			default :
					   gradeValue = 0;
				       break;
		}
		return gradeValue;
	}
    
    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) 
    {
        // your code
    	int noOfStudent = studentIdList.length;
		double[] gpa = new double[noOfStudent];
		int[] studentByGpa= null;
		
		for(int i = 0; i < noOfStudent; i++)
		{
			char[] studentGrade = studentsGrades[i];
			int noOfCourses = studentGrade.length;
			int sumOfGrades = 0;
			int outputCount = 0;
			for(int j = 0; j < noOfCourses; j++)
			{
				char grade = studentGrade[j];
				int gradeValue = getStringVal(grade);
				sumOfGrades += gradeValue;
			}
			double currentGpa = (float)sumOfGrades/noOfCourses;
			System.out.println("currentGpa "+ currentGpa);
			
			if(currentGpa >= lower && currentGpa <= higher)
			{   
				studentByGpa = new int[outputCount+1];
				studentByGpa[outputCount] = studentIdList[i];
				outputCount++;
			}
		}
		return studentByGpa;
    }
	
	public static void main(String[] args) 
	{
		StudentUtil s = new StudentUtil();
		int[] studentIdList = {1001, 1002};
		char[][] studentsGrades = { { 'A', 'A', 'A', 'B' }, { 'A', 'B', 'B' } };
		double[] gpa = s.calculateGPA(studentIdList, studentsGrades);
		
		double lower = 3.2;
		double higher = 3.5;
		
		int[] x = s.getStudentsByGPA(lower, higher, studentIdList, studentsGrades);
		
		for(int xyz : x)
			System.out.println(xyz);
		
		for(double individualGpa : gpa)
			System.out.println(individualGpa);
	}
}