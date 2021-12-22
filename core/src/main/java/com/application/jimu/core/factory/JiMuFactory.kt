package com.application.jimu.core.factory

import android.content.Context
import androidx.compose.runtime.Composable
import com.application.jimu.core.attributes.BaseAttributeMapper
import com.application.jimu.core.component.JiMuColumn
import com.application.jimu.core.component.JiMuImage
import com.application.jimu.core.component.JiMuRow
import com.application.jimu.core.component.JiMuText
import com.application.jimu.core.type.Type
import com.google.gson.JsonElement

object JiMuFactory {

    @Composable
    fun createNode(context: Context, jsonElement: JsonElement) {
        return when (BaseAttributeMapper.getTypeAttribute(jsonElement = jsonElement)) {
            Type.ROW -> JiMuRow().content(context = context, jsonElement = jsonElement)
            Type.COLUMN -> JiMuColumn().content(context = context, jsonElement = jsonElement)
            Type.IMAGE -> JiMuImage().content(context = context, jsonElement = jsonElement)
            Type.TEXT -> JiMuText().content(context = context, jsonElement = jsonElement)
            else -> {}
        }
    }
}