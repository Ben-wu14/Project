package com.example.ben.project;

import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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
        View listItem =convertView;
        if(listItem==null){
            listItem= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        News news=getItem(position);
        TextView topicText=(TextView)listItem.findViewById(R.id.topic_title);
        topicText.setText(news.getTitleOfText());
        TextView size=(TextView)listItem.findViewById(R.id.size_of_info);
        size.setText(news.getSize_of_text());
        TextView content=(TextView)listItem.findViewById(R.id.preview_of_content);
        content.setText(news.getContentString(getContext()));
        ImageView image=(ImageView)listItem.findViewById(R.id.icon_for_people);
        image.setImageResource(news.getImage_id());
        return listItem;
    }
}
