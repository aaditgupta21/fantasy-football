package com.nighthawk.spring_portfolio.mvc.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // annotation to simplify the creation of RESTful web services
@RequestMapping("/api/facts")  // all requests in file begin with this URI
public class ScheduleAPIController {

// Autowired enables Control to connect URI request and POJO Object to easily for Database CRUD operations
@Autowired
private ScheduleJpaRepository repository2;

    /* GET List of Jokes
     * @GetMapping annotation is used for mapping HTTP GET requests onto specific handler methods.
     */
    @GetMapping("/")
    public ResponseEntity<List<Schedule>> getFacts() {
        // ResponseEntity returns List of Jokes provide by JPA findAll()
        return new ResponseEntity<>( repository2.findAll(), HttpStatus.OK);
    }
}
