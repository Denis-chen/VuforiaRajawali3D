package project.peter.com.vuforiarajawali3d;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_image_target = (Button)findViewById(R.id.bt_image_target);
        bt_image_target.setOnClickListener(this);

        Button bt_cloud_reco = (Button)findViewById(R.id.bt_cloud_reco);
        bt_cloud_reco.setOnClickListener(this);

        Button bt_multi_target = (Button)findViewById(R.id.bt_multi_target);
        bt_cloud_reco.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_image_target:
                startActivity(new Intent(MainActivity.this, ImageTargetActivity.class));
                break;
            case R.id.bt_cloud_reco:
                startActivity(new Intent(MainActivity.this, CloudRecoActivity.class));
                break;
            case R.id.bt_multi_target:
                break;
        }
    }
}
