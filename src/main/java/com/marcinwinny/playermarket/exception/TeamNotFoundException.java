package com.marcinwinny.playermarket.exception;

public class TeamNotFoundException extends RuntimeException {
    public TeamNotFoundException(String currentTeam) {
        super(currentTeam);
    }
}
