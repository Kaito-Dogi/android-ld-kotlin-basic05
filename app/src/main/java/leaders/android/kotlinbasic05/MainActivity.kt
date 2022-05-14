package leaders.android.kotlinbasic05

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import leaders.android.kotlinbasic05.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // くじを引くボタンを押した時の処理
        binding.drawLotsButton.setOnClickListener {
            val randomNum: Int = Random.nextInt(5)
            binding.resultImage.setImageResource(getOmikujiResult(randomNum))
        }
    }

    // おみくじの画像を返すメソッド
    fun getOmikujiResult(randomNum: Int): Int {
        // drawableリソースの配列を宣言
        val omikujiImages: Array<Int> = arrayOf(
            R.drawable.omikuji_daikichi,
            R.drawable.omikuji_chuukichi,
            R.drawable.omikuji_syoukichi,
            R.drawable.omikuji_kyou,
            R.drawable.omikuji_daikyou,
        )
        return omikujiImages[randomNum]
    }
}
