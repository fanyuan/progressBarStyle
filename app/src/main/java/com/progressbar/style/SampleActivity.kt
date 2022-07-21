package com.progressbar.style

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.databinding.DataBindingUtil
import com.progressbar.style.databinding.ActivitySampleBinding

class SampleActivity : AppCompatActivity() {
    lateinit var binding:ActivitySampleBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sample)
    }

    fun click(view: View) {
        updateProgress(binding.progress)
    }

    fun click2(view: View) {
        updateProgress(binding.progress2)
    }

    fun click3(view: View) {
        updateProgress(binding.progress3)
    }

    fun click5(view: View) {
        updateProgress(binding.progress5)
    }

    fun click6(view: View) {
        updateProgress(binding.progress6)
    }

    fun click9Patch(view: View) {
        updateProgress(binding.progress9Patch)
    }

    private fun updateProgress(progressBar: ProgressBar) {
        var progress = progressBar.progress;
        if(progress >= progressBar.max){
            progress = 0;
        }else{
            progress += 10
        }
        progressBar.progress = progress
    }


}