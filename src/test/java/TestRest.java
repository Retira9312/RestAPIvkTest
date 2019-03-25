package com.example.tests;

import static io.restassured.RestAssured.get;

import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;

import org.testng.annotations.Test;



public class TestRest {

    @Test(description = "API GET REQUEST TEST")
    public void getRequestExampleTest() throws JSONException {

        Response response = get("https://api.vk.com/method/users.get? user_id=slayersass");
        JSONArray jsonResponse = new JSONArray(response.asString());
        JSONArray jsonResponse1 = new JSONArray(response.asString());
        JSONArray jsonResponse2 = new JSONArray(response.asString());
        String id = jsonResponse.getJSONObject(0).getString("id");
        String first_name = jsonResponse1.getJSONObject(0).getString("first_name");
        String last_name = jsonResponse2.getJSONObject(0).getString("last_name");
        System.out.println('\n' + id);
        System.out.println('\n' + first_name);
        System.out.println('\n' + last_name);

    }
}

