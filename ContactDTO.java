package SINGLETON;
public class ContactDTO {
    private static ContactDTO contactDTO = null;
    private ContactDTO() {}
    public static ContactDTO getInstance() {
        if (contactDTO == null) {
            contactDTO = new ContactDTO();
        }
        return contactDTO;
    }
    public static void getContactDetails() { System.out.println("Contact Details");}}


