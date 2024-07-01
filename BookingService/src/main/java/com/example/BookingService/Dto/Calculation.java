package com.example.BookingService.Dto;

public class Calculation {
	
	public double price(String type) {
		
		  if(type =="A") {
				  return 397.61;
			  }
	       if(type=="B") {
				  return 441.65;
			  }
	       if(type =="C") {
	    	   return 449.40;
			  }
	       if(type =="D") {
	    	   return 263.73;
			  }
	       if(type =="E") {
				  return 274.52;
			  }
	       if(type =="F") {
	    	   return 459.66;
			  }
	       	       if(type =="H") {
	    	   return 477.06;
			  }
	       if(type =="I") {
	    	   return 451.84;
			  }
	       if(type == "G") {
	    	   return 296.21;
			  }

	       
	       return 406.24;
	
	}
}
