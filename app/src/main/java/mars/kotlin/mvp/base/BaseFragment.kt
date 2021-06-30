package mars.kotlin.mvp.base

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

/**
 * 创建日期：2021/6/30 0030 22:26
 * @author Mars
 * @version 1.0
 * 包名： mars.kotlin.mvp.base
 * 类说明：
 */
abstract class BaseFragment<P> : Fragment() where P : IBasePresenter {
    lateinit var mP: P

    lateinit var mActivity: AppCompatActivity


    override fun onAttach(context: Context) {
        super.onAttach(context)

        mActivity = context as AppCompatActivity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mP = getPresenter()
    }

    abstract fun getPresenter(): P


    override fun onDestroy() {
        super.onDestroy()
        recycle()
    }

    abstract fun activityCreated()
    abstract fun recycle()


    fun hideActionBar() : Unit {
        val actionBar: ActionBar? = mActivity?.supportActionBar
        actionBar?.hide();
    }

    /**
     * 暴露给自己的孩子 显示ActionBar
     */
    fun showActionBar() : Unit {
        mActivity?.supportActionBar?.show()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activityCreated()
    }
}