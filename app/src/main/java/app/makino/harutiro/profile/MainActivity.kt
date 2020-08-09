package app.makino.harutiro.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            profileImage.setImageResource(R.drawable.harutiro)
            profileLabelText.text = "harutiro"
            profileCommentText.text = "こんにちは、初めてのテキスト入力です！ \n\n~プロフィール~ \n名前：牧野遥斗　\n性別：男性　\n出身地：愛知県　豊川市　\n出身小学校：水戸南部小学校　\n出身中学校：御津中学校　\n現在：豊川工業情報科　         \nその他：将来便利なプログラムを自分で作れるようになりたい！！"

        }

        button2.setOnClickListener {
            profileImage.setImageResource(R.drawable.urara)
            profileLabelText.text = "うらら迷路帳"
            profileCommentText.text = ""
        }

        button3.setOnClickListener {
            profileImage.setImageResource(R.drawable.cpu)
            profileLabelText.text = "used CPU"
            profileCommentText.text = ""
        }

        button4.setOnClickListener {
            profileImage.setImageResource(R.drawable.end)
            profileLabelText.text = "end"
            profileCommentText.text = ""
        }




    }
}