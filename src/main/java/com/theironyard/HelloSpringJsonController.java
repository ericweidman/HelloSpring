package com.theironyard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ericweidman on 3/7/16.
 */
@RestController
public class HelloSpringJsonController {
    @RequestMapping(path = "/person.json", method = RequestMethod.GET)
    public Person jsonhome(){
     return new Person ("Alice", "Charleston,", 30);
    }
}
