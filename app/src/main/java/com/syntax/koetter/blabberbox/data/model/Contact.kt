package com.syntax.koetter.blabberbox.data.model

data class Contact(
    val id: Int,
    val fullName: String,
    val chatHistory: MutableList<Message>
)
