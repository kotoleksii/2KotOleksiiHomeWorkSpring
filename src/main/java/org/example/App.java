package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        User user = (User) context.getBean("user");
        Address address = (Address) context.getBean("address");

        System.out.println(
                            user.getLastName() +
                        " " + user.getFirstName() +
                    " " + address.getZipCode() +
                " " + address.getCountry() +
            " " + address.getCity()
        );

        context.close();
    }
}
