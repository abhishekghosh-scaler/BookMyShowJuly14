package com.scaler.bookmyshowjuly14.services;

import com.scaler.bookmyshowjuly14.models.User;
import com.scaler.bookmyshowjuly14.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService
{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User signUp(String username, String password)
    {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if(userOptional.isPresent())
        {
            throw new IllegalArgumentException("Username is already in use");
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setBookings(new ArrayList<>());
        return userRepository.save(user);
    }
}
