package com.example.demoretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    private String getErrorMessage(Response error) {
//        String message = "";
//        try {
//            assert error.errorBody() != null;
//            String body = error.errorBody().string();
//            JsonObject obj = new JsonParser().parse(body).getAsJsonObject();
//            message = obj.get("message").getAsString();
//        } catch (IOException e) {
//            e.printStackTrace();
//            message = "Catch Error Try not work";
//        }
//        return message;
//    }
}
