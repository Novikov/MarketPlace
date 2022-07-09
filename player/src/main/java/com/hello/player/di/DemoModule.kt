package com.hello.player.di

import com.hello.player.Greetings
import com.hello.player.GreetingsFormatter
import org.koin.dsl.module

private var demoAppModule = module {
    single { Greetings() }
    single { GreetingsFormatter(greetings = get()) }
}

val demoModules = listOf(demoAppModule)