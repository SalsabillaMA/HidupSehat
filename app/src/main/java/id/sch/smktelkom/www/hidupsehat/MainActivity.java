package id.sch.smktelkom.www.hidupsehat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHimbauanDiri = findViewById(R.id.btn_himbauan_diri);
        btnHimbauanDiri.setOnClickListener(this);

        Button btnCuciTangan = findViewById(R.id.btn_cuci_tangan);
        btnCuciTangan.setOnClickListener(this);

        Button btnPakaiMasker = findViewById(R.id.btn_pakai_masker);
        btnPakaiMasker.setOnClickListener(this);

        Button btnPolaHidup = findViewById(R.id.btn_pola_hidup);
        btnPolaHidup.setOnClickListener(this);

        Button btnDataDiri = findViewById(R.id.btn_data_diri);
        btnDataDiri.setOnClickListener(this);

        Button btnContactUs = findViewById(R.id.btn_contact_us);
        btnContactUs.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_himbauan_diri:
                Intent himbauan = new Intent(MainActivity.this, HimbauanDiri.class);
                startActivity(himbauan);
                break;
            case R.id.btn_cuci_tangan:
                Intent cuci_tangan = new Intent(MainActivity.this, CuciTangan.class);
                startActivity(cuci_tangan);
                break;
            case R.id.btn_pakai_masker:
                Intent pakai_masker = new Intent(MainActivity.this, PakaiMasker.class);
                startActivity(pakai_masker);
                break;
            case R.id.btn_pola_hidup:
                Intent pola_hidup = new Intent(MainActivity.this, PolaHidup.class);
                startActivity(pola_hidup);
                break;
            case R.id.btn_data_diri:
                Intent datadiri = new Intent(MainActivity.this, DataDiri.class);
                datadiri.putExtra(DataDiri.EXTRA_NAMA, "Salsabilla Maurettasya A");
                datadiri.putExtra(DataDiri.EXTRA_KELAS, "XI RPL 3");
                datadiri.putExtra(DataDiri.EXTRA_NO, "39");
                startActivity(datadiri);
                break;
            case R.id.btn_contact_us:
                String phoneNumber = "112";
                Intent kontak = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(kontak);
                break;


        }
    }
}