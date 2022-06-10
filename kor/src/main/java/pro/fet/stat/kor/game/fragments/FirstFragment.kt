package pro.fet.stat.kor.game.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import pro.fet.stat.kor.R
import pro.fet.stat.kor.databinding.FragmentFirstBinding
import pro.fet.stat.kor.game.adapt.GameAdapter


class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding
    lateinit var gameAdapter: GameAdapter
    private var gameList = arrayListOf(R.drawable.im_a, R.drawable.im_beetle, R.drawable.im_book,
    R.drawable.im_ten, R.drawable.im_j, R.drawable.im_k)
    private var startGameList = arrayListOf(R.drawable.eye,R.drawable.eye,R.drawable.eye,R.drawable.eye,
        R.drawable.eye,R.drawable.eye,)
    var imWin = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gameAdapter = GameAdapter()
        gameAdapter.listGame = startGameList
        setGameList()
        setRecyclerView()
        clickItemListener()
    }

    private fun setGameList(){
        if (ThirdFragment.card1Active){
            gameList.add(R.drawable.im_a)
        }
        if (ThirdFragment.card2Active){
            gameList.add(R.drawable.im_beetle)
        }
        if (ThirdFragment.card3Active){
            gameList.add(R.drawable.im_book)
        }
        if (ThirdFragment.card4Active){
            gameList.add(R.drawable.im_j)
        }
        if (ThirdFragment.card5Active){
            gameList.add(R.drawable.im_k)
        }
        if (ThirdFragment.card6Active){
            gameList.add(R.drawable.im_ten)
        }
    }

    private fun setRecyclerView(){
        binding.rcGame.adapter = gameAdapter
        binding.rcGame.layoutManager = GridLayoutManager(requireContext(), 2)
        updateAdapter()
    }

    private fun updateAdapter(){
        gameAdapter.listGame.add(R.drawable.eye)
    }

    private fun clickItemListener(){
        gameAdapter.gameItemClickListener = {
            when(it){
                0 ->{
                    val imRandom = gameList[(0 until gameList.size).random()]
                    gameAdapter.listGame[it] = imRandom
                    gameAdapter.notifyItemChanged(it)
                    setBalls(imRandom)
                }
                1 ->{
                    val imRandom = gameList[(0 until gameList.size).random()]
                    gameAdapter.listGame[it] = imRandom
                    gameAdapter.notifyItemChanged(it)
                    setBalls(imRandom)
                }
                2 ->{
                    val imRandom = gameList[(0 until gameList.size).random()]
                    gameAdapter.listGame[it] = imRandom
                    gameAdapter.notifyItemChanged(it)
                    setBalls(imRandom)
                }
                3 ->{
                    val imRandom = gameList[(0 until gameList.size).random()]
                    gameAdapter.listGame[it] = imRandom
                    gameAdapter.notifyItemChanged(it)
                    setBalls(imRandom)
                }
                4 ->{
                    val imRandom = gameList[(0 until gameList.size).random()]
                    gameAdapter.listGame[it] = imRandom
                    gameAdapter.notifyItemChanged(it)
                    setBalls(imRandom)
                }
                else ->{
                    val imRandom = gameList[(0 until gameList.size).random()]
                    gameAdapter.listGame[it] = imRandom
                    gameAdapter.notifyItemChanged(it)
                    setBalls(imRandom)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        if (ThirdFragment.card1Active){
            gameList.add(R.drawable.im_a)
        }
        if (ThirdFragment.card2Active){
            gameList.add(R.drawable.im_beetle)
        }
        if (ThirdFragment.card3Active){
            gameList.add(R.drawable.im_book)
        }
        if (ThirdFragment.card4Active){
            gameList.add(R.drawable.im_j)
        }
        if (ThirdFragment.card5Active){
            gameList.add(R.drawable.im_k)
        }
        if (ThirdFragment.card6Active){
            gameList.add(R.drawable.im_ten)
        }
    }
    private fun setBalls(im: Int){
        if (im == R.drawable.im_a) {
            SecFragment.ballsList.add(10)
            imWin += 10
            binding.tvResult.text = imWin.toString()
        }
        if (im == R.drawable.im_beetle) {
            SecFragment.ballsList.add(30)
            imWin += 30
            binding.tvResult.text = imWin.toString()
        }
        if (im == R.drawable.im_book) {
            SecFragment.ballsList.add(45)
            imWin += 45
            binding.tvResult.text = imWin.toString()
        }
        if (im == R.drawable.im_j) {
            SecFragment.ballsList.add(65)
            imWin += 65
            binding.tvResult.text = imWin.toString()
        }
        if (im == R.drawable.im_ten) {
            SecFragment.ballsList.add(35)
            imWin += 35
            binding.tvResult.text = imWin.toString()
        }
        if (im == R.drawable.im_k) {
            SecFragment.ballsList.add(70)
            imWin += 70
            binding.tvResult.text = imWin.toString()
        }
    }
}