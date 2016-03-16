package nl.vossius.ramos.nav1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity2 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    @Override
    protected boolean useToolbar()
    {
        return false;

    }
}
