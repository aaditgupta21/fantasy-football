package com.nighthawk.spring_portfolio.mvc.facts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // annotation to simplify the creation of RESTful web services
@RequestMapping("/api/facts")  // all requests in file begin with this URI
public class FactsApiController {

    // Autowired enables Control to connect URI request and POJO Object to easily for Database CRUD operations
    @Autowired
    private FactsJpaRepository repository2;

    /* GET List of Jokes
     * @GetMapping annotation is used for mapping HTTP GET requests onto specific handler methods.
     */
    @GetMapping("/")
    public ResponseEntity<List<Facts>> getFacts() {
        // ResponseEntity returns List of Jokes provide by JPA findAll()
        return new ResponseEntity<>( repository2.findAll(), HttpStatus.OK);
    }

    /* Update Like
     * @PutMapping annotation is used for mapping HTTP PUT requests onto specific handler methods.
     * @PathVariable annotation extracts the templated part {id}, from the URI
     */
    @PutMapping("/like/{id}")
    public ResponseEntity<Facts> setLike(@PathVariable long id) {
        /*
        * Optional (below) is a container object which helps determine if a result is present.
        * If a value is present, isPresent() will return true
        * get() will return the value.
        */
        Optional<Facts> optional = repository2.findById(id);
        if (optional.isPresent()) {  // Good ID
            Facts fact = optional.get();  // value from findByID
            fact.setLike(fact.getLike()+1); // increment value
            repository2.save(fact);  // save entity
            return new ResponseEntity<>(fact, HttpStatus.OK);  // OK HTTP response: status code, headers, and body
        }
        // Bad ID
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);  // Failed HTTP response: status code, headers, and body
    }

    /* Update Jeer
     */
    @PutMapping("/jeer/{id}")
    public ResponseEntity<Facts> setJeer(@PathVariable long id) {
        Optional<Facts> optional = repository2.findById(id);
        if (optional.isPresent()) {  // Good ID
            Facts fact = optional.get();
            fact.setDislike(fact.getDislike()+1);
            repository2.save(fact);
            return new ResponseEntity<>(fact, HttpStatus.OK);
        }
        // Bad ID
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
