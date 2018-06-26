package com.asahi.packagedemo;

public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
	        // your code
		 double[] grades = new double[studentIdList.length];
		 for(int student : studentIdList) {
		 	 int rownNum = 0;
		 	
			 for(char[] grade : studentsGrades) {
				 double point = 0;
				 double gr;
				 for(char g : grade) {
					 
					 point = point + getPoints(String.valueOf(g));
					 
				 }
				 gr = point  / grade.length;
				 grades[rownNum++] = gr;
			 }
		 }
		 System.out.println(grades[0]+" "+ grades[1]);
		 return grades;
	    }
	    
	    private static int getPoints(String string) {
		
	    	switch (string) {
			case "A":
				return 4;
				
			case "B":
				return 3;
				
			case "C":
				return 2;

			default:
				return 0;
				
			}
		
	}

		public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
	        // perform parameter validation. Return null if passed parameters are not valid
	    	if(lower < 0 || higher < 0 || higher <lower) {
	    		return null;
	    	}
	        
	    	int index = 0;
	    	int innerIndex = 0;
	    	int[] filteredList = new int[studentIdList.length];
	        // invoke calculateGPA
	    	double[] grades = calculateGPA(studentIdList, studentsGrades);
	    	double[] finalgrades;
	    	
	        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
	    	for(double g : grades) {
	    		
	    		if(lower <= g && g <= higher) {
	    			filteredList[innerIndex] = studentIdList[index];
	    			innerIndex++;
	    		}
	    		index++;
	    	}
	    	System.out.println(filteredList.length+ " "+ filteredList[0]+ " "+ filteredList[1]);
	    	return filteredList;
	    }
		
		public static void main(String[] args) {
			double lower = 3.2;
			double higher = 3.5;
			int[] studentIdList = {1000, 1002};
			char[][] studentsGrades = {{'A','A','A','B'},{'A','B','B'}};
			calculateGPA(studentIdList, studentsGrades);
			getStudentsByGPA(lower, higher, studentIdList, studentsGrades);
		}
    
}
