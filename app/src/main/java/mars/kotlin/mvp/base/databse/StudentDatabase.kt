package mars.kotlin.mvp.base.databse

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * 创建日期：2021/7/5 0005 21:59
 * @author Mars
 * @version 1.0
 * 包名： mars.kotlin.mvp.base.databse
 * 类说明：
 */
@Database(entities = [Student::class], version = 1)
abstract class StudentDatabase : RoomDatabase() {


    abstract fun getStudentDao(): StudentDao


    companion object {

        private var INSTANCE: StudentDatabase? = null

        fun getDatabase(context: Context): StudentDatabase? {
            if (INSTANCE == null) {
                INSTANCE =
                    Room.databaseBuilder(
                        context, StudentDatabase::class.java,
                        "student_database.db"
                    ).allowMainThreadQueries().build();


            }
            return INSTANCE
        }

        fun getDatabase(): StudentDatabase? = INSTANCE

    }

}