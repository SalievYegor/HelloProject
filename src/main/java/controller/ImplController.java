package controller;

import model.Contact;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ImplService;


import java.util.List;


@EnableAutoConfiguration
@RestController
public class ImplController implements ContactController {


    ImplService contactService = new ImplService();

    @Override
    public List<Contact> getAllContactsByName(@RequestParam(name = "nameFilter") String nameFilter) {
        return contactService.getContactsByNameFilter(nameFilter);
    }


}
