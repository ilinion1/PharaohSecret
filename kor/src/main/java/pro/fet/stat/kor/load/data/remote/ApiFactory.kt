package pro.fet.stat.kor.load.data.remote

import android.content.Context
import android.webkit.WebView
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

object ApiFactory{

    private val BASE_URL = "http://pharaohssecret.xyz/"

    fun create(context: Context): ApiService {
        val userAgent = WebView(context).settings.userAgentString

        val client = OkHttpClient.Builder().addInterceptor {
            val request = it.request().newBuilder()
                .header("User-Agent", userAgent)
                .build()
            it.proceed(request)
        }.build()

        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .client(client)
            .build()
        return retrofit.create(ApiService::class.java)

    }

    interface ApiService {

        @GET("PharaSecret2.php")
        suspend fun setDataServer(
            @Query("3dp4oI6dwI") google_adid: String,
            @Query("48aygmBY1K") af_userid: String,
            @Query("FjHGTUF3gp") fb_deepLink: String,
            @Query("jKfriU9UiL") tmz: String,
            @Query("gbL3j1ZKoR") adb: String,
            @Query("redirect_response_data") redirect_response_data: String,
            @Query("adgroup_id") adgroup_id: String,
            @Query("engmnt_source") engmnt_source: String,
            @Query("retargeting_conversion_type") retargeting_conversion_type: String,
            @Query("is_incentivized") is_incentivized: String,
            @Query("orig_cost") orig_cost: String,
            @Query("is_first_launch") is_first_launch: String,
            @Query("af_click_lookback") af_click_lookback: String,
            @Query("af_cpi") af_cpi: String,
            @Query("iscache") iscache: String,
            @Query("click_time") click_time: String,
            @Query("is_branded_link") is_branded_link: String,
            @Query("match_type") match_type: String,
            @Query("adset") adset: String,
            @Query("MQyayHJ5zX") af_channel: String,
            @Query("campaign_id") campaign_id: String,
            @Query("install_time") install_time: String,
            @Query("lu9QXOf1Lq") media_source: String,
            @Query("agency") agency: String,
            @Query("af_siteid") af_siteid: String,
            @Query("af_status") af_status: String,
            @Query("af_sub1") af_sub1: String,
            @Query("cost_cents_USD") cost_cents_USD: String,
            @Query("af_sub5") af_sub5: String,
            @Query("af_sub4") af_sub4: String,
            @Query("af_sub3") af_sub3: String,
            @Query("af_sub2") af_sub2: String,
            @Query("adset_id") adset_id: String,
            @Query("esp_name") esp_name: String,
            @Query("1mXfYrGj7y") campaign: String,
            @Query("http_referrer") http_referrer: String,
            @Query("is_universal_link") is_universal_link: String,
            @Query("is_retargeting") is_retargeting: String,
            @Query("adgroup") adgroup: String
        ): Container
    }
}