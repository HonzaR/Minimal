package com.honzar.minimal.ui.idea

import com.honzar.minimal.R
import com.honzar.minimal.databinding.FragmentIdeaBinding
import com.honzar.minimal.ui.base.BaseFragment
import javax.inject.Inject

class IdeaFragment : BaseFragment<IdeaViewModel, IdeaViewState, FragmentIdeaBinding>(),
    IdeaView {


    @Inject
    override lateinit var viewModelFactory: IdeaViewModelFactory

    override val layoutResId = R.layout.fragment_idea
}
