package book.interview.interviewbook.Util

import book.interview.interviewbook.MyApplication

/**
 * @Author yocn
 * @Date 2018/12/6 2:07 PM
 * @ClassName FileUtil
 */
class FileUtil {
    companion object {
        fun getExternalFilesDir(): String {
            val file = MyApplication.getContext().getExternalFilesDir("")
            return if (file == null) {
                ""
            } else {
                file!!.getAbsolutePath()
            }
        }
    }
}