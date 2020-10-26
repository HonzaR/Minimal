package com.honzar.minimal.ui.base

import androidx.databinding.ViewDataBinding
import app.futured.arkitekt.core.BaseViewModel
import app.futured.arkitekt.core.ViewState
import app.futured.arkitekt.dagger.fragment.bottomsheet.BaseDaggerBindingBottomSheetDialogFragment
import com.honzar.minimal.BR

abstract class BaseBottomSheetDialogFragment<VM : BaseViewModel<VS>, VS : ViewState, B : ViewDataBinding> :
    BaseDaggerBindingBottomSheetDialogFragment<VM, VS, B>() {

    override val brViewModelVariableId = BR.viewModel
    override val brViewStateVariableId = BR.viewState
    override val brViewVariableId = BR.view
}
