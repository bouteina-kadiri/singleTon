package SSinglton ;
public class ContactDTO {
	
	private static ContactDTO contactDTO=null;
	private ContactDTO() {
		
	}
	
	public static ContactDTO getInstance(){
		if(contactDTO==null) {
			contactDTO = new ContactDTO();
		}
		return contactDTO;
		
	}
	public static void getContactDetails() { System.out.println("Contact Details");}
	
	
	public static void main(String[] args) {
		ContactDTO object1 
		= ContactDTO.getInstance();
		ContactDTO object2 = ContactDTO.getInstance();
		System.out.println(object2);
		System.out.println(object1);
		getContactDetails();
}}
