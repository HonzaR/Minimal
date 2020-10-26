package com.honzar.minimal.ui.base

import androidx.databinding.ViewDataBinding
import app.futured.arkitekt.core.BaseViewModel
import app.futured.arkitekt.core.ViewState
import app.futured.arkitekt.dagger.fragment.BaseDaggerBindingFragment
import com.honzar.minimal.BR

abstract class BaseFragment<VM : BaseViewModel<VS>, VS : ViewState, B : ViewDataBinding> :
    BaseDaggerBindingFragment<VM, VS, B>() {

    override val brViewVariableId = BR.view
    override val brViewModelVariableId = BR.viewModel
    override val brViewStateVariableId = BR.viewState
}
