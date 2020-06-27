package com.example.tracking_corona.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CountryInfoModel(
    @SerializedName("flag")
    val flag: String,
    @SerializedName("_id")
    val id: Int,
    @SerializedName("iso2")
    val iso2: String,
    @SerializedName("iso3")
    val iso3: String,
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("long")
    val long: Double
): Parcelable {
}