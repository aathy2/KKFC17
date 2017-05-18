package mv.sense.kkfc17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAdmin = (Button) findViewById(R.id.BtnAdmin);
        btAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent admin = new Intent (MainActivity.this, Admin.class);
                startActivity(admin);

            }
        });

        Button btUser = (Button) findViewById(R.id.BtnUser);
        btUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent user = new Intent (MainActivity.this, User.class);
                startActivity(user);
            }
        });

    }
}
