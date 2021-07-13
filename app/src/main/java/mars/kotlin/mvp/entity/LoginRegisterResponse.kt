package mars.kotlin.mvp.entity

/**
 * 创建日期：2021/7/8 0008 22:00
 * @author Mars
 * @version 1.0
 * 包名： mars.kotlin.mvp.entity
 * 类说明：
 */
data class LoginRegisterResponse(
    val admin: Boolean,
    val chapterTops: List<*>,
    val collectIds: List<*>,
    val email: String ?,
    val icon: String?,
    val id: String?,
    val nickname: String?,
    val password: String?,
    val publicName: String?,
    val token: String?,
    val type: Int,
    val username: String?

    ) {
}