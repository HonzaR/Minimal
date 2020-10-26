package com.honzar.minimal.ui.action

import app.futured.arkitekt.rxusecases.BaseRxViewModel
import javax.inject.Inject

class ActionViewModel @Inject constructor(
    override val viewState: ActionViewState
) : BaseRxViewModel<ActionViewState>()

