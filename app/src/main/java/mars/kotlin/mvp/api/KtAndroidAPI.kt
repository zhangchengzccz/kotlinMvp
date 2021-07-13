package mars.kotlin.mvp.api

import io.reactivex.Observable
import mars.kotlin.mvp.entity.LoginRegisterResponse
import mars.kotlin.mvp.entity.LoginRegisterResponseWrapper
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * 创建日期：2021/7/8 0008 21:52
 * @author Mars
 * @version 1.0
 * 包名： mars.kotlin.mvp.api
 * 类说明：  请求类
 */
interface KtAndroidAPI {

    @POST("/user/login")
    @FormUrlEncoded
    fun loginAction(
        @Field("username") username: String, @Field("password") password: String
    ): Observable<LoginRegisterResponseWrapper<LoginRegisterResponse>>


    @POST("/user/register")
    @FormUrlEncoded
    fun registerAction(
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("repassword") repassword: String
    ): Observable<LoginRegisterResponseWrapper<LoginRegisterResponse>>
}