package dragon.bakuman.iu.startactivityforresultprk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MessageActivity extends AppCompatActivity {

    EditText mMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        mMessage = findViewById(R.id.text_message);
    }

    public void sendMessage(View view) {

        String message = mMessage.getText().toString();
        Intent returnIntent = new Intent();
        returnIntent.putExtra("message", message);
        setResult(RESULT_OK, returnIntent);
        finish();

    }
}
