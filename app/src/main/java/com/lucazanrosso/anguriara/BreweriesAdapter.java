package com.lucazanrosso.anguriara;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;
import java.util.LinkedHashMap;

class BreweriesAdapter extends RecyclerView.Adapter<BreweriesAdapter.ViewHolder>{
    private Context context;
    private String[] breweries;
    private String[] breweriesRelated;
    private TypedArray images;

    static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        View breweryLayout;
        ViewHolder(View v) {
            super(v);
            breweryLayout = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    BreweriesAdapter(String[] breweries, String[] breweriesRelated, TypedArray images) {
        this.breweries = breweries;
        this.breweriesRelated = breweriesRelated;
        this.images = images;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public BreweriesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        context = parent.getContext();
        View v = LayoutInflater.from(context)
                .inflate(R.layout.layout_brewery, parent, false);
        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        View breweryLayout = holder.breweryLayout;
        TextView breweryName = breweryLayout.findViewById(R.id.brewery_name);
        breweryName.setText(breweries[position]);

//        for (String breweryRelated : breweriesRelated) {
//
//            if (breweries[position].equals(breweryRelated)) {
//
//                View nextEveningCard = LayoutInflater.from(context)
//                        .inflate(R.layout.layout_brewery, null);
//
//                LinearLayout biersLayout = nextEveningCard.findViewById(R.id.biers_layout);
//
//                biersLayout.addView(nextEveningCard);
//
//            }
//        }

//        TextView nextEveningsTitle = breweryLayout.findViewById(R.id.next_evening_title);
//        TextView nextEveningsText = breweryLayout.findViewById(R.id.next_evening_text);
//        Button detailsButton = breweryLayout.findViewById(R.id.details_button);
//        nextEveningsTitle.setText(CalendarFragment.setDateTitle(MainActivity.days.get(position)));
//        nextEveningsText.setText(CalendarFragment.setDateText(MainActivity.days.get(position), context));
//        final Bundle dayArgs = new Bundle();
//        dayArgs.putSerializable("date", MainActivity.days.get(position));
//        detailsButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                DayScreenSlidePagerFragment dayScreenSlidePagerFragment = new DayScreenSlidePagerFragment();
//                dayScreenSlidePagerFragment.setArguments(dayArgs);
//                mActivity.getSupportFragmentManager().beginTransaction()
//                        .setCustomAnimations(R.anim.enter_animation, R.anim.exit_animation, R.anim.enter_animation, R.anim.exit_animation)
//                        .replace(R.id.frame_container, dayScreenSlidePagerFragment)
//                        .addToBackStack("secondary")
//                        .commit();
//            }
//        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return breweries.length;
    }
}
