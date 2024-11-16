package com.example.shoppingcart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int[] flags;
    String[] pizzaNames;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter(Context context,String[] pizzaNames, int[] flags){
        this.context=context;
        this.pizzaNames=pizzaNames;
        this.flags=flags;
    }

    @Override
    public int getCount() {
        return pizzaNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_view,parent,false);
        }
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageViewId);
        TextView textView = (TextView)convertView.findViewById(R.id.pizzaNameId);

        imageView.setImageResource(flags[position]);
        textView.setText(pizzaNames[position]);
        return convertView;

    }
}
