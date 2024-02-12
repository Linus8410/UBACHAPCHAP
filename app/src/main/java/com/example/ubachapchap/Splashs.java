package com.example.ubachapchap;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.ListFormatter;
import android.os.Bundle;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;

import java.net.Authenticator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;

public class Splashs extends AppCompatActivity {
    private final static int LOGIN_REQUEST_CODE=7171;
    private List<AuthUI.IdpConfig> providers;
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        delaySplashs();

    }

    private void delaySplashs() {
        Completable.timer(5, TimeUnit.SECONDS, AndroidSchedulers.mainThread()).subscribe(new Action() {
            @Override
            public void run() throws Exception {
                Toast.makeText(Splashs.this, "Welcome to Ubachapchap", Toast.LENGTH_SHORT).show();
            }
        });
    }
}