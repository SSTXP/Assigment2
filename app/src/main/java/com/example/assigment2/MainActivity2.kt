package com.example.assigment2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // declaration of buttons and progress bars

        val feed: Button = findViewById(R.id.feed)
        val clean: Button = findViewById(R.id.clean)
        val play: Button = findViewById(R.id.play)

        val progress_play: ProgressBar = findViewById(R.id.progress_play)
        val progress_clean: ProgressBar = findViewById(R.id.progress_clean)
        val progress_feed: ProgressBar = findViewById(R.id.progress_feed)
        val image_koala: ImageView = findViewById(R.id.image_koala)

        play.setOnClickListener {
            image_koala.setImageResource(R.drawable.playing)  // Change image to 'Play'

            if (progress_play.progress <= 80) { // when the button play is pressed the progress bar will increase by 20 but the feed progress bar will drop by 20
                progress_play.progress += 20
                if (progress_feed.progress >= 20) {
                    progress_feed.progress -= 20
                }
            }
        }

        clean.setOnClickListener {
            image_koala.setImageResource(R.drawable.cleaning)  // Change image to 'Clean'

            if (progress_clean.progress <= 80) { // when the button clean is pressed the progress bar will increase by 20 but the play progress bar will drop by 20
                progress_clean.progress += 20
                if (progress_play.progress >= 20) {
                    progress_play.progress -= 20
                }
            }
        }

        feed.setOnClickListener {
            image_koala.setImageResource(R.drawable.eating)  // Change image to 'Feed'

            if (progress_feed.progress <= 80) { // when the button feed is pressed the progress bar will increase by 20 but the clean progress bar will drop by 20
                progress_feed.progress += 20
                if (progress_clean.progress >= 20) {
                    progress_clean.progress -= 20
                }
            }
        }

    }
}

// The IIE.2024.[IMAD5112 Module Manual].Unpublished.
