package com.honzar.minimal.ui.to

import com.honzar.minimal.R
import com.honzar.minimal.databinding.FragmentToBinding
import com.honzar.minimal.ui.base.BaseFragment
import javax.inject.Inject

class ToFragment : BaseFragment<ToViewModel, ToViewState, FragmentToBinding>(), ToView {


    @Inject
    override lateinit var viewModelFactory: ToViewModelFactory

    override val layoutResId = R.layout.fragment_to
}
