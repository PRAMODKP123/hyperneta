package com.xworkz.hybernatedemo;
public class Tester {
	
	public static void main(String[] args) {
		
		Restaurantentity rest = new Restaurantentity();
		
		
		rest.setRestaurantID(2);
		rest.setContactNo(9947362456l);
		rest.setName("kababa corner");
        rest.setType("nonveg");	
        rest.setRating(4.5);
        
        
        RestaurantDAO ret = new RestaurantDAO();
         ret.saveRestaurent(rest); 
         System.out.println("save successfuly");
	}

}
