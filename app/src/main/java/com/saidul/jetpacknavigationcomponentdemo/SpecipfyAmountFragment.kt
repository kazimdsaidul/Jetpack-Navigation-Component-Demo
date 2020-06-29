package com.saidul.jetpacknavigationcomponentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.saidul.jetpacknavigationcomponentdemo.model.Money
import kotlinx.android.synthetic.main.fragment_specipfy_amount.view.*


class SpecipfyAmountFragment : BaseFragment() {

    lateinit var recipient: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recipient = arguments?.getString("recipient").toString()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specipfy_amount, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val messsage = "sending money to recipient name : ${recipient}"
        view.recipient.text = messsage



        view.send_btn.setOnClickListener {
            val amount = view.input_amount.text.toString()

            val money = Money(amount = amount.toDouble(), name = recipient)
            val bundle = bundleOf("money" to money)

            navController.navigate(
                R.id.action_specipfyAmountFragment_to_viewConfirmationFragment,
                bundle
            )
        }
        view.cancel_btn.setOnClickListener {
            activity?.onBackPressed()
        }
    }


}