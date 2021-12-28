package com.application.jimu.core.attributes

import com.application.jimu.core.type.Type
import com.google.gson.Gson
import com.google.gson.JsonElement

const val ID = "id"
object BaseAttributeMapper {

    fun getTypeAttribute(jsonElement: JsonElement): Type {
        if (!jsonElement.isJsonObject) {
            return Type.NOT_SUPPORT
        }
        if (!jsonElement.asJsonObject.has(ID)) {
            return Type.NOT_SUPPORT
        }
        return Gson().fromJson(jsonElement.asJsonObject.get(ID), Type::class.java);
    }

}