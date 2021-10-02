package com.trungdang.appchat.fragment;

import com.trungdang.appchat.Notification.MyResponse;
import com.trungdang.appchat.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                  "Content-Type:application/json",
                    "Authorization:key=AAAA1Jvc2NQ:APA91bFLPtz1QEynb5SBQ3WHeGkrA_B9J2EnEx5x2ly68owdiakBuYI3gdUjouo5BtQ28pFiYBzCBbpHLLjauTvQhIbBzwlvKP3oAQ-vyeK1BUzQh4RxvVsizNNPe-rNSd-Ni3RaS0Lm"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
