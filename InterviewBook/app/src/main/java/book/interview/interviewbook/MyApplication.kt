package book.interview.interviewbook

import android.app.Application
import book.interview.interviewbook.Util.FileUtil
import book.interview.interviewbook.Util.LogUtil
import com.zzhoujay.richtext.RichText

/**
 * @Author yocn
 * @Date 2018/12/6 2:03 PM
 * @ClassName MyApplication
 */
class MyApplication : Application() {

    companion object {
        private var context: Application? = null
        fun getContext() = context!!
    }

    override fun onCreate() {
        super.onCreate()
        context = this
//        LogUtil.d("a->" + FileUtil.getExternalFilesDir())
//        RichText.initCacheDir()
    }


}