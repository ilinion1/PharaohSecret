package pro.fet.stat.kor.game.adapt

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import pro.fet.stat.kor.R

class GameAdapter: RecyclerView.Adapter<GameViewHolder>() {


    var listGame = arrayListOf<Int>()
        set(value) {
            val call = GameUtil(listGame, value)
            val result = DiffUtil.calculateDiff(call)
            result.dispatchUpdatesTo(this)
            field = value
        }

    var gameItemClickListener: ((Int) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.game_item, parent, false)
        return GameViewHolder((view))

    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        holder.imGame.setImageResource(listGame[position])
        holder.itemView.setOnClickListener {
            gameItemClickListener?.invoke(position)
        }
    }

    override fun getItemCount(): Int {
        return listGame.size
    }
}