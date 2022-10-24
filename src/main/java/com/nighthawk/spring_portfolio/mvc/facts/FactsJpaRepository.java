package com.nighthawk.spring_portfolio.mvc.facts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

// JPA is an object-relational mapping (ORM) to persistent data, originally relational databases (SQL). Today JPA implementations has been extended for NoSQL.
public interface FactsJpaRepository extends JpaRepository<Facts, Long> {
    // JPA has many built in methods, these few have been prototyped for this application
    void save(String Fact);

    // A
    List<Facts> findAllByOrderByFactAsc();  // returns a List of Jokes in Ascending order
    List<Facts> findByFactIgnoreCase(String fact);  // look to see if Joke(s) exist
}
