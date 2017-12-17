package dao;


import model.Contact;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ContactDao {

    private List<Contact> contact = Arrays.asList(
            new Contact(1, "John"),
            new Contact(2, "Alice"),
            new Contact(3, "Chelsea")
    );

    public List<Contact> getAllContacts(){
        return contact;
    }

}
