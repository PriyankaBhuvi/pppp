package com.vstl.javatraining;

public class IfElseControlStatement {
	
	
   //simple if condition  :
      public void verifyAgeIsAdult()   {
    	  
    	  int age =12;
    	  if(age>=10)  {
    		   
    		   System.out.println("The age is adult");
    		   
    	   }
    	   else
    	   {
    		   System.out.println("The age is not adult");
    	   }
      

      }
      

	//if-else condition :


public void verifyCandidateJoinArmyAgeLimitEligibility(String strAge) {
	   
  	 
  	 int intAge  =27;
  	 
         if(intAge>27)  {
  		   System.out.println("Candidate is eligible for join army ");
  		   
  	   }
  	   else 
  	   {
  	System.out.println("Candidate is not eligible for join army");
   
   }
}


  public void verifyArmyCandidateCutOffAge(int intAge ) {
	
	// if -else-if ladder :
	if(intAge>=40) {
		 System.out.println("choose Age 40");
	}
	else if(intAge >20 && intAge<39) {
		System.out.println("choose age 30");
	}
	else 
		
	{
		System.out.println("choose other 20");
	}

}


  //Nested if  condition
  public void verifyCandidateVoterEligibility(int intAge) {
  
  if(intAge<18) {
	  System.out.println("Candiadte is eligible");
	  
  }
    if(intAge<18) {
    	System.out.println("Candidate is not eligible");
    }
    else 
    {
    	System.out.println("Candidate is not eligible");
  }
	  
}   
    
}    
   











