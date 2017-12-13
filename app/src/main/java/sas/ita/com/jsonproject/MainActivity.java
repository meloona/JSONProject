package sas.ita.com.jsonproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;

import java.util.ArrayList;

import sas.ita.com.jsonproject.contactsdetails.ContactsPerson;

public class MainActivity extends AppCompatActivity {

    //url that need to get data from
    private static final String JSONObjectURL="https://api.androidhive.info/contacts/";
    public RequestQueue queue;
    public JsonObjectRequest objectRequest;
   // public JsonArrayRequest arrayRequest;
    public ArrayList<ContactsPerson>ContactsPerson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
