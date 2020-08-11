package id.sch.smktelkom.www.hidupsehat;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DataDiri extends AppCompatActivity {
    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_KELAS = "extra_kelas";
    public static final String EXTRA_NO = "extra_no";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_diri);

        TextView tvDataDiri = findViewById(R.id.tv_data_diri);
        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String kelas = getIntent().getStringExtra(EXTRA_KELAS);
        int no = getIntent().getIntExtra(EXTRA_NO, 39);

        String text = "Name : " + nama + ",\nClass : " + kelas + ",\nNumber : "
                + no;
        tvDataDiri.setText(text);

    }
}