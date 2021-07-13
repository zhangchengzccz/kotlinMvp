package mars.kotlin.mvp.base.databse

import androidx.room.ColumnInfo
import androidx.room.Entity

/**
 * 创建日期：2021/7/5 0005 21:45
 * @author Mars
 * @version 1.0
 * 包名： mars.kotlin.mvp.base.databse
 * 类说明：
 */
@Entity
class Student() {

    val id: Int = 0;

    @ColumnInfo(name = "name")
    lateinit var name: String

    @ColumnInfo(name = "age")
    var age: Int = 0;

    constructor(name: String, age: Int) :this(){
        this.name = name
        this.age = age
    }
}