package com.co.gamesapp.onboarding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.co.gamesapp.R
import kotlinx.android.synthetic.main.fragment_onboarding_first_step.*

class SecondStepFragment : OnBoardingStepFragment() {

    companion object {
        fun newInstance(step: IStepFactory.StepType): SecondStepFragment {
            val arguments = Bundle()
            arguments.putParcelable(STEP_TAG, step)
            val fragment = SecondStepFragment()
            fragment.arguments = arguments
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_onboarding_second_step, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_submit.setOnClickListener {
            submit()
        }
    }

}