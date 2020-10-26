package com.honzar.minimal.ui.from

import com.honzar.minimal.ui.base.BaseFragment
import com.honzar.minimal.databinding.FragmentFromBinding
import com.honzar.minimal.R
import javax.inject.Inject

class FromFragment : BaseFragment<FromViewModel, FromViewState, FragmentFromBinding>(),
    FromView {


    @Inject
    override lateinit var viewModelFactory: FromViewModelFactory

    override val layoutResId = R.layout.fragment_from
}
