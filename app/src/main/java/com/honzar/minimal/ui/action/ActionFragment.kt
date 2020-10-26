package com.honzar.minimal.ui.action

import com.honzar.minimal.R
import com.honzar.minimal.databinding.FragmentActionBinding
import com.honzar.minimal.ui.base.BaseFragment
import javax.inject.Inject

class ActionFragment : BaseFragment<ActionViewModel, ActionViewState, FragmentActionBinding>(), ActionView {


    @Inject
    override lateinit var viewModelFactory: ActionViewModelFactory

    override val layoutResId = R.layout.fragment_action
}
