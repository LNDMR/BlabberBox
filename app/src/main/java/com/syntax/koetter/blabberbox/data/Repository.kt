package com.syntax.koetter.blabberbox.data

import com.syntax.koetter.blabberbox.data.model.Contact

class Repository {

    fun loadChats(): MutableList<Contact>{
        return mutableListOf<Contact>()
    }
}