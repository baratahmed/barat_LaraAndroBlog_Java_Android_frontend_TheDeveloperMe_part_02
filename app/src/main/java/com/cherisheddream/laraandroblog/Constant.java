package com.cherisheddream.laraandroblog;

public class Constant {
    public static final String URL = "https://baratahmed.com/lara_andro_blog_laravel/public/";
    public static final String HOME = URL+"api";
    public static final String LOGIN = HOME+"/login";
    public static final String LOGOUT = HOME+"/logout";
    public static final String REGISTER = HOME+"/register";
    public static final String SAVE_USER_INFO = HOME+"/save_user_info";
    public static final String POSTS = HOME+"/posts";
    public static final String ADD_POST = POSTS+"/store";
    public static final String UPDATE_POST = POSTS+"/update";
    public static final String DELETE_POST = POSTS+"/delete";
    public static final String LIKE_POST = POSTS+"/like";
    public static final String COMMENTS = POSTS+"/comments";
    public static final String CREATE_COMMENT = HOME+"/comments/store";
    public static final String DELETE_COMMENT = HOME+"/comments/delete";
    public static final String MY_POSTS = POSTS+"/my_posts";
}
