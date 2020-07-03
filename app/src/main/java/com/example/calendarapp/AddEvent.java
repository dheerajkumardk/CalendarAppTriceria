package com.example.calendarapp;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.microedition.khronos.egl.EGLDisplay;

public class AddEvent extends AppCompatActivity {

    EditText eventTitle, eventDescription;
    Button saveEvent;

    public static final String DATABASE_NAME = "mydatabase";
    SQLiteDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_event);
        mDatabase = openOrCreateDatabase(DATABASE_NAME, MODE_PRIVATE, null);
        createTable();


        eventTitle = (EditText) findViewById(R.id.eventTitle);
        eventDescription = (EditText) findViewById(R.id.eventDescription);
        saveEvent = (Button) findViewById(R.id.saveEvent);


    }
    private void createTable(){
        String sql = "CREATE TABLE events (\n" + "    id INTEGER NOT NULL CONSTRAINT events_pk PRIMARY KEY AUTOINCREMENT,\n" + "    title varchar(200) NOT NULL,\n" + "    description varchar(200) NOT NULL,\n" +
                " );";
        mDatabase.execSQL(sql);
    }



}
