package ui.internet

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.android.projetblebdebard.R
import ui.main.MainActivity
import ui.scan.ScanActivity

class InternetActivity : AppCompatActivity() {

    companion object {
        fun getStartIntent(context: Context): Intent {
            return Intent(context, InternetActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internet)

        findViewById<ImageView>(R.id.btn_retour).setOnClickListener {
            startActivity(MainActivity.getStartIntent(this))
        }

    }
}