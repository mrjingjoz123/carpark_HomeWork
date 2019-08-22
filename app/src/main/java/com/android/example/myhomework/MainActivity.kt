package com.android.example.myhomework

import android.app.Activity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.android.example.myhomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private  val carSlot1 :Input = Input("","","")
    private  val carSlot2 :Input = Input("","","")
    private  val carSlot3 :Input = Input("","","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.apply {
            slot1Button.setOnClickListener{ show(it,1) }
            slot2Button.setOnClickListener{ show(it,2) }
            slot3Button.setOnClickListener{ show(it, 3)}
            updateButton.setOnClickListener{ update(it,0) }
            deleteButton.setOnClickListener{ delete(it ,0) }
            editText.visibility = View.GONE
            editText2.visibility = View.GONE
            editText3.visibility = View.GONE
            updateButton.visibility = View.GONE
            deleteButton.visibility = View.GONE

        }
    }

    private  fun  show(view: View, select: Int){
        binding.apply {
            if(select == 1){
                slot1Button.setBackgroundColor(Color.parseColor("#696799"))
                slot2Button.setBackgroundColor(Color.parseColor("#ff80ff"))
                slot3Button.setBackgroundColor(Color.parseColor("#ff80ff"))


                    editText.setText(carSlot1.license)
                    editText2.setText(carSlot1.name)
                    editText3.setText(carSlot1.phone)
                updateButton.setOnClickListener{ update(it,1) }
                deleteButton.setOnClickListener{ delete(it ,1) }
            }
            if(select == 2){
                slot2Button.setBackgroundColor(Color.parseColor("#696799"))
                slot1Button.setBackgroundColor(Color.parseColor("#ff80ff"))
                slot3Button.setBackgroundColor(Color.parseColor("#ff80ff"))


                editText.setText(carSlot2.license)
                editText2.setText(carSlot2.name)
                editText3.setText(carSlot2.phone)
                updateButton.setOnClickListener{ update(it,2) }
                deleteButton.setOnClickListener{ delete(it ,2) }

            }
            if(select == 3){
                slot3Button.setBackgroundColor(Color.parseColor("#696799"))
                slot2Button.setBackgroundColor(Color.parseColor("#ff80ff"))
                slot1Button.setBackgroundColor(Color.parseColor("#ff80ff"))

                editText.setText(carSlot3.license)
                editText2.setText(carSlot3.name)
                editText3.setText(carSlot3.phone)
                updateButton.setOnClickListener{ update(it,3) }
                deleteButton.setOnClickListener{ delete(it ,3) }

            }

            editText.visibility = View.VISIBLE
            editText2.visibility = View.VISIBLE
            editText3.visibility = View.VISIBLE
            updateButton.visibility = View.VISIBLE
            deleteButton.visibility = View.VISIBLE

//            carSlot1.name = editText.text.toString()
//
//            editText.setText(carSlot1.name)

        }

    }
    private fun update(view: View,select: Int){
        binding.apply {
            if(select == 1){
                carSlot1.license = editText.text.toString()
                carSlot1.name = editText2.text.toString()
                carSlot1.phone = editText3.text.toString()

                editText.setText(carSlot1.license)
                editText2.setText(carSlot1.name)
                editText3.setText(carSlot1.phone)

                slot1Button.setText("Full").toString()

            }
            if(select == 2){
                carSlot2.license = editText.text.toString()
                carSlot2.name = editText2.text.toString()
                carSlot2.phone = editText3.text.toString()

                editText.setText(carSlot2.license)
                editText2.setText(carSlot2.name)
                editText3.setText(carSlot2.phone)

                slot2Button.setText("Full").toString()

            }
            if(select == 3){
                carSlot3.license = editText.text.toString()
                carSlot3.name = editText2.text.toString()
                carSlot3.phone = editText3.text.toString()

                editText.setText(carSlot3.license)
                editText2.setText(carSlot3.name)
                editText3.setText(carSlot3.phone)

                slot3Button.setText("Full").toString()

            }
        }

    }

    private fun delete(view: View,select: Int){
        binding.apply {
            if(select == 1){
                carSlot1.license = ""
                carSlot1.name = ""
                carSlot1.phone = ""

                editText.setText(carSlot1.license)
                editText2.setText(carSlot1.name)
                editText3.setText(carSlot1.phone)

                slot1Button.setText("Slot1").toString()

            }
            if(select == 2){
                carSlot2.license = ""
                carSlot2.name = ""
                carSlot2.phone = ""

                editText.setText(carSlot2.license)
                editText2.setText(carSlot2.name)
                editText3.setText(carSlot2.phone)

                slot2Button.setText("Slot2").toString()

            }
            if(select == 3){
                carSlot3.license = ""
                carSlot3.name = ""
                carSlot3.phone = ""

                editText.setText(carSlot3.license)
                editText2.setText(carSlot3.name)
                editText3.setText(carSlot3.phone)

                slot3Button.setText("Slot3").toString()

            }
        }

    }
}
