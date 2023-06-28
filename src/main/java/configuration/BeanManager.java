package configuration;

import model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    @Bean
    public List<User> getInitializedList()
    {
        User initUser = new User(1,"Abhishek","abhi123@gmail.com","9898989898",26);
        List<User> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}
