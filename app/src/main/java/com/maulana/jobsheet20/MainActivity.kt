package com.maulana.jobsheet20

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<daftarsiswa>()
    val listdaftarsiswa = arrayOf(
        "Ikha nur rochayatin",
        "Ima azka rosadah",
        "Khamila nur lutfi azzahra",
        "Lailatul risa istifadhoh",
        "Luk luul latifah",
        "Maulana zahrony",
        "Maya indah lestari",
        "Muhammad khusnu marom",
        "Muhammad huda gunawan",
        "Mutmainah septiarini",
        "Nasywa sukria hanifa"
    )

    val listnis = arrayOf(
        "2998",
        "2999",
        "3001",
        "3004",
        "3006",
        "3007",
        "3009",
        "3012",
        "3014",
        "3016",
        "3018"
    )
    lateinit var daftarsiswaView: RecyclerView
    lateinit var daftarsiswaAdapter: daftarsiswaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        daftarsiswaView = findViewById(R.id.daftarView)
        daftarsiswaView.layoutManager = LinearLayoutManager(this)

        for (i in listdaftarsiswa.indices) {
            list.add(daftarsiswa(listdaftarsiswa[i], listnis[i]))
        }

        daftarsiswaAdapter = daftarsiswaAdapter(list)
        daftarsiswaAdapter.notifyDataSetChanged()
        daftarsiswaView.adapter = daftarsiswaAdapter

    }
}