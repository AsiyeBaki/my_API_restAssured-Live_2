package com.cydeo.week1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P01_SimpleGetRequest {



    /**
     * 1. Send request to HR url and save the response
     * 2. GET /regions
     * 3. Store the response in Response Object that comes from GET Request
     * 4. Print out followings
     * - Headers
     * - Content-Type
     * - Status Code
     * - Response
     * - Date
     * - Verify response body has "Europe"
     * - Verify response has Date
     */

    @DisplayName("GET method ")
    @Test
    public void test1() {
        Response response = RestAssured.given()
                .accept(ContentType.JSON)
                .get("/regions");

        Assertions.assertTrue(response.headers().hasHeaderWithName("date"));
        Assertions.assertTrue(response.headers().hasHeaderWithName("server"));
        Assertions.assertEquals(200,response.statusCode());
        Assertions.assertEquals("application/json", response.contentType());


    }

}
