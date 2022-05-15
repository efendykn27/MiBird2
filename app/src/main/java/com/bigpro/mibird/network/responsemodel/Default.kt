package com.bigpro.mibird.network.responsemodel
import com.google.gson.annotations.SerializedName

data class Default (

    @SerializedName("Nama_Burung")
    var nm_brg:String?,
    @SerializedName("Nama_Ilmiah")
    var nm_ilm:String?,
    @SerializedName("Spesies")
    var spesies:String?,
    @SerializedName("Makanan")
    var makan:String?,
    @SerializedName("Status")
    var status:String?,
    @SerializedName("Message")
    var message:String?

)