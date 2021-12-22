package com.application.jimu.core.annotation

import com.google.gson.Gson
import com.google.gson.JsonElement
import kotlin.reflect.KClass


inline fun <reified T> getAttributes(jsonElement: JsonElement, clazz: KClass<*>): T {
    val annotation = clazz.annotations.find { it is Attributes }
    val annotationClazz = (annotation as? Attributes)?.clazz
    val attributes = annotationClazz ?: throw IllegalArgumentException()
    val result = Gson().fromJson(jsonElement, attributes.javaObjectType)
    if (result !is T) {
        throw TypeCastException()
    }
    return result
}