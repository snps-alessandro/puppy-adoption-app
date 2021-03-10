package it.alexs.puppyapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import it.alexs.puppyapp.ui.theme.PuppyAdoptionTheme
import it.alexs.puppyapp.utils.PuppyUtils
import it.alexs.puppyapp.views.ShowPuppyDetail

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavPuppyApp(titleActivity = getString(R.string.app_name))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ShowPuppyDetail(PuppyUtils.getPuppies()[0])
}

