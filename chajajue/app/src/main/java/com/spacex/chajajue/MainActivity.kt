package com.spacex.chajajue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.io.File
import java.io.IOException
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun moveFile(sourceFilePath: String, destinationDirectoryPath: String): Int {
        val sourceFile = File(sourceFilePath)
        val destinationDirectory = File(destinationDirectoryPath)

        try {
            if (!sourceFile.exists()) {return 1}
            if (!destinationDirectory.exists()) {destinationDirectory.mkdirs()}
            val destinationFile = File(destinationDirectory, sourceFile.name)
            val isSuccess = sourceFile.renameTo(destinationFile)
            if (isSuccess) {return 0}
            else {return 2}
        }
        catch (e: IOException) {return 2}
    }

    val sourceFilePath = "원본 파일 경로"
    val destinationDirectoryPath = "대상 디렉터리 경로"

}