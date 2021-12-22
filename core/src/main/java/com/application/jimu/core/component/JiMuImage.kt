package com.application.jimu.core.component

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import com.application.jimu.core.annotation.Attributes
import com.application.jimu.core.annotation.getAttributes
import com.application.jimu.core.attributes.ImageAttributes
import com.application.jimu.core.attributes.TextAttributes
import com.application.jimu.core.resources.JiMuResource
import com.google.gson.JsonElement

@Attributes(clazz = ImageAttributes::class)
class JiMuImage : JiMuBox() {

    @Composable
    override fun content(context: Context, jsonElement: JsonElement) {
        val attributes =
            getAttributes<ImageAttributes>(
                jsonElement = jsonElement,
                clazz = this::class
            )
        Image(
            painter = painterResource(
                JiMuResource.getDrawableRes(
                    context = context,
                    resourceID = attributes.image.resource
                )
            ),
            contentDescription = "",
            colorFilter = ColorFilter.tint(Color.Black)
        )
    }
}