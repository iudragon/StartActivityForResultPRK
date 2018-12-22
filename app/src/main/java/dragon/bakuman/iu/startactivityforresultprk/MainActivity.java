package dragon.bakuman.iu.startactivityforresultprk;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int MESSAGE_REQUEST = 01;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.text_display_message);
    }

    public void getMessage(View view) {

        Intent intent = new Intent(this, MessageActivity.class);
        startActivityForResult(intent, MESSAGE_REQUEST);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (MESSAGE_REQUEST == requestCode){

            if (resultCode == RESULT_OK){

                String message = data.getStringExtra("message");
                mTextView.setText(message);
            }

        }
    }
}
