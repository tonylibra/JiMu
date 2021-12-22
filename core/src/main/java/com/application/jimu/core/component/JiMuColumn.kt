package com.application.jimu.core.component

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.application.jimu.core.annotation.Attributes
import com.application.jimu.core.annotation.getAttributes
import com.application.jimu.core.attributes.ColumnAttributes
import com.application.jimu.core.factory.JiMuFactory
import com.google.gson.JsonElement

@Attributes(clazz = ColumnAttributes::class)
class JiMuColumn : JiMuBox() {

    @Composable
    override fun content(context: Context, jsonElement: JsonElement) {
        val attributes =
            getAttributes<ColumnAttributes>(
                jsonElement = jsonElement,
                clazz = this::class
            )

        attributes.children.let { jsonArray ->
            Column(
                modifier = Modifier.wrapContentHeight(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
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