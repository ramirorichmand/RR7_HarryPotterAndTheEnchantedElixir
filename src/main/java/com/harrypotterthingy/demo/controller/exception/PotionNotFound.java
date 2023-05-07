package com.harrypotterthingy.demo.controller.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class PotionNotFound extends Exception {
    public PotionNotFound(String message) { super(message);
    }
}
