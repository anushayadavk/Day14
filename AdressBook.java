package adressbook;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AdressBook implements IAdressBook {
	
	Scanner scanner = new Scanner(System.in);
	List<Person> personList = new ArrayList<Person>();
	
	public void add() {
		    System.out.println("First name");
	        String firstName = scanner.nextLine();
	        System.out.println("Last name");
	        String lastName = scanner.nextLine();
	        System.out.println("Address");
	        String address = scanner.nextLine();
	        System.out.println("City");
	        String city = scanner.nextLine();
	        System.out.println("State");
	        String state = scanner.nextLine();
	        System.out.println("Phone");
	        long mobileNo = scanner.nextLong();
	        System.out.println("zip code");
	        String zip = scanner.next();
	        
	        Person person1 = new Person(firstName, lastName, address, city, state, mobileNo, zip);
	        personList.add(person1);
	        System.out.println("Contact added successfully");
		}
	
	    public void display() {
	    	for(int i = 0; i< personList.size(); i++) {
	    		Person person = personList.get(i);
	    		System.out.println("FirstName:"+person.getFirstName()+"\n"+"LastName:"+person.getLastName()+"\n"+"Adress:"+person.getAddress()+"\n"+"City:"+person.getCity()+"\n"+"State:"+person.getCity()+"Phone-Number:"+person.getMobileNo()+"\n"+"Pin-code:"+person.getPincode());
	    	}
	    }
	
	    public void edit(String firstName) {
            for (int i = 0; i < personList.size(); i++) {
            	Person person = personList.get(i);
            	Scanner scanner = new Scanner(System.in);

            	System.out.println("Hi " + person.getFirstName() + " New Address");
                String address = scanner.nextLine();
                person.setAddress(address);

                System.out.println("Hi " + person.getFirstName() + " New city");
                String city = scanner.nextLine();
                person.setCity(city);

                System.out.println("Hi " + person.getFirstName() + "  New state");
                String state = scanner.nextLine();
                person.setState(state);

                System.out.println("Hi " + person.getFirstName() + " New zip Code");
                String zip = scanner.nextLine();
                person.setPincode(zip);

                System.out.println("Hi " + person.getFirstName() + " New Phone No");
                int PhoneNo = scanner.nextInt();
                person.setMobileNo(PhoneNo);

                System.out.println("Hi " + person.getFirstName() + " Sucessfully updated");
          }
            
        }
	    
        public void delete(String name) {
            for (int i = 0; i < personList.size(); i++) {
            	if(personList.get(i).getFirstName().equals(name)) {
            		Person person = personList.get(i);
            		personList.remove(person);
            	}
            }
         }
        
        public void addMultiplePerson() {
        	 
        	 System.out.println("Enter a person Name:");
        	 String firstName = scanner.nextLine();
        	 for(int i = 0; i <  personList.size(); i++) {
        		 Person person = personList.get(i);
        		 if(personList.get(i).getFirstName().equals(firstName)) {
        			 System.out.println("Duplicate");
        		 }
        	 }
         }
         
         public void searchPersonByCity(String firstname) {
             List<Person> listPerson = personList.stream().filter(person1 -> person1.getFirstName().equalsIgnoreCase(firstname)).collect(Collectors.toList());
             personList.stream().forEach(System.out::println);
         }
         
         public void searchPersonByState(String firstname) {
             List<Person> listPerson = personList.stream().filter(person1 -> person1.getFirstName().equalsIgnoreCase(firstname)).collect(Collectors.toList());
             personList.stream().forEach(System.out::println);
         }
         
         public void sortByfirstName() {
 	         Collections.sort(personList,(name1, name2)  -> name1.getFirstName().compareTo(name2.getFirstName()));
 	         System.out.println(personList);
 	     }
         
         public void sortByZipcode() {
 	         Collections.sort(personList,( z1,z2)  -> z1.getFirstName().compareTo(z2.getFirstName()));
 	         System.out.println(personList);
 	     }
 	    
        	 
     }
