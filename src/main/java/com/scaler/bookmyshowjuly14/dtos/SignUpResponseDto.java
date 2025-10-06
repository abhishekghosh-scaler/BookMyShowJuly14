package com.scaler.bookmyshowjuly14.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDto
{
    private ResponseStatus status;
    private String failureMessage;
    private Long userId;
}
