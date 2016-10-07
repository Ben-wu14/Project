package com.example.ben.project;

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
    public News(int image_id,int content_id){
        this.image_id=image_id;
        this.content_id=content_id;
    }
    public void setNameOfProvider(String name_of_provider){
        this.name_of_provider=name_of_provider;
    }
    public void setProfile_of_provider(String profile_of_provider){
        this.profile_of_provider=profile_of_provider;
    }
    public void setNumber_of_likes(int number_of_likes){
        this.number_of_likes=number_of_likes;
    }
    public void setNumber_of_comment(int number_of_comment){
        this.number_of_comment=number_of_comment;
    }
    public void setTitleOfText(String title){
        this.title=title;
    }
    public void setSize_of_text(int size_of_text){
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
    public int getSize_of_text(){
        return size_of_text;
    }
    public int getContent_id(){
        return content_id;
    }
}
