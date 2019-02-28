package smktelkom.www.hitungbangunpersegi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editSisi, editHasil, editKeliling;
    private Button btnOk;
    private TextView txtSisi, txtLuas, txtKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initEvent();
    }

    private void initUI() {
        txtSisi = findViewById(R.id.txtSisi);
        txtLuas = findViewById(R.id.txtLuas);
        txtKeliling = findViewById(R.id.txtKeliling);
        btnOk = findViewById(R.id.btnOk);
        editSisi = findViewById(R.id.editSisi);
        editHasil = findViewById(R.id.editHasil);
        editKeliling = findViewById(R.id.editKeliling);
    }

    private void initEvent() {
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
                hitungKeliling();
            }
        });
    }

    private void hitungLuas() {
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int luas = sisi * sisi;
        editHasil.setText(luas + "");
    }

    private void hitungKeliling() {
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int keliling = 4 * sisi;
        editKeliling.setText(keliling + "");
    }
}
