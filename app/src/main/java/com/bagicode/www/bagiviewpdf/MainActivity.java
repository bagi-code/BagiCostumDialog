package com.bagicode.www.bagiviewpdf;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Setelah kita menambahakan layout dialog kita akan membuat aksinya
        * 1. inisialisasi button */

        Button btnButton = (Button) findViewById(R.id.goCostum);
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // disini kita akan memanggil dari dialog yang telah kita buat
                goCostumDialog();

                // terakhir, jalankan :)
                // demikianlah tutorial ini
                // cek deskripsi jika ingin mendownload project
                // by guys :d
            }
        });
    }

    //biar rapi saya akan membuat method fungsinya di sini
    public void goCostumDialog() {
        //1 inisialisasi dari dialog
        final Dialog dialog = new Dialog(MainActivity.this);
        // kemudian menambahkan tampilan costum dialog;
        dialog.setContentView(R.layout.dialog_main);
        dialog.setTitle("Costum Dialog");

        // lalu kita memanggil fungsi jika Anda menginnginkannya seperti ini
        TextView textView = (TextView) dialog.findViewById(R.id.text);
        textView.setText("Ini dibikin Otomatis LOhhhhh");

        // terakhir kita bisa menambahkan sebuah button
        Button btnEnd = (Button) dialog.findViewById(R.id.dialogButtonOK);
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // kita bisa menutp dari dialog ini dengan perintah
                dialog.dismiss();
            }
        });

        // jangan lupa menambahkan fungsi show
        dialog.show();
    }
}
