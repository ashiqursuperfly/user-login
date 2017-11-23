package wizardofoz.userlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class User4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user4);

        TextView textHyperLink = (TextView) findViewById(R.id.idlink4);
        textHyperLink.setMovementMethod(LinkMovementMethod.getInstance());

        Button btBack=(Button)findViewById(R.id.backButton4);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent MainIntent = new Intent(User4Activity.this, MainActivity.class);
                startActivity(MainIntent);
                finish();
            }
        });


    }
    private static final int TIME_INTERVAL = 2500;
    private long mBackPressed;

    public void onBackPressed() {


        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis())
        {
            Intent MainIntent = new Intent(User4Activity.this, MainActivity.class);
            startActivity(MainIntent);
            finish();

            return;
        }
        else {
            Toast.makeText(getBaseContext(), "Tap back button in order to LogOut", Toast.LENGTH_SHORT).show();

        }

        mBackPressed = System.currentTimeMillis();


    }
}
