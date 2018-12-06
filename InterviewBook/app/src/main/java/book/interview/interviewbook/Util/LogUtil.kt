package book.interview.interviewbook.Util

import android.util.Log

/**
 * @Author yocn
 * @Date 2018/12/6 2:17 PM
 * @ClassName LogUtil
 */
class LogUtil {
    companion object {
        private const val TAG = "LogUtil"
        fun d(msg: String) {
            Log.d(TAG, msg)
        }
    }
}