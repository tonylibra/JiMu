package com.application.jimu.core.component

import android.content.Context
import androidx.compose.runtime.Composable
import com.application.jimu.core.factory.JiMuFactory
import com.google.gson.JsonParser

object JiMuTree {

    @Composable
    fun content(context: Context, response: String): Unit {
        return JiMuFactory.createNode(context = context, JsonParser.parseString(response))
    }
}