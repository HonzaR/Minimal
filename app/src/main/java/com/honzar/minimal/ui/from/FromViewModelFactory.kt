package com.honzar.minimal.ui.from

import app.futured.arkitekt.core.factory.BaseViewModelFactory
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass

class FromViewModelFactory @Inject constructor(
    override val viewModelProvider: Provider<FromViewModel>
) : BaseViewModelFactory<FromViewModel>() {
    override val viewModelClass: KClass<FromViewModel> = FromViewModel::class
}
