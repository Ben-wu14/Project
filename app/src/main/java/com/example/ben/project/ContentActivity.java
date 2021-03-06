package com.example.ben.project;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ContentActivity extends AppCompatActivity {
    private News newsdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Intent intent=getIntent();
        newsdata=(News)intent.getSerializableExtra("Data");

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setTitle(newsdata.getTitleOfText());
        setSupportActionBar(myToolbar);

        TextView title=(TextView)findViewById(R.id.title2);
        title.setText(newsdata.getTitleOfText());

        ImageView image=(ImageView)findViewById(R.id.imageId2);
        image.setImageResource(newsdata.getImage_id());

        TextView username=(TextView)findViewById(R.id.provider);
        username.setText(newsdata.getNameOfProvider());

        TextView userProfile=(TextView)findViewById(R.id.provider_info);
        userProfile.setText(newsdata.getProfile_of_provider());

        TextView numberOfLikes=(TextView)findViewById(R.id.numberOfGood);
        numberOfLikes.setText(""+newsdata.getNumber_of_likes());

        TextView content=(TextView)findViewById(R.id.content2);
        content.setText(newsdata.getContentString(getBaseContext()));

        TextView comment=(TextView)findViewById(R.id.comment);
        comment.setText("评论 "+newsdata.getNumber_of_comment());
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.content_menu, menu);
        return true;
    }
}
