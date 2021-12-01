package homework1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Games getGames() {
        return new Games("Dota2" , "Moba");
    }


}
