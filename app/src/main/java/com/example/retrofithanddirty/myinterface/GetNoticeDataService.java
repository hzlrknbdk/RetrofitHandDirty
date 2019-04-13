package com.example.retrofithanddirty.myinterface;

import com.example.retrofithanddirty.model.NoticeList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetNoticeDataService {
    @GET("bins/1bsqcn/")
    Call<NoticeList> getNoticeData();
}
