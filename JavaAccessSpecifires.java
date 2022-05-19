package com.accessModifiers;

public class JavaAccessSpecifires {
	
	//public ,private ,protected ,default 
	
	 public void studentResult()  {

		 
		String strStudentsResult =" The student is Pass";
		    

			System.out.println("The student Result  :" +strStudentsResult);
		    
		    
	 }
	

       //private
	
      private void numberOfPassStudentResult() {
    	  
    	  int intnumberOfPassStudentResult  = 800;
    	  
    	  System.out.println("The total pass student :" +intnumberOfPassStudentResult);
      }
      

    	  
    	  
    //protected 


  protected void numberOfFailStudentResult()  {
	  
	  int intnumberOfFailStudentResult = 300;
	  
	  System.out.println("The total fail student :" +intnumberOfFailStudentResult);
	  
  }
  

  
    	//  default
      void numberOfAverageStudentResult() {
    	 
    	  int intnumberOfAverageStudentResult = 200;
    	  
    	  
    	  System.out.println("The total average student :" +intnumberOfAverageStudentResult);
    	  
     }
     
}
      

