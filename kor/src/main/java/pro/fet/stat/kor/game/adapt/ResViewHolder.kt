package pro.fet.stat.kor.game.adapt

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pro.fet.stat.kor.R

class ResViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val tvBal = view.findViewById<TextView>(R.id.tvBals)
}