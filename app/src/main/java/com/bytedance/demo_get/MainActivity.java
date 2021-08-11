package com.bytedance.demo_get;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myMethod7();
    }


    public void myMethod1(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://www.wanandroid.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetInterface getInterface=retrofit.create(GetInterface.class);
        Call<ResponseBody> call=getInterface.get1();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d("marden",response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }



    public void myMethod2(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://www.wanandroid.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetInterface getInterface=retrofit.create(GetInterface.class);
        Call<ResponseBody> call=getInterface.get2(294);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d("marden",response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }


    public void myMethod3(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://www.wanandroid.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetInterface getInterface=retrofit.create(GetInterface.class);
        Call<ResponseBody> call=getInterface.get3(1,294);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d("marden",response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }




    public void myMethod4(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://www.wanandroid.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetInterface getInterface=retrofit.create(GetInterface.class);
        Call<MyResponse> call=getInterface.get4(1,294);
        call.enqueue(new Callback<MyResponse>() {
            @Override
            public void onResponse(Call<MyResponse> call, Response<MyResponse> response) {
                MyResponse result=response.body();
                Log.d("marden",result.toString());
            }
            @Override
            public void onFailure(Call<MyResponse> call, Throwable t) {

            }
        });
    }


    public void myMethod5(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://www.wanandroid.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetInterface getInterface=retrofit.create(GetInterface.class);
        Call<MyResponse> call=getInterface.get5("project/list/1/json?cid=294");
        call.enqueue(new Callback<MyResponse>() {
            @Override
            public void onResponse(Call<MyResponse> call, Response<MyResponse> response) {
                MyResponse result=response.body();
                Log.d("marden",result.toString());
            }
            @Override
            public void onFailure(Call<MyResponse> call, Throwable t) {

            }
        });
    }



    public void myMethod6(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://www.wanandroid.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetInterface getInterface=retrofit.create(GetInterface.class);
        Call<MyResponse> call=getInterface.get6("project/list/1/json",294);
        call.enqueue(new Callback<MyResponse>() {
            @Override
            public void onResponse(Call<MyResponse> call, Response<MyResponse> response) {
                MyResponse result=response.body();
                Log.d("marden",result.toString());
            }
            @Override
            public void onFailure(Call<MyResponse> call, Throwable t) {

            }
        });
    }



    //错误！！！
    public void myMethod7(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://www.wanandroid.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetInterface getInterface=retrofit.create(GetInterface.class);
        Call<MyResponse> call=getInterface.get7("project/list/{page}/json",1,294);
        call.enqueue(new Callback<MyResponse>() {
            @Override
            public void onResponse(Call<MyResponse> call, Response<MyResponse> response) {
                MyResponse result=response.body();
                Log.d("marden",result.toString());
            }
            @Override
            public void onFailure(Call<MyResponse> call, Throwable t) {

            }
        });
    }







}