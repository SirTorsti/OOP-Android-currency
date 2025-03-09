package virta.viivainen.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        userInput = findViewById(R.id.EuroInput);
        textOutput = findViewById(R.id.ResultText);
    }

    public void changeToUSD(View view) {
        String userEuros = userInput.getText().toString();
        float euros = Float.parseFloat(userEuros);
        double result = euros * 1.05;
        String str = String.format("$%.2f" , result);
        textOutput.setText(str);

    }

    public void changeToGPD(View view) {
        String userEuros = userInput.getText().toString();
        float euros = Float.parseFloat(userEuros);
        double result = euros / 0.83;
        String str = String.format("£%.2f" , result);
        textOutput.setText(str);

    }
}