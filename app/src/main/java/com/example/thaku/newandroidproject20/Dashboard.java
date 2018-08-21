package com.example.thaku.newandroidproject20;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import utils.AppController;

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = Dashboard.class.getSimpleName();
    private Button mBtnLogin;
    ImageView drawer_open;
    DrawerLayout drawer;
    NavigationView navigation_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        drawer_open = findViewById(R.id.drawer_open);
        navigation_view = findViewById(R.id.navigation_view);
        drawer = findViewById(R.id.drawer);

        drawer_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: " + "Clicked");
                drawer.openDrawer(GravityCompat.START);
            }
        });

        navigation_view.setNavigationItemSelectedListener(this);

//        loginWithUserId();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.service:
                Intent intent = new Intent(this, ServicesActivity.class);
                startActivity(intent);
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//        Log.d(TAG, "onNavigationItemSelected: "+ item.getItemId());
//        int id = item.getItemId();
//
//        switch (id) {
//            case R.id.service:
//                Intent intent = new Intent(Dashboard.this, Services.class);
//                startActivity(intent);
//                break;
//        }
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }

//    // user login with id and password
//    private void loginWithUserId(){
//        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, "rethinkux.com", null,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        Log.d(TAG, "onResponse: "+ response);
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.e(TAG, "onErrorResponse: "+ error );
//            }
//        });
//        AppController.getInstance().addToRequestQueue(jsonObjectRequest);
//    }
}
