package com.application.jimu.core.attributes

import com.google.gson.JsonArray

abstract class LayoutAttributes : BaseAttributes() {
    abstract val children: JsonArray
}