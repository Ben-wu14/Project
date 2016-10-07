package com.example.ben.project;

import android.content.Context;
import android.content.res.Resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * Created by 84568 on 2016/10/7.
 */
public class News {
    private String name_of_provider;
    private String profile_of_provider;
    private int number_of_likes;
    private int number_of_comment;
    private int image_id;
    private String title;
    private int size_of_text;
    private int content_id;
    public News(String name_of_provider,String profile_of_provider,int number_of_likes,int number_of_comment,int image_id,String title,int size_of_text,int content_id){
        this.image_id=image_id;
        this.content_id=content_id;
        this.name_of_provider=name_of_provider;
        this.profile_of_provider=profile_of_provider;
        this.number_of_likes=number_of_likes;
        this.number_of_comment=number_of_comment;
        this.title=title;
        this.size_of_text=size_of_text;
    }
    public String getNameOfProvider(){
        return name_of_provider;
    }
    public String getProfile_of_provider(){
        return profile_of_provider;
    }
    public int getNumber_of_likes(){
        return number_of_likes;
    }
    public int getNumber_of_comment(){
        return number_of_comment;
    }
    public int getImage_id(){
        return image_id;
    }
    public String getTitleOfText(){
        return title;
    }
    public String getSize_of_text(){
        return ""+size_of_text+"k";
    }
    public int getContent_id(){
        return content_id;
    }
    public String getContentString(Context context){
        Resources res = context.getResources();
        InputStream in = null;
        InputStreamReader inputStreamReader = null;
        try {
            in = res.openRawResource(content_id);
            inputStreamReader = new InputStreamReader(in, "gbk");
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(inputStreamReader);
        StringBuffer sb = new StringBuffer("");
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
