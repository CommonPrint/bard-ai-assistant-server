package org.example;


//import com.pkslow.ai.util.NetworkUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        NetworkUtils.setUpProxy("localhost", "4813");
        SpringApplication.run(Main.class, args);
    }
}