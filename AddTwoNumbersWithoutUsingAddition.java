package Schoollevel;

public class AddTwoNumbersWithoutUsingAddition {
	
	    static int addition(int A, int B){
	        // code here
	        
	        
	        if(B>0){
	            while(B>0){
	                A++;
	                B--;
	            }
	           
	        }
	        
	        if(B<0){
	            while(B<0){
	                A--;
	                B++;
	            }
	           
	        }
	         return A;
	    }
	    
	    
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int A=1;
			int B= 2;
			
			int x =addition(A,B);
			System.out.print(x);

		}
	}


