package adressbook;

public interface AdressBook2 {
	 void add();
	 void display();
   void edit(String firstName);
   void delete(String firstName);
   void addMultiplePerson();
   void sortByfirstName();
   void searchPersonByCity(String firstname);
   void searchPersonByState(String firstname);
   void sortByZipcode();
}
