package com.hello.player.di

import org.koin.core.Koin
import org.koin.core.component.KoinComponent

interface DemoSdkComponent: KoinComponent {

    override fun getKoin(): Koin {
        return DemoSdkApplication.koin
    }
}