package book.interview.interviewbook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import book.interview.interviewbook.Util.LogUtil
import dalvik.system.PathClassLoader
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.file.Path

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testAndroidClassLoader()
    }

    fun testAndroidClassLoader() {
        var loader = MainActivity::class.java.classLoader
        while (loader != null) {
            LogUtil.d("loader->" + loader.toString())
            LogUtil.d("-------------------------------->")
            loader = loader.parent
        }
    }

}
