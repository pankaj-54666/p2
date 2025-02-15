
package rest.api.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        System.out.printf("ENTER main\n");
        SpringApplication.run(App.class); //this line will start the springcontext
    }
}
