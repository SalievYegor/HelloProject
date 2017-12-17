package service;


import model.Contact;

import java.util.List;

/**
 * Created by Halvasan on 17.12.2017.
 */
public interface ContactService {

    List<Contact> getContactsByNameFilter(String nameFilter);
}
