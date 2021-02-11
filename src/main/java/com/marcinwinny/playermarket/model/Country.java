package com.marcinwinny.playermarket.model;

public enum Country {

    //TODO: list all countries
    ARGENTINA("Argentina"),
    BRAZIL("Brazil"),
    CANADA("Canada"),
    ENGLAND("England"),
    FRANCE("France"),
    GERMANY("Germany"),
    ICELAND("Iceland"),
    ITALY("Italy"),
    SPAIN("Spain"),
    POLAND("Poland"),
    PORTUGAL("Portugal"),
    NETHERLANDS("Netherlands"),
    TURKEY("Turkey"),
    USA("USA");

    private final String name;

    Country(String name) {
        this.name = name;
    }
}
