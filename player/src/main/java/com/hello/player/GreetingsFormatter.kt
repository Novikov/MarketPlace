package com.hello.player

import com.hello.player.DataConsumer.greetings

class GreetingsFormatter(greetings: Greetings) {

    fun sayHiWithName() = "Hi, ${greetings.name}"
}
