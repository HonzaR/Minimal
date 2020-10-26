package com.honzar.minimal.ui.great

import app.futured.arkitekt.core.factory.BaseViewModelFactory
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass

class GreatViewModelFactory @Inject constructor(
    override val viewModelProvider: Provider<GreatViewModel>
) : BaseViewModelFactory<GreatViewModel>() {
    override val viewModelClass: KClass<GreatViewModel> = GreatViewModel::class
}
