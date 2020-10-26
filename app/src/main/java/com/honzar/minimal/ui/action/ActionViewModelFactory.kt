package com.honzar.minimal.ui.action

import app.futured.arkitekt.core.factory.BaseViewModelFactory
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass

class ActionViewModelFactory @Inject constructor(
    override val viewModelProvider: Provider<ActionViewModel>
) : BaseViewModelFactory<ActionViewModel>() {
    override val viewModelClass: KClass<ActionViewModel> = ActionViewModel::class
}
