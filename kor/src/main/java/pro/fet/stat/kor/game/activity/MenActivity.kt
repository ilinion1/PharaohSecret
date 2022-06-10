package pro.fet.stat.kor.game.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import pro.fet.stat.kor.R
import pro.fet.stat.kor.databinding.ActivityMainBinding
import pro.fet.stat.kor.databinding.ActivityMenBinding
import pro.fet.stat.kor.game.activity.adapter.MenAdapt

class MenActivity : AppCompatActivity() {
    lateinit var binding: ActivityMenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setTabLayoutMediator()
        setV()
    }

    private fun setV(){
        binding.v.alpha = 1f
        binding.v1.alpha = 1f
        binding.v3.alpha = 1f
        binding.v4.alpha = 1f
        binding.v5.alpha = 1f
        binding.v6.alpha = 1f
        binding.v7.alpha = 1f
        binding.v8.alpha = 1f
        binding.v9.alpha = 1f
        binding.v10.alpha = 1f
        binding.v.visibility = View.INVISIBLE
        binding.v1.visibility = View.INVISIBLE
        binding.v2.visibility = View.INVISIBLE
        binding.v3.visibility = View.INVISIBLE
        binding.v4.visibility = View.INVISIBLE
        binding.v5.visibility = View.INVISIBLE
        binding.v6.visibility = View.INVISIBLE
        binding.v7.visibility = View.INVISIBLE
        binding.v8.visibility = View.INVISIBLE
        binding.v9.visibility = View.INVISIBLE
    }

    private fun setTabLayoutMediator(){
        binding.tabLayoutId.tabIconTint = null
        binding.viewPagId.adapter = MenAdapt(this)
        TabLayoutMediator(binding.tabLayoutId, binding.viewPagId){ tab, pos ->
            when(pos){
                0->{
                    tab.setIcon(R.drawable.ic_gam)
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.blue))
                }
                1->{
                    tab.setIcon(R.drawable.ic_baseline_electric_rickshaw_24)
                    tab.icon?.setTint(ContextCompat.getColor(this@MenActivity, R.color.black))
                }
                else->{
                    tab.setIcon(R.drawable.ic_set)
                    tab.icon?.setTint(ContextCompat.getColor(this@MenActivity, R.color.black))
                }
            }
        }.attach()

        binding.tabLayoutId.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.icon?.setTint(ContextCompat.getColor(this@MenActivity, R.color.blue))
                binding.v.alpha = 1f
                binding.v1.alpha = 1f
                binding.v3.alpha = 1f
                binding.v4.alpha = 1f
                binding.v5.alpha = 1f
                binding.v6.alpha = 1f
                binding.v7.alpha = 1f
                binding.v8.alpha = 1f
                binding.v9.alpha = 1f
                binding.v10.alpha = 1f
                binding.v.visibility = View.INVISIBLE
                binding.v1.visibility = View.INVISIBLE
                binding.v2.visibility = View.INVISIBLE
                binding.v3.visibility = View.INVISIBLE
                binding.v4.visibility = View.INVISIBLE
                binding.v5.visibility = View.INVISIBLE
                binding.v6.visibility = View.INVISIBLE
                binding.v7.visibility = View.INVISIBLE
                binding.v8.visibility = View.INVISIBLE
                binding.v9.visibility = View.INVISIBLE
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                tab?.icon?.setTint(ContextCompat.getColor(this@MenActivity, R.color.black))
                binding.v.alpha = 1f
                binding.v1.alpha = 1f
                binding.v3.alpha = 1f
                binding.v4.alpha = 1f
                binding.v5.alpha = 1f
                binding.v6.alpha = 1f
                binding.v7.alpha = 1f
                binding.v8.alpha = 1f
                binding.v9.alpha = 1f
                binding.v10.alpha = 1f
                binding.v.visibility = View.INVISIBLE
                binding.v1.visibility = View.INVISIBLE
                binding.v2.visibility = View.INVISIBLE
                binding.v3.visibility = View.INVISIBLE
                binding.v4.visibility = View.INVISIBLE
                binding.v5.visibility = View.INVISIBLE
                binding.v6.visibility = View.INVISIBLE
                binding.v7.visibility = View.INVISIBLE
                binding.v8.visibility = View.INVISIBLE
                binding.v9.visibility = View.INVISIBLE
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                binding.v.alpha = 1f
                binding.v1.alpha = 1f
                binding.v3.alpha = 1f
                binding.v4.alpha = 1f
                binding.v5.alpha = 1f
                binding.v6.alpha = 1f
                binding.v7.alpha = 1f
                binding.v8.alpha = 1f
                binding.v9.alpha = 1f
                binding.v10.alpha = 1f
                binding.v.visibility = View.INVISIBLE
                binding.v1.visibility = View.INVISIBLE
                binding.v2.visibility = View.INVISIBLE
                binding.v3.visibility = View.INVISIBLE
                binding.v4.visibility = View.INVISIBLE
                binding.v5.visibility = View.INVISIBLE
                binding.v6.visibility = View.INVISIBLE
                binding.v7.visibility = View.INVISIBLE
                binding.v8.visibility = View.INVISIBLE
                binding.v9.visibility = View.INVISIBLE
            }
        })
    }

    override fun onResume() {
        super.onResume()
        binding.v.alpha = 1f
        binding.v1.alpha = 1f
        binding.v3.alpha = 1f
        binding.v4.alpha = 1f
        binding.v5.alpha = 1f
        binding.v6.alpha = 1f
        binding.v7.alpha = 1f
        binding.v8.alpha = 1f
        binding.v9.alpha = 1f
        binding.v10.alpha = 1f
        binding.v.visibility = View.INVISIBLE
        binding.v1.visibility = View.INVISIBLE
        binding.v2.visibility = View.INVISIBLE
        binding.v3.visibility = View.INVISIBLE
        binding.v4.visibility = View.INVISIBLE
        binding.v5.visibility = View.INVISIBLE
        binding.v6.visibility = View.INVISIBLE
        binding.v7.visibility = View.INVISIBLE
        binding.v8.visibility = View.INVISIBLE
        binding.v9.visibility = View.INVISIBLE
    }

    override fun onStart() {
        super.onStart()
        binding.v.alpha = 1f
        binding.v1.alpha = 1f
        binding.v3.alpha = 1f
        binding.v4.alpha = 1f
        binding.v5.alpha = 1f
        binding.v6.alpha = 1f
        binding.v7.alpha = 1f
        binding.v8.alpha = 1f
        binding.v9.alpha = 1f
        binding.v10.alpha = 1f
        binding.v.visibility = View.INVISIBLE
        binding.v1.visibility = View.INVISIBLE
        binding.v2.visibility = View.INVISIBLE
        binding.v3.visibility = View.INVISIBLE
        binding.v4.visibility = View.INVISIBLE
        binding.v5.visibility = View.INVISIBLE
        binding.v6.visibility = View.INVISIBLE
        binding.v7.visibility = View.INVISIBLE
        binding.v8.visibility = View.INVISIBLE
        binding.v9.visibility = View.INVISIBLE
    }

    override fun onStop() {
        super.onStop()
        binding.v.alpha = 0.7f
        binding.v1.alpha = 0.7f
        binding.v3.alpha = 0.7f
        binding.v4.alpha = 0.7f
        binding.v5.alpha = 0.7f
        binding.v6.alpha = 0.7f
        binding.v7.alpha = 0.7f
        binding.v8.alpha = 0.7f
        binding.v9.alpha = 0.7f
        binding.v10.alpha = 0.7f
        binding.v.visibility = View.GONE
        binding.v1.visibility = View.GONE
        binding.v2.visibility = View.GONE
        binding.v3.visibility = View.GONE
        binding.v4.visibility = View.GONE
        binding.v5.visibility = View.GONE
        binding.v6.visibility = View.GONE
        binding.v7.visibility = View.GONE
        binding.v8.visibility = View.GONE
        binding.v9.visibility = View.GONE
    }
}