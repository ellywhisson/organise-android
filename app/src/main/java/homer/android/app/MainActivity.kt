package homer.android.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.Toast
import android.content.Intent



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Logging in",
                Toast.LENGTH_SHORT)
                .show()

            val intent = Intent(this@MainActivity, Dashboard::class.java)
            startActivity(intent)
        }
    }


}
