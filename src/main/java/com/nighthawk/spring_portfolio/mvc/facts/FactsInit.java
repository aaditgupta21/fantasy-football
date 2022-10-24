package com.nighthawk.spring_portfolio.mvc.facts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component // Scans Application for ModelInit Bean, this detects CommandLineRunner
public class FactsInit {

    // Inject repositories
    @Autowired
    FactsJpaRepository repository2;

    @Bean
    CommandLineRunner run2() { // The run() method will be executed after the application starts
        return args -> {
            // Fail safe data validations

            // starting jokes
            final String[] factsArray = {
                    "Among the Ravens’ 20 best PPR fantasy seasons in franchise history among wide receivers, Marquise Brown (2021) is the lone one who has made that list in the last five years.",
                    "Josh Allen has finished as the No. 1 quarterback in fantasy points in each of the last two seasons",
                    "Christian McCaffrey ranks third in fantasy points per game average (21.8) at his position in the last two years",
                    "Ja’Marr Chase is coming off the second-best rookie season from a wide receiver based on PPR points (304.6), falling just shy of Randy Moss’s record-setting 304.7 points back in 1998",
                    "Ezekiel Elliott finished seventh in fantasy points among running backs last season, and he’s now finished no worse than ninth at the position in every NFL season in which he’s played at least 15 games",
                    "In his 10 seasons in Seattle, Russell Wilson helped fuel a total of nine 200-plus point campaigns from his wide receivers. ",
                    "Davante Adams had 669 catches and 73 touchdowns in his 116 career games with the Green Bay Packers",
                    "Travis Kelce needs just 46.34 fantasy points to become only the seventh tight end in the Super Bowl era to score over 2,000 points in his career",
                    "Justin Herbert has scored 713.6 fantasy points in his first two seasons in the NFL.",
                    "The Dolphins acquired Tyreek Hill this offseason in a blockbuster deal. In his last three full seasons in Kansas City, he scored at least 296.5 fantasy points and was over 300 points twice.",
                    "Justin Jefferson has recorded 604.6 fantasy points in his first two seasons in the NFL",
                    "The 49ers have the most fantasy points per game (PPG) from their running backs since 2018 (27.3)"
            };

            // make sure Joke database is populated with starting jokes
            for (String fact : factsArray) {
                List<Facts> test = repository2.findByFactIgnoreCase(fact); // JPA lookup
                if (test.size() == 0)
                    repository2.save(new Facts(null, fact, 0, 0)); // JPA save
            }

        };
    }
}
