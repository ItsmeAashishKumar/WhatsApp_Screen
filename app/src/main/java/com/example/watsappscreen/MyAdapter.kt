package com.example.watsappscreen

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val context:Activity, private val arraylist:ArrayList<User>):ArrayAdapter<User>(context,R.layout.eachitem,arraylist) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater=LayoutInflater.from(context)
        val view=inflater.inflate(R.layout.eachitem,null)

        val image=view.findViewById<CircleImageView>(R.id.profile_image)
        val name=view.findViewById<TextView>(R.id.n)
        val msg=view.findViewById<TextView>(R.id.msg)
        val time=view.findViewById<TextView>(R.id.lst)

        name.text=arraylist[position].name
        msg.text=arraylist[position].msg
        time.text=arraylist[position].ls
        image.setImageResource(arraylist[position].ImageId)
        return view
    }
}