package book.interview.interviewbook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import book.interview.interviewbook.Util.LogUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogUtil.d("a->")
    }

}
