package com.scaler.bookmyshowjuly14;

import com.scaler.bookmyshowjuly14.controllers.UserController;
import com.scaler.bookmyshowjuly14.dtos.ResponseStatus;
import com.scaler.bookmyshowjuly14.dtos.SignUpRequestDto;
import com.scaler.bookmyshowjuly14.dtos.SignUpResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowJuly14Application implements CommandLineRunner
{
    @Autowired
    UserController userController;

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowJuly14Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
//        SignUpRequestDto signUpRequestDto = new SignUpRequestDto();
//        signUpRequestDto.setUsername("test3@scaler.com");
//        signUpRequestDto.setPassword("password");
//
//        SignUpResponseDto signUpResponseDto = userController.signUp(signUpRequestDto);
//        if(signUpResponseDto.getStatus().equals(ResponseStatus.SUCCESS))
//        {
//            System.out.println("User created successfully");
//        }else {
//            System.out.println("User creation failed");
//        }

        userController.login("test3@scaler.com", "password");
    }
}
