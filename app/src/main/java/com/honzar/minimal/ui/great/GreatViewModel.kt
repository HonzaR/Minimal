package com.honzar.minimal.ui.great

import app.futured.arkitekt.rxusecases.BaseRxViewModel
import javax.inject.Inject

class GreatViewModel @Inject constructor(
    override val viewState: GreatViewState
) : BaseRxViewModel<GreatViewState>()

