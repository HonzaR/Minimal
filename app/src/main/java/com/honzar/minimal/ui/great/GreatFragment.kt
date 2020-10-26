package com.honzar.minimal.ui.great

import com.honzar.minimal.ui.base.BaseFragment
import com.honzar.minimal.R
import com.honzar.minimal.databinding.FragmentGreatBinding
import javax.inject.Inject

class GreatFragment : BaseFragment<GreatViewModel, GreatViewState, FragmentGreatBinding>(),
    GreatView {


    @Inject
    override lateinit var viewModelFactory: GreatViewModelFactory

    override val layoutResId = R.layout.fragment_great
}
