package com.example.dialogfragmant_demo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_fragment.*
import kotlinx.android.synthetic.main.dialog_fragment.view.*

@Suppress("UNREACHABLE_CODE")
class DialogFragment: DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootview = inflater.inflate(R.layout.dialog_fragment,container,false)

        rootview.btncancle.setOnClickListener {
            dismiss()
        }

        rootview.btnok.setOnClickListener {

            var selectId = radioGroup2.checkedRadioButtonId
            var radio = rootview.findViewById<RadioButton>(selectId)

            var result = radio.text.toString()

            Toast.makeText(context,"You rated: $result",Toast.LENGTH_SHORT).show()
            dismiss()
        }

        return rootview

    }
}