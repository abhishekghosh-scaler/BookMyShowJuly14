package com.scaler.bookmyshowjuly14.services;

import com.scaler.bookmyshowjuly14.models.User;
import com.scaler.bookmyshowjuly14.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService
{
    private final UserRepository userRepository;

    /*
    * This is a terrible way. Going ahead, we would create a Bean and inject it, the ideal way.
    * */
    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

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
        user.setPassword(bCryptPasswordEncoder.encode(password));
        user.setBookings(new ArrayList<>());
        return userRepository.save(user);
    }

    @Override
    public User login(String username, String password)
    {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isEmpty())
        {
            throw new IllegalArgumentException("Username is incorrect");
        }

        User user = userOptional.get();
        if(bCryptPasswordEncoder.matches(password, user.getPassword()))
        {
            return user;
        }

        throw new IllegalArgumentException("Invalid password");
    }
}
