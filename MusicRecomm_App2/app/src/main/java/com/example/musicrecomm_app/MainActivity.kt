package com.example.musicrecomm_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class MainActivity : AppCompatActivity(),View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var androidlyButton=Button(this)
        androidlyButton.apply {
            layoutParams=LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            text="Double the value"
            setAllCaps(true)
            textSize=20f
            id=R.id.btnDouble
        }
        androidlyButton.setOnClickListener(this)
        LinearLayout.addView(androidlyButton)
        androidlyButton=Button(this)
        androidlyButton.apply {
            layoutParams=LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            text="RESET"
            setAllCaps(true)
            textSize=20f
            setTextColor(ContextCompat.getColor(this@MainActivity, R.color, colorPrimaryDark))
            id=R.id.btnReset
            setOnLongClickListener{
                txtCounter.text=O.toString()
                true
            }
        }
        androidlyButton.setOnClickListener(this)
        LinearLayout.addView(androidlyButton)

    }
    override fun onClick(V:View?){
        when(V?.id){
            R.id.btnDouble->{
                txtCounter.text =(txtCounter.text(-100).toString().toInt()*2).toString()
            }
            R.id.btnReset ->{
                txtCounter.text(-100).toString()
            }
            else->{

            }
        }
}
    fun addOne(view: View){
        txtCounter.text =(txtCounter.text(-100).toString().toInt()+1).toString()
    }
}