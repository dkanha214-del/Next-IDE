package com.hyperion.nextide;
import android.view.Window;
import android.view.View;
import android.app.Activity;
import android.app.Dialog;
import android.widget.Button;
import android.os.Bundle;


public class ProjMergeDialog extends Dialog implements
android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    public Button yes, no;

    public ProjMergeDialog(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        yes = (Button) findViewById(R.id.btn_yes);
        no = (Button) findViewById(R.id.btn_no);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn_yes) {
            c.finish();
        } else if (id == R.id.btn_no) {
            dismiss();
        }
        dismiss();
    }
}
