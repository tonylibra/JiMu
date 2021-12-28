package com.application.jimu.core.component

import android.content.Context
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.application.jimu.core.annotation.Attributes
import com.application.jimu.core.annotation.getAttributes
import com.application.jimu.core.attributes.TextAttributes
import com.google.gson.JsonElement


@Attributes(clazz = TextAttributes::class)
class JiMuText : JiMuBox() {

    @Composable
    override fun content(context: Context, jsonElement: JsonElement) {
        val attributes =
            getAttributes<TextAttributes>(
                jsonElement = jsonElement,
                clazz = this::class
            )
        val text = attributes.text
        Text(text = text)
    }
}