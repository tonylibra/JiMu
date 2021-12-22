package com.application.jimu.core.attributes

data class ImageAttributes(
    override val id: String,
    val image: Image
) : BaseAttributes()

data class Image(
    val source: String,
    val resource: String
)
