package com.application.jimu.core.attributes

import com.google.gson.JsonArray

data class RowAttributes(
    override val id: String,
    override val children: JsonArray
) : LayoutAttributes()