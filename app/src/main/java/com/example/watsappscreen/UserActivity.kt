package com.example.watsappscreen

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val name=intent.getStringExtra("name")
        val phone=intent.getStringExtra("phone")
        val image=intent.getIntExtra("id",R.drawable.pic1)

        val tname=findViewById<TextView>(R.id.Name)
        val tphone=findViewById<TextView>(R.id.contact)
        val timage=findViewById<CircleImageView>(R.id.profile_image)

        tname.text=name
        timage.setImageResource(image)
        tphone.text=phone

       val btnCall=findViewById<Button>(R.id.btn)

        val uri:String= "tel:8966737423"
        btnCall.setOnClickListener(){
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse(uri)
            startActivity(dialIntent)
        }

    }
}