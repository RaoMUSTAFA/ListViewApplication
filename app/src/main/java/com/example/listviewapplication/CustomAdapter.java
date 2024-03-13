package com.example.listviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<String> {

    private String[] names;
    private String[] info;
    private Integer[] images;
    private Context context;

    public CustomAdapter(Context context, String[] names, String[] info, Integer[] images) {
        super(context, R.layout.my__custom_layout, names);
        this.names = names;
        this.info = info;
        this.images = images;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.my__custom_layout, parent, false);
        }
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.tvName);
        nameTextView.setText(names[position]);
        TextView infoTextView = (TextView) listItemView.findViewById(R.id.tvHome);
        infoTextView.setText(info[position]);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);
        return listItemView;
    }
}