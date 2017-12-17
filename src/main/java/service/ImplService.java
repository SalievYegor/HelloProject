package service;

import dao.ContactDao;
import model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplService implements ContactService {


    private ContactDao contactDao = new ContactDao();

    @Override
    public List<Contact> getContactsByNameFilter(String nameFilter) {
        return contactDao.getAllContacts() ;
    }

}
