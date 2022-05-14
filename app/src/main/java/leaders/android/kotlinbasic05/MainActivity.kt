package leaders.android.kotlinbasic05

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import leaders.android.kotlinbasic05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // くじを引くボタンを押した時の処理
        binding.drawLotsButton.setOnClickListener {
            // ランダムな数値を変数に代入

            // ランダムな数値をLogcatに出力

            // ImageViewに表示する画像を切り替える
            
        }
    }

    // おみくじの画像を返すメソッド

    // drawableリソースの配列を宣言
}
