package adressbook;

public interface IAdressBook {
public void add();
public void display();
public void edit(String firstName);
public void delete(String firstName);
public void addMultiplePerson();
public void sortByfirstName();
public void searchPersonByCity(String firstname);
public void searchPersonByState(String firstname);
public void sortByZipcode();
}