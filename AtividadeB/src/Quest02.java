
public class Quest02 {
	

	public static void main(String[] args) {
		int sum= 0, number=1; // variavel img1 e img2
		
		// TODO Auto-generated method stub
		
     // img desenho 1
		if (  number<=100){
    	  sum = sum + number;
    	  number = number+1;
      }
    	  else{
    		   sum =0;
    		   number=1;
    		  
    		  
    		   // codigo desenho2
    		   sum +=number;
    		   number++;
    		   if(sum<=1000000){
    			   sum +=number;
        		   number++;
    		   }
    		   else{
    			   System.out.println("Fim");
    			   
    		   }
    		  
    	  }
    	  
      }
	
	
}
	
	

	


