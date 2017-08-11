package com.blovvme.zoo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.blovvme.zoo.R.layout.activity_fourth;

/**
 * Created by Blovvme on 8/11/17.
 */

public class AnimalListAdapter extends RecyclerView.Adapter<AnimalListAdapter.ViewHolder> {

    private static final String TAG = "AnimalListAdapter";
    List<Animals> animalsList = new ArrayList<>();
    Context context;

    public AnimalListAdapter(List<Animals> animalsList) {
        this.animalsList = animalsList;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        //name, diet, status, range
        TextView tvName;
        TextView tvDiet;
        TextView tvStatus;
        TextView tvRange;

        public ViewHolder(View itemView) {
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvDiet = (TextView) itemView.findViewById(R.id.tvDiet);
            tvStatus = (TextView) itemView.findViewById(R.id.tvStatus);
            tvRange = (TextView) itemView.findViewById(R.id.tvRange);


        }

    }//


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: ");
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.animal_list_item, parent, false);
        return new ViewHolder(view);
    }



    private int lastPosition = -1;

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //adding animation to the itemviews
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            animation.setInterpolator(context, android.R.interpolator.bounce);
            holder.itemView.startAnimation(animation);
            lastPosition = position;

        }

        Log.d(TAG, "onBindViewHolder: " + position);
        final Animals animals = animalsList.get(position);
        holder.tvName.setText(animals.getName());
        //holder.tvDiet.setText(animals.getDiet());
        //holder.tvStatus.setText(animals.getStatus());
        //holder.tvRange.setText(animals.getRange());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, FourthActivity.class);
                intent.putExtra("Animals", animals);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return animalsList.size();
    }
}//
