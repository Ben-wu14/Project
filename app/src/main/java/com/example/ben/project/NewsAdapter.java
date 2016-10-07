package com.example.ben.project;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by 84568 on 2016/10/7.
 */
public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Activity content,ArrayList<News> news){
        super(content,0,news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
