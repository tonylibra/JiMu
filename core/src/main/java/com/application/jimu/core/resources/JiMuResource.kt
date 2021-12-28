package com.application.jimu.core.resources

import android.content.Context

object JiMuResource {

    fun getDrawableRes(resourceID: String, context: Context): Int {
        return context.resources.getIdentifier(resourceID, "drawable", context.packageName)
    }
}