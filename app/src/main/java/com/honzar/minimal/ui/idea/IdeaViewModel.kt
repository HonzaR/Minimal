package com.honzar.minimal.ui.idea

import app.futured.arkitekt.rxusecases.BaseRxViewModel
import javax.inject.Inject

class IdeaViewModel @Inject constructor(
    override val viewState: IdeaViewState
) : BaseRxViewModel<IdeaViewState>()

