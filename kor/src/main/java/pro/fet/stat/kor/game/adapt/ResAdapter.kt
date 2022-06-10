package pro.fet.stat.kor.game.adapt

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import pro.fet.stat.kor.R

class ResAdapter: RecyclerView.Adapter<ResViewHolder>() {

    var listBalls = listOf<Int>()
    set(value) {
        val call = ResDiffUtil(listBalls, value)
        val result = DiffUtil.calculateDiff(call)
        result.dispatchUpdatesTo(this)
        field = value
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.result_item, parent, false)
        return ResViewHolder((view))

    }

    override fun onBindViewHolder(holder: ResViewHolder, position: Int) {
        holder.tvBal.text = listBalls[position].toString()
    }

    override fun getItemCount(): Int {
        return listBalls.size
    }
}