package controller;

import model.Contact;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.util.List;

/**
 * Created by Halvasan on 17.12.2017.
 */
@RequestMapping("/hello")
public interface ContactController {

    @RequestMapping(value = "/contacts", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    List<Contact> getAllContactsByName(@RequestParam(name = "nameFilter") String nameFilter);
}
