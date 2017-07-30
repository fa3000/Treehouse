package de.gaussian.later;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class EventItemAdapter extends RecyclerView.Adapter<EventItemAdapter.EventViewHolder> {

    public static class EventViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView eventName;
        TextView eventDescription;
        TextView eventCreator;
        ImageView eventPicture;

        EventViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.event_card);
            eventName = (TextView) itemView.findViewById(R.id.event_name);
            eventDescription = (TextView) itemView.findViewById(R.id.event_description);
            eventPicture = (ImageView) itemView.findViewById(R.id.event_picture);
            eventCreator = (TextView) itemView.findViewById(R.id.event_creator);
        }
    }

    List<Event> events;

    EventItemAdapter(List<Event> events) {
        this.events = events;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.event_item, viewGroup, false);
        EventViewHolder pvh = new EventViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(EventViewHolder eventViewHolder, int i) {
        eventViewHolder.eventName.setText(events.get(i).name);
        eventViewHolder.eventDescription.setText(events.get(i).description);
        eventViewHolder.eventPicture.setImageResource(events.get(i).picture);
        eventViewHolder.eventCreator.setText(events.get(i).creator);

        eventViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), EventDetailActivity.class);
                v.getContext(). startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return events.size();
    }
}
