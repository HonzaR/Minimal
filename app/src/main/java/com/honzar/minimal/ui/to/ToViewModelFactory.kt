package com.honzar.minimal.ui.to

import app.futured.arkitekt.core.factory.BaseViewModelFactory
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass

class ToViewModelFactory @Inject constructor(
    override val viewModelProvider: Provider<ToViewModel>
) : BaseViewModelFactory<ToViewModel>() {
    override val viewModelClass: KClass<ToViewModel> = ToViewModel::class
}
