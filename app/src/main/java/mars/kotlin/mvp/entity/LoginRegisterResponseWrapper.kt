package mars.kotlin.mvp.entity

/**
 * 创建日期：2021/7/8 0008 22:02
 * @author Mars
 * @version 1.0
 * 包名： mars.kotlin.mvp.entity
 * 类说明：
 */


/**
 * 包装Bean

{
"data": {
"admin": false,
"chapterTops": [],
"collectIds": [],
"email": "",
"icon": "",
"id": 66720,
"nickname": "Derry-vip",
"password": "",
"publicName": "Derry-vip",
"token": "",
"type": 0,
"username": "Derry-vip"
},
"errorCode": 0,
"errorMsg": ""
}

{
"data": null,
"errorCode": -1,
"errorMsg": "账号密码不匹配！"
}

 */
data class LoginRegisterResponseWrapper<DATA>(
    val data: DATA, val errorCode: Int,
    val errorMsg: String
)