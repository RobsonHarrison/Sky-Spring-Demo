package com.sky.people.rest;

import com.sky.people.entities.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    private List<Person> people = new ArrayList<>();

    // @RequestMapping used to configure the response for Get Request
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting() {
        return "Hello, World!";
    }

    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    public List<Person> listAll() {
        return this.people;
    }


    @PostMapping("/create")
    public Person addPerson(@RequestBody Person person){
        this.people.add(person); // add a new person to the list
        return this.people.get(this.people.size() -1); // return the last person in the list

    }
}
