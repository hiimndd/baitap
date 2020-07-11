package com.example.baitapdanhba;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ListView;
        import android.widget.RadioButton;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    EditText edtname;
    EditText edtPhone;
    RadioButton rdoNam, rdoNu;
    Button  btnThem, btnXoa, btnsua;
    AdapterDanhBa adapterDanhBa;
    ArrayList<DanhBa> arrayList;
    int i  = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView1);
        edtname = (EditText) findViewById(R.id.edtname);
        edtPhone = (EditText) findViewById(R.id.edtPhone);
        rdoNam = (RadioButton) findViewById(R.id.rdoNam);
        rdoNu = (RadioButton) findViewById(R.id.rdoNu);
        btnThem = (Button) findViewById(R.id.btnThem);
        btnsua = (Button) findViewById(R.id.btnSua);
        btnXoa = (Button) findViewById(R.id.btnxoa);
        xuLy();

    }

    private void xuLy() {
        arrayList = new ArrayList<>();
        adapterDanhBa = new AdapterDanhBa(this, R.layout.danh_ba, arrayList);
            //    arrayList.add(new DanhBa("DatPro", "091278292", R.drawable.ic_launcher_foreground));
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (rdoNam.isChecked()){
                    arrayList.add(new DanhBa(edtname.getText().toString(), edtPhone.getText().toString(), R.drawable.ic_launcher_background));
                    adapterDanhBa.notifyDataSetChanged();
                }
                if (rdoNu.isChecked()){
                    arrayList.add(new DanhBa(edtname.getText().toString(), edtPhone.getText().toString(), R.drawable.ic_launcher_foreground));
                    adapterDanhBa.notifyDataSetChanged();
                }

            }
    });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                i = position;

                edtname.setText(arrayList.get(position).getTen().toString());
                edtPhone.setText(arrayList.get(position).getSdt().toString());

            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arrayList.size() >= 1)
                arrayList.remove(i);
                adapterDanhBa.notifyDataSetChanged();
            }
        });
        btnsua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rdoNam.isChecked()){
                    arrayList.set(i ,new DanhBa(edtname.getText().toString(), edtPhone.getText().toString(), R.drawable.ic_launcher_background));
                    adapterDanhBa.notifyDataSetChanged();
                }
                if (rdoNu.isChecked()){
                    arrayList.set(i,new DanhBa(edtname.getText().toString(), edtPhone.getText().toString(), R.drawable.ic_launcher_foreground));
                    adapterDanhBa.notifyDataSetChanged();
                }
            }
        });
        listView.setAdapter(adapterDanhBa);

    }
}
