package com.scaler.bookmyshowjuly14.controllers;

import com.scaler.bookmyshowjuly14.dtos.ResponseStatus;
import com.scaler.bookmyshowjuly14.dtos.SignUpRequestDto;
import com.scaler.bookmyshowjuly14.dtos.SignUpResponseDto;
import com.scaler.bookmyshowjuly14.models.User;
import com.scaler.bookmyshowjuly14.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController
{
    private final UserService userService;

    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    public SignUpResponseDto signUp(SignUpRequestDto signUpRequestDto)
    {
        SignUpResponseDto signUpResponseDto = new SignUpResponseDto();
        try
        {
            User user = userService.signUp(signUpRequestDto.getUsername(),
                    signUpRequestDto.getPassword());

            signUpResponseDto.setUserId(user.getId());
            signUpResponseDto.setStatus(ResponseStatus.SUCCESS);
        }catch (Exception e)
        {
            signUpResponseDto.setStatus(ResponseStatus.FAILURE);
            signUpResponseDto.setFailureMessage(e.getMessage());
        }

        return signUpResponseDto;
    }
}
