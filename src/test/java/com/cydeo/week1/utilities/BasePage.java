package com.cydeo.week1.utilities;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BasePage {
    @BeforeAll
    public void init(){
        RestAssured.baseURI = "https://api.training.cydeo.com";
    }
}
