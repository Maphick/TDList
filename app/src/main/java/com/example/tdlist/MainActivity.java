package com.example.tdlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Note> notes = new ArrayList<>();
    private LinearLayout linearLayoutNotes;
    private FloatingActionButton buttonddNote;
    private FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        Random random = new Random();
        for (int i=0;i<20;i++)
        {
            Note note = new Note(i, "Note " + i, random.nextInt(3));
            notes.add(note);
        }
    }

    private void initViews()
    {
        linearLayoutNotes = findViewById(R.id.linearlayoutNotes);
        buttonddNote = findViewById(R.id.buttonAddNote);
    }

    private void showNotes()
    {
        for (Note note : notes) {
            //  при помощи LayoutInflater из .xml макета создается view
            View view = getLayoutInflater().inflate(R.id.note_item,linearLayoutNotes, false);
            linearLayoutNotes.addView();
        }
    }
}