package com.emericoapp.upload.network;

import com.emericoapp.upload.model.ApiModel;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ServiceInterface {

    @Multipart
    @POST(ApiConstants.ENDPOINT+"NewsFeed/uploadImage")
    Call<ApiModel> uploadNewsFeedImages(@Part List<MultipartBody.Part> files);
}
