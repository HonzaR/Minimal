package com.honzar.minimal.ui.to

import app.futured.arkitekt.rxusecases.BaseRxViewModel
import javax.inject.Inject

class ToViewModel @Inject constructor(
    override val viewState: ToViewState
) : BaseRxViewModel<ToViewState>()

