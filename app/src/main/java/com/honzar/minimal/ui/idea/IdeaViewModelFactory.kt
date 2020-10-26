package com.honzar.minimal.ui.idea

import app.futured.arkitekt.core.factory.BaseViewModelFactory
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass

class IdeaViewModelFactory @Inject constructor(
    override val viewModelProvider: Provider<IdeaViewModel>
) : BaseViewModelFactory<IdeaViewModel>() {
    override val viewModelClass: KClass<IdeaViewModel> = IdeaViewModel::class
}
