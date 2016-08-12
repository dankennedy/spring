package uk.co.firstcs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dan on 12/08/2016.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }
}
