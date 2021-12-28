package com.application.jimu.core.component

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import com.application.jimu.core.annotation.Attributes
import com.application.jimu.core.annotation.getAttributes
import com.application.jimu.core.attributes.RowAttributes
import com.application.jimu.core.factory.JiMuFactory
import com.google.gson.JsonElement

@Attributes(clazz = RowAttributes::class)
class JiMuRow : JiMuBox() {

    @Composable
    override fun content(context: Context, jsonElement: JsonElement) {
        val attributes =
            getAttributes<RowAttributes>(
                jsonElement = jsonElement,
                clazz = this::class
            )
        attributes.children.let { jsonArray ->
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                jsonArray.map { jsonElement ->
                    JiMuFactory.createNode(
                        context = context,
                        jsonElement = jsonElement
                    )
                }
            }
        }

    }
}