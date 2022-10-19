package com.maulana.jobsheet20

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class daftarsiswaAdapter (private val list:ArrayList<daftarsiswa>): RecyclerView.Adapter<daftarsiswaAdapter.daftarsiswaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, ViewType: Int):daftarsiswaViewHolder {
        return daftarsiswaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false))
    }

    override fun onBindViewHolder(holder: daftarsiswaViewHolder, position: Int) {
        holder.bind(list[position])
    }
    override fun getItemCount(): Int {
        return list.size
    }
    class daftarsiswaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.textdaftar)
        private val nis = itemView.findViewById<TextView>(R.id.textnis)
        fun bind(get: daftarsiswa) {
            nama.text = get.nama
            nis.text = get.nis
        }
    }
}
