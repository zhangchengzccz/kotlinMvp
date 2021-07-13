package mars.kotlin.mvp.base.databse

import androidx.room.*

/**
 * 创建日期：2021/7/5 0005 21:49
 * @author Mars
 * @version 1.0
 * 包名： mars.kotlin.mvp.base.databse
 * 类说明：
 */
@Dao
interface StudentDao {


    @Insert
    fun insertStudents(vararg students: Student)

    @Update
    fun updateStudents(vararg students: Student)

    @Delete
    fun deleteStudents(vararg students: Student)

    @Query("Delete From Student" )
    fun deleteAllStudents()

    @Query("SELECT * FROM student ORDER BY ID DESC")
    fun queryAllStudents():List<Student>
}