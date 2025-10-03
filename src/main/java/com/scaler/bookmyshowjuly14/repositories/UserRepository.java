package com.scaler.bookmyshowjuly14.repositories;

import com.scaler.bookmyshowjuly14.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{
}
