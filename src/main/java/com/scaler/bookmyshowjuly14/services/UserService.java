package com.scaler.bookmyshowjuly14.services;

import com.scaler.bookmyshowjuly14.models.User;

public interface UserService
{
    User signUp(String username, String password);
    User login(String username, String password);
}
