
public class LoopingDemo {
   
	int[] sampleArray = {0,1,2,1,4,5,6,7,2,5,10,3,4,6,3,2};
	int[] checkArray =  {1,2,3,4,5};
	LoopingDemo(){
		int k=0;
		for(int i:sampleArray) {
		    for(int j: checkArray) {
		        if(i == j) {
		        	System.out.println("i Value : "+ i + " j Value : "+ j );
		        	k++;
		        }
		    }
		}
	}
	
	
}
