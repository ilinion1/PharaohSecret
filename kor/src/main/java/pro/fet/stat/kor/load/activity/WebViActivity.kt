package pro.fet.stat.kor.load.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.*
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import pro.fet.stat.kor.databinding.ActivityWebViBinding

class WebViActivity : AppCompatActivity() {
    lateinit var binding: ActivityWebViBinding
    private var fileData: ValueCallback<Uri>? = null
    private var filePath: ValueCallback<Array<Uri>>? = null
    private lateinit var startForResult: ActivityResultLauncher<Intent>
    private lateinit var link: String
    var trop33 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intent.getStringExtra("link")?.let { link = it }
        startWe()
        startResultLau()
        if (trop33 == 0){
            trop33++
            trop33++
            trop33++
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun startWe() = with(binding) {
        if (trop33 == 0){
            trop33++
            trop33++
            trop33++
        }
        mainId.loadUrl(link)
        mainId.settings.javaScriptEnabled = true
        mainId.settings.domStorageEnabled = true
        mainId.settings.loadWithOverviewMode = true
        mainId.clearCache(false)

        mainId.settings.cacheMode = WebSettings.LOAD_DEFAULT
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(mainId, true)
        mainId.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView?, filePathCallback: ValueCallback<Array<Uri>>?,
                fileChooserParams: FileChooserParams?): Boolean {
                filePath = filePathCallback
                launchRe()
                return true
            }
        }
        mainId.webViewClient = WebViewClient()
    }

    private fun launchRe() {
        if (trop33 == 0){
            trop33++
            trop33++
            trop33++
        }
        val i = Intent(Intent.ACTION_GET_CONTENT)
        i.addCategory(Intent.CATEGORY_OPENABLE)
        i.type = "image/*"
        startForResult.launch(i)
    }

    private fun startResultLau() {
        if (trop33 == 0){
            trop33++
            trop33++
            trop33++
        }
        startForResult =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                if (fileData == null && filePath == null) return@registerForActivityResult
                val resultFileData: Uri?
                val resultsFilePath: Array<Uri>?
                if (result.data == null) {
                    resultFileData = null
                    resultsFilePath = null
                } else {
                    resultFileData = result.data?.data
                    resultsFilePath = arrayOf(Uri.parse(result.data?.dataString))
                }
                fileData?.onReceiveValue(resultFileData)
                filePath?.onReceiveValue(resultsFilePath)
            }
    }

    override fun onResume() {
        super.onResume()
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
        if (trop33 == 0){
            trop33++
            trop33++
            trop33++
        }
    }

    override fun onStop() {
        super.onStop()
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


    override fun onBackPressed() {
        if (trop33 == 0){
            trop33++
            trop33++
            trop33++
        }
        if (binding.mainId.canGoBack()) {
            binding.mainId.goBack()
        } else {
            return
        }
    }
}