package me.devoxin.flight

import net.dv8tion.jda.core.entities.Message

interface PrefixProvider {

    fun provide(message: Message): List<String>

}
