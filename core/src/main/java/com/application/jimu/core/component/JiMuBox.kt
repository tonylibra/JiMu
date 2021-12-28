package com.application.jimu.core.component

import android.content.Context
import androidx.compose.runtime.Composable
import com.google.gson.JsonElement

abstract class JiMuBox {

    @Composable
    abstract fun content(context: Context, jsonElement: JsonElement)
}