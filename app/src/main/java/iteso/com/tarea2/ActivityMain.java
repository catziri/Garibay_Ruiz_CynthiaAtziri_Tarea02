package iteso.com.tarea2;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

Button b1,b2,b3,b4,add;
ImageView l;
RadioButton r1, r2, r3, r4;
String br1,br2,br3,br4,bb1,bb2,bb3,bb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.activity_main_b1);
        b2=findViewById(R.id.activity_main_b2);
        b3=findViewById(R.id.activity_main_b3);
        b4=findViewById(R.id.activity_main_b4);
        l=findViewById(R.id.activity_main_like);
        r1=findViewById(R.id.activity_main_r1);
        r2=findViewById(R.id.activity_main_r2);
        r3=findViewById(R.id.activity_main_r3);
        r4=findViewById(R.id.activity_main_r4);
        add=findViewById(R.id.activity_main_add);
    
}

    void like(View v){
        Toast t;
        String stoast=" ";
        stoast=getString(R.string.like);
        t=Toast.makeText(this,stoast,Toast.LENGTH_SHORT);
        t.show();
    }

    void b1(View v){
        b1.setTextColor(getColor(R.color.white));
        b1.setBackgroundColor(getColor(R.color.colorPrimary));
        b2.setBackground(this.getDrawable(R.drawable.mybutton));
        b2.setTextColor(getColor(R.color.colorPrimary));
        b3.setBackground(this.getDrawable(R.drawable.mybutton));
        b3.setTextColor(getColor(R.color.colorPrimary));
        b4.setBackground(this.getDrawable(R.drawable.mybutton));
        b4.setTextColor(getColor(R.color.colorPrimary));
    }
    void b2(View v){
        b2.setBackgroundColor(getColor(R.color.colorPrimary));
        b2.setTextColor(getColor(R.color.white));
        b1.setBackground(this.getDrawable(R.drawable.mybutton));
        b1.setTextColor(getColor(R.color.colorPrimary));
        b3.setBackground(this.getDrawable(R.drawable.mybutton));
        b3.setTextColor(getColor(R.color.colorPrimary));
        b4.setBackground(this.getDrawable(R.drawable.mybutton));
        b4.setTextColor(getColor(R.color.colorPrimary));
    }
    void b3(View v){
        b3.setTextColor(getColor(R.color.white));
        b3.setBackgroundColor(getColor(R.color.colorPrimary));
        b2.setBackground(this.getDrawable(R.drawable.mybutton));
        b2.setTextColor(getColor(R.color.colorPrimary));
        b1.setBackground(this.getDrawable(R.drawable.mybutton));
        b1.setTextColor(getColor(R.color.colorPrimary));
        b4.setBackground(this.getDrawable(R.drawable.mybutton));
        b4.setTextColor(getColor(R.color.colorPrimary));
    }
    void b4(View v) {
        b4.setTextColor(getColor(R.color.white));
        b4.setBackgroundColor(getColor(R.color.colorPrimary));
        b2.setBackground(this.getDrawable(R.drawable.mybutton));
        b2.setTextColor(getColor(R.color.colorPrimary));
        b3.setBackground(this.getDrawable(R.drawable.mybutton));
        b3.setTextColor(getColor(R.color.colorPrimary));
        b1.setBackground(this.getDrawable(R.drawable.mybutton));
        b1.setTextColor(getColor(R.color.colorPrimary));
    }
    void add(View v){
        if(add.getText().equals(getString(R.string.added))){
            Toast t;
            String stoast=" ";
            stoast=getString(R.string.already);
            t=Toast.makeText(this,stoast,Toast.LENGTH_SHORT);
            t.show();
        }else {
            add.setText(R.string.added);
            Snackbar.make(v, getString(R.string.added), Snackbar.LENGTH_INDEFINITE)
                    .setAction(getString(R.string.undo), new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            add.setText(R.string.buttonAdd);
                        }
                    })
                    .show();
        }
    }
}
