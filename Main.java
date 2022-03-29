package SINGLETON ;
public class Main {

public static void main(String[] args) {
		ContactDTO object1 
		= ContactDTO.getInstance();
		ContactDTO object2 = ContactDTO.getInstance();
		System.out.println(object2);
		System.out.println(object1);
		//getContactDetails();
}
}