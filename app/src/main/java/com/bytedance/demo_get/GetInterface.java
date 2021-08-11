package com.bytedance.demo_get;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface GetInterface {

    //获取json
    @GET("project/list/1/json?cid=294")
    Call<ResponseBody> get1();


    //获取json，使用@query拼接字符串
    @GET("project/list/1/json")
    Call<ResponseBody> get2(@Query("cid") int cid);


    //获取json，使用@query拼接字符串，使用@path动态修改url
    @GET("project/list/{page}/json")
    Call<ResponseBody> get3(@Path("page") int page,@Query("cid") int cid);


    //获取JavaBean对象，使用使用@query拼接字符串，使用@path动态修改url
    @GET("project/list/{page}/json")
    Call<MyResponse> get4(@Path("page") int page,@Query("cid") int cid);


    //获取JavaBean对象，使用@url取代@GET后面的url
    @GET()
    Call<MyResponse> get5(@Url String url);


    //获取JavaBean对象，使用@url取代@GET后面的url，使用@query拼接字符串
    @GET()
    Call<MyResponse> get6(@Url String url,@Query("cid") int cid);


    //错误--------------------@path与@url不可一起使用
    @GET
    Call<MyResponse> get7(@Url String url,@Path("page") int page,@Query("cid") int cid);
}
