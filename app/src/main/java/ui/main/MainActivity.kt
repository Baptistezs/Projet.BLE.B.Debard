package ui.main

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.android.projetblebdebard.R
import ui.internet.InternetActivity
import ui.scan.ScanActivity

class MainActivity : AppCompatActivity() {

    companion object {
        fun getStartIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_scan).setOnClickListener {
            startActivity(ScanActivity.getStartIntent(this))
        }

        findViewById<Button>(R.id.btn_internet).setOnClickListener {
            startActivity(InternetActivity.getStartIntent(this))
        }

    }

}