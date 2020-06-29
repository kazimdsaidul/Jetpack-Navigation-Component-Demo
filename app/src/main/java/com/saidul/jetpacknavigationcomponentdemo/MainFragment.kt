package com.saidul.jetpacknavigationcomponentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.view_transactions_btn.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_viewTranstionsFragment)

        }
        view.send_money_btn.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_chooseRecipentFragment2)
        }

        view.view_balance_btn.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_viewBalanceFragment)
        }


    }


}