package org.example;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
@ComponentScan("org.example")
@EnableAspectJAutoProxy
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Address address() {
        return new Address(69001, "Ukraine", "Zaporizhzhia");
    }

    @Bean
    public User user() {
        return new User(address());
    }
}
