package com.marcinwinny.playermarket.exception;

public class PlayerNotFoundException extends RuntimeException{
    public PlayerNotFoundException(String s) {
        super(s);
    }
}
