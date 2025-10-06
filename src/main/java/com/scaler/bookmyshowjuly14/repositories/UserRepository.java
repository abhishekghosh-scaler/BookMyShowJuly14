package com.scaler.bookmyshowjuly14.repositories;

import com.scaler.bookmyshowjuly14.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>
{
    @Override
    Optional<User> findById(Long aLong);

    Optional<User> findByUsername(String username);

    @Override
    User save(User user);
}
