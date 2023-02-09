package com.sky.people.rest;

import com.sky.people.entities.Person;
import com.sky.people.service.PersonService;
import com.sky.people.service.PersonServiceList;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

//    the service variable is a dependancy
    private PersonService service;

    public PersonController(PersonService service){
        this.service = service;
    }



    // @RequestMapping used to configure the response for Get Request
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting() {
        return "Hello, World!";
    }

    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    public List<Person> listAll() {
        return this.service.getAll();

    }

    @GetMapping ("/get/{id}")
    public Person getPerson(@PathVariable int id){ // pulls id from the path (url)
        return this.service.getById(id);

    }

    @DeleteMapping("/remove/{id}")
    public Person removePerson(@PathVariable int id){
        return this.service.remove(id);

    }

    @PatchMapping("/update/{id}")
    public Person updatePerson(@PathVariable int id, @PathParam("name") String name, @PathParam("age") Integer age, @PathParam("job") String job){
        return this.service.update(id, name, age, job);


    }

    @PostMapping("/create")
    public Person addPerson(@RequestBody Person person){ // pull person from the body of the request
        return this.service.createPerson(person);

    }

}
