package com.saidul.jetpacknavigationcomponentdemo.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Kazi Md. Saidul Email: Kazimdsaidul@gmail.com  Mobile: +8801675349882 on 6/29/20.
 */
@Parcelize
data class Money(val amount: Double = 0.0, val name: String = "no mame") : Parcelable