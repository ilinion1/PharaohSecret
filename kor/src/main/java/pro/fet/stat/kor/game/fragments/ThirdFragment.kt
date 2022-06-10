package pro.fet.stat.kor.game.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import pro.fet.stat.kor.R
import pro.fet.stat.kor.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnCard1ClickListener()
        setOnCard2ClickListener()
        setOnCard3ClickListener()
        setOnCard4ClickListener()
        setOnCard5ClickListener()
        setOnCard6ClickListener()
        setV()
    }

    private fun setV(){
        binding.card1.visibility = View.VISIBLE
        binding.card2.visibility = View.VISIBLE
        binding.card3.visibility = View.VISIBLE
        binding.card4.visibility = View.VISIBLE
        binding.card5.visibility = View.VISIBLE
        binding.card6.visibility = View.VISIBLE
        binding.card1.alpha = 1f
        binding.card2.alpha = 1f
        binding.card3.alpha = 1f
        binding.card4.alpha = 1f
        binding.card5.alpha = 1f
        binding.card6.alpha = 1f

    }

    override fun onResume() {
        super.onResume()
        binding.card1.visibility = View.VISIBLE
        binding.card2.visibility = View.VISIBLE
        binding.card3.visibility = View.VISIBLE
        binding.card4.visibility = View.VISIBLE
        binding.card5.visibility = View.VISIBLE
        binding.card6.visibility = View.VISIBLE
        binding.card1.alpha = 1f
        binding.card2.alpha = 1f
        binding.card3.alpha = 1f
        binding.card4.alpha = 1f
        binding.card5.alpha = 1f
        binding.card6.alpha = 1f
    }

    override fun onStart() {
        super.onStart()
        binding.card1.visibility = View.VISIBLE
        binding.card2.visibility = View.VISIBLE
        binding.card3.visibility = View.VISIBLE
        binding.card4.visibility = View.VISIBLE
        binding.card5.visibility = View.VISIBLE
        binding.card6.visibility = View.VISIBLE
        binding.card1.alpha = 1f
        binding.card2.alpha = 1f
        binding.card3.alpha = 1f
        binding.card4.alpha = 1f
        binding.card5.alpha = 1f
        binding.card6.alpha = 1f
    }

    private fun setOnCard1ClickListener(){
        binding.card1.setOnClickListener {
            if (!card1Active){
                binding.card1.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.blue))
                card1Active = true
            } else {
                binding.card1.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.white))
                card1Active = false
            }
        }
    }

    private fun setOnCard2ClickListener(){
        binding.card2.setOnClickListener {
            if (!card1Active){
                binding.card2.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.blue))
                card2Active = true
            } else {
                binding.card2.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.white))
                card2Active = false
            }
        }
    }

    private fun setOnCard3ClickListener(){
        binding.card3.setOnClickListener {
            if (!card1Active){
                binding.card3.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.blue))
                card3Active = true
            } else {
                binding.card3.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.white))
                card3Active = false
            }
        }
    }

    private fun setOnCard4ClickListener(){
        binding.card4.setOnClickListener {
            if (!card1Active){
                binding.card4.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.blue))
                card4Active = true
            } else {
                binding.card4.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.white))
                card4Active = false
            }
        }
    }

    private fun setOnCard5ClickListener(){
        binding.card5.setOnClickListener {
            if (!card1Active){
                binding.card5.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.blue))
                card5Active = true
            } else {
                binding.card5.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.white))
                card5Active = false
            }
        }
    }

    private fun setOnCard6ClickListener(){
        binding.card6.setOnClickListener {
            if (!card1Active){
                binding.card6.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.blue))
                card6Active = true
            } else {
                binding.card6.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.white))
                card6Active = false
            }
        }
    }



    companion object {
        var card1Active = false
        var card2Active = false
        var card3Active = false
        var card4Active = false
        var card5Active = false
        var card6Active = false
    }
}