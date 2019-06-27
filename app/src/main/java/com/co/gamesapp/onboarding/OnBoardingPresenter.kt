package com.co.gamesapp.onboarding

import com.co.gamesapp.BasePresenter
import com.co.gamesapp.PreferencesManager
import com.co.gamesapp.data.source.DefaultUserRepository
import com.co.gamesapp.data.source.local.user.UserLocalDataSource

class OnBoardingPresenter(preferencesManager: PreferencesManager) : BasePresenter<OnBoardingContract.View>(),
    OnBoardingContract.Presenter {

    private val userRepository = DefaultUserRepository(UserLocalDataSource(preferencesManager))

    override fun init() {
        getView()?.showFirstScreen()
    }

    override fun setStarted() {
        userRepository.saveStart(started = true)
        getView()?.showAllGames()
    }
}