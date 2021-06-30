package mars.kotlin.mvp.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity

/**
 * 创建日期：2021/6/30 0030 22:17
 * @author Mars
 * @version 1.0
 * 包名： mars.kotlin.mvp.base
 * 类说明：
 */
abstract class BaseActivity<P> : AppCompatActivity() where  P : IBasePresenter {

    lateinit var presenter: P


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        createPresenter();
    }

    abstract fun createPresenter(): P

    abstract fun recycle()

    override fun onDestroy() {
        super.onDestroy()

        recycle()
    }


    fun hideActionBar() {

//     var actionBar : ActionBar? = supportActionBar

        supportActionBar?.hide()
    }

    fun showActionBar() {
        supportActionBar?.show()


    }


}