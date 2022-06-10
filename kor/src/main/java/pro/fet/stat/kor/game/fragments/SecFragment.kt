package pro.fet.stat.kor.game.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import pro.fet.stat.kor.R
import pro.fet.stat.kor.databinding.FragmentSocndBinding
import pro.fet.stat.kor.game.adapt.ResAdapter


class SecFragment : Fragment() {
    lateinit var binding: FragmentSocndBinding
    lateinit var resAdapter: ResAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSocndBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        resAdapter = ResAdapter()
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
        setAdapter()
    }

    private fun setAdapter(){
        binding.rcView.adapter = resAdapter
        binding.rcView.layoutManager = LinearLayoutManager(requireContext())
        updateAdapter()
    }

    private fun updateAdapter(){
        resAdapter.listBalls = ballsList
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

    override fun onResume() {
        super.onResume()
        updateAdapter()
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


    companion object {
        var ballsList = arrayListOf<Int>()
    }
}