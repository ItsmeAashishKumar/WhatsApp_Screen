package com.example.watsappscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private var userArrayList: ArrayList<User>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name= arrayListOf<String>("Arun","Nitin","Muskan","Juman","Shreyas","Anmol","Simran")
        val msg= arrayListOf<String>("Hey!!","Hi ,how u doin","Wasssup??","Done","See ya..","Great","ok")
        val ls= arrayListOf<String>("3:41 am","1:23 pm","3:0 am","2:45 am","9:10 am","2:50 am","1:20 am")
        val phone= arrayListOf<String>("993292392","965434523","9785346323","794574573","8956737423","3452346234","346425722")
        val id= arrayListOf<Int>(R.drawable.pic1,R.drawable.pic2,R.drawable.pic6,R.drawable.pic4,R.drawable.pic5,R.drawable.pic3,R.drawable.pic7)

        val list=findViewById<ListView>(R.id.ListView)
        userArrayList= ArrayList()
        for(index in name.indices){
            val user=User(name[index],msg[index],ls[index],phone[index],id[index])
            userArrayList!!.add(user)
        }

        list.adapter=MyAdapter(this, userArrayList!!)


        list.setOnItemClickListener { adapterView, view, i, l ->
            val user=name[i]
            val image=id[i]
            val no=phone[i]

            val intent= Intent(this,UserActivity::class.java)
            intent.putExtra("name",user)
            intent.putExtra("id",image)
            intent.putExtra("phone",no)
            startActivity(intent)

        }
    }
}