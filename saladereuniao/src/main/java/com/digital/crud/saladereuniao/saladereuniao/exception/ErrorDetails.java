package com.digital.crud.saladereuniao.saladereuniao.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ErrorDetails {

    private Date timesTamp;
    private String message;
    private String details;
}
