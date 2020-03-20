package aaronstacy.androidstudiojavadocbug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.tasks.Tasks

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    Tasks.forResult(null).addOnCompleteListener { Log.d("BLERG", "$it")}
  }
}
