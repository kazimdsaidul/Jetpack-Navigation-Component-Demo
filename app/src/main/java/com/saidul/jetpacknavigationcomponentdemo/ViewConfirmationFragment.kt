package com.saidul.jetpacknavigationcomponentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saidul.jetpacknavigationcomponentdemo.model.Money
import kotlinx.android.synthetic.main.fragment_view_confirmation.view.*

/**
 * An example full-screen fragment that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class ViewConfirmationFragment : BaseFragment() {
    lateinit var money: Money

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_view_confirmation, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        money = arguments?.getParcelable("money")!!
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.fullscreen_content.text = "" + money.name

        view.dummy_button.setOnClickListener {

            navController.navigate(R.id.action_viewConfirmationFragment_to_mainFragment)
        }
    }

}