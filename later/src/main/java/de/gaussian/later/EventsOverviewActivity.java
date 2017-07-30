package de.gaussian.later;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class EventsOverviewActivity extends AppCompatActivity {

    private List<Event> events;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.events_overview_activity);

        rv = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void initializeData() {
        events = new ArrayList<>();
        events.add(new Event("Running", "Fabian Gauß", "Go for a fast run.", R.drawable.running));
        events.add(new Event("Running", "Sven Gauß","Go for a chilled run.", R.drawable.running));
        events.add(new Event("Football match", "Dennis Gauß", "Just a classic game of football.", R.drawable.football));
        events.add(new Event("Gaming session", "Dennis Gauß", "Heavy call of duty action.", R.drawable.controller));
        events.add(new Event("Gaming session", "Sven Gauß", "Adventuing hyrule in Zelda: Botw.", R.drawable.controller));
        events.add(new Event("Gaming session", "Fabian Gauß", "Killing krauts in BF1.", R.drawable.controller));
    }

    private void initializeAdapter() {
        EventItemAdapter adapter = new EventItemAdapter(events);
        rv.setAdapter(adapter);
    }
}