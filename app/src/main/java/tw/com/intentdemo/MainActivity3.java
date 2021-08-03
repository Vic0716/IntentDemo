package tw.com.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    private EditText price;
    private Button btnok,btncancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        findViews();
    }

    private void findViews(){
        price = findViewById(R.id.edtprice);
        btnok = findViewById(R.id.btnok);
        btncancel = findViewById(R.id.btncancel);

        btnok.setOnClickListener(v -> {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putInt("Price",Integer.parseInt(price.getText().toString()));

            bundle.putString("Product","Iphone13");
            bundle.putDouble("Pi",3.1415926);

            intent.putExtras(bundle);
            setResult(RESULT_OK,intent);
            finish();
        });

        btncancel.setOnClickListener(v -> {
            setResult(RESULT_CANCELED);
            finish();
        });
    }
}