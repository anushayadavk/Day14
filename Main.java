package adressbook;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		 
		 AdressBook adressBookImplementation =new AdressBook();
	     boolean condition = true;
	     
	     while (condition == true) {
	    	 Scanner scanner= new Scanner(System.in);
	    	 Scanner option = new Scanner(System.in);
	         System.out.println("1.Add Person"+"\n"+"2.Display"+"\n"+"3.Edit person"+"\n"+"4."+"Delete Person"+"\n"+"5.Add Multiple Person"+"\n"+"6.SearchPersonByCity"+"\n"+"7.searchPersonByState"+"\n"+"8.SortByFirstName"+"\n"+"9.SortByZipCode");
	         switch(option.nextInt()) {
	             case 1:adressBookImplementation.add();
	                    break;
	             case 2:adressBookImplementation.display(); 
                        break;
	                    
	             case 3:System.out.println("Enter the firstName:");
	                    String firstName = scanner.nextLine();
	            	    adressBookImplementation.edit(firstName);
	            	    break;
	                    
	             case 4:System.out.println("Enter the Name of the person do you wants to delete");
	                    String name = scanner.nextLine();
	            	    adressBookImplementation.delete(name);
	            	    break;
	             
	             case 5:adressBookImplementation.addMultiplePerson();
	                    break;
	                    
	             case 6:System.out.println("Enter a City Name");
	                    String city = scanner.nextLine();
	                    adressBookImplementation.searchPersonByCity(city);
	                    break;
	             
	             case 7:System.out.println("Enter a State Name");
	                    String state = scanner.nextLine();
	                    adressBookImplementation.searchPersonByState(state);
	                    break;
	             
	             case 8:adressBookImplementation.sortByfirstName();
	            	    break;
	            	    
	             case 9:adressBookImplementation.sortByZipcode();
	            	    break;
	             
	             default:System.out.println("Thank you");
	            	 
	          }
	     }
	}

}
