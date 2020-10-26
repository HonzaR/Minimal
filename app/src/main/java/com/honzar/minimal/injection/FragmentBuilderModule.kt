package com.honzar.minimal.injection

import com.honzar.minimal.ui.action.ActionFragment
import com.honzar.minimal.ui.action.ActionFragmentModule
import com.honzar.minimal.ui.from.FromFragment
import com.honzar.minimal.ui.from.FromFragmentModule
import com.honzar.minimal.ui.great.GreatFragment
import com.honzar.minimal.ui.great.GreatFragmentModule
import com.honzar.minimal.ui.idea.IdeaFragment
import com.honzar.minimal.ui.idea.IdeaFragmentModule
import com.honzar.minimal.ui.to.ToFragment
import com.honzar.minimal.ui.to.ToFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector(modules = [FromFragmentModule::class])
    abstract fun fromFragment(): FromFragment

    @ContributesAndroidInjector(modules = [GreatFragmentModule::class])
    abstract fun greatFragment(): GreatFragment

    @ContributesAndroidInjector(modules = [IdeaFragmentModule::class])
    abstract fun ideaFragment(): IdeaFragment

    @ContributesAndroidInjector(modules = [ToFragmentModule::class])
    abstract fun toFragment(): ToFragment

    @ContributesAndroidInjector(modules = [ActionFragmentModule::class])
    abstract fun actionFragment(): ActionFragment
}
