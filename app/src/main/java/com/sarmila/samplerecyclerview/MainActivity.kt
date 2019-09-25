package com.sarmila.samplerecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users = ArrayList<User>()

        users.add(User("James", "Smith", "India"))
        users.add(User("Michael", "Johnson", "UK"))
        users.add(User("Robert", "Martinez", "Romania"))
        users.add(User("David", "Smith", "Germany"))
        users.add(User("Maria", "Martinez", "USA"))
        users.add(User("Mary", "Smith", "India"))
        users.add(User("Eliza", "Johnson", "Romania"))
        users.add(User("Melinda", "Smith", "UK"))
        users.add(User("Harley", "Johnson", "Romania"))

        val linearLayoutManager = LinearLayoutManager(
            this,
            LinearLayout.VERTICAL,
            false
        )

        recycler_view.layoutManager = linearLayoutManager

        recycler_view.adapter = RecyclerViewAdapter(users)
    }

}

data class User(var firstName: String, var lastName: String, var location: String)

