package com.honzar.minimal.ui.from

import app.futured.arkitekt.rxusecases.BaseRxViewModel
import javax.inject.Inject

class FromViewModel @Inject constructor(
    override val viewState: FromViewState
) : BaseRxViewModel<FromViewState>()

