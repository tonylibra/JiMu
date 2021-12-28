package com.application.jimu.core.attributes

import com.google.gson.JsonArray

internal data class ColumnAttributes(
    override val id: String,
    override val children: JsonArray
) : LayoutAttributes()