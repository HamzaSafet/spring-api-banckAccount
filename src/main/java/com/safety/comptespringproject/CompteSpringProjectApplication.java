package com.safety.comptespringproject;

import com.safety.comptespringproject.entities.BancAcount;
import com.safety.comptespringproject.repositories.BancAcountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CompteSpringProjectApplication {
    @Autowired
    private BancAcountRepo bancAcountRepo;
    public static void main(String[] args) {
        SpringApplication.run(CompteSpringProjectApplication.class, args);
    }

    /*@Bean
     CommandLineRunner start(){
        return args -> {
            BancAcount bancAcount=new BancAcount();
            bancAcount.setBalance(10000);
            bancAcount.setNumeroCompte("07645636");
            bancAcount.setStatus("Active");
            bancAcount.setCurrency("DH");
            bancAcountRepo.save(bancAcount);
        };
    }*/

}
