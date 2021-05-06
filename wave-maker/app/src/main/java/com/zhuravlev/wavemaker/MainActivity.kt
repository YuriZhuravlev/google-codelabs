package com.zhuravlev.wavemaker

import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.zhuravlev.wavemaker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        startEngine()
        binding.sampleText.text = stringFromJNI()
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event != null) {
            touchEvent(event.action)
        }
        return super.onTouchEvent(event)
    }

    override fun onDestroy() {
        stopEngine()
        super.onDestroy()
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    private external fun stringFromJNI(): String
    private external fun touchEvent(action: Int)
    private external fun startEngine()
    private external fun stopEngine()

    companion object {
        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}