package com.example.demoretrofit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
    public void printHashKey(Context pContext) {
        try {
            @SuppressLint("PackageManagerGetSignatures") PackageInfo info = pContext.getPackageManager().getPackageInfo(pContext.getPackageName(), PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                String hashKey = new String(Base64.encode(md.digest(), 0));
                Log.i("key1", "printHashKey() Hash Key: " + hashKey);
            }
        } catch (NoSuchAlgorithmException e) {
            Log.e("key", "printHashKey()", e);
        } catch (Exception e) {
            Log.e("haskhkey", "printHashKey()", e);
        }
    }
}
