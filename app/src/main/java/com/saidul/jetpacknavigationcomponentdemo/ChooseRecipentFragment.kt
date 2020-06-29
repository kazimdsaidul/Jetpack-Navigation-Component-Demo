package com.saidul.jetpacknavigationcomponentdemo

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import kotlinx.android.synthetic.main.fragment_choose_recipent.*
import kotlinx.android.synthetic.main.fragment_choose_recipent.view.*


class ChooseRecipentFragment : BaseFragment() {
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choose_recipent, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.next_btn.setOnClickListener {

            val input = input_recipient.text?.toString()
            if (!TextUtils.isEmpty(input)) {
                val bundle = bundleOf("recipient" to input)
                navController.navigate(
                    R.id.action_chooseRecipentFragment_to_specipfyAmountFragment2,
                    bundle
                )

            } else {
                Toast.makeText(context, "Please input a recipient name", Toast.LENGTH_LONG).show()
            }
        }
        view.cancel_btn.setOnClickListener {
            activity?.onBackPressed()
        }
    }


}