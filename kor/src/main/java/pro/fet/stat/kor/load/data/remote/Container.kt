package pro.fet.stat.kor.load.data.remote

import com.google.gson.annotations.SerializedName

data class Container(
    @SerializedName("offerLink") var offerLink: String? = null,
    @SerializedName("msg" ) var msg : String? = null
)
