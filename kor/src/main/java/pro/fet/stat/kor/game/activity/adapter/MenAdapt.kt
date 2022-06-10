package pro.fet.stat.kor.game.activity.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import pro.fet.stat.kor.game.fragments.FirstFragment
import pro.fet.stat.kor.game.fragments.SecFragment
import pro.fet.stat.kor.game.fragments.ThirdFragment

class MenAdapt(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {
                FirstFragment()
            }
            1 -> {
                SecFragment()
            }
            else -> {
                ThirdFragment()
            }
        }
    }
}