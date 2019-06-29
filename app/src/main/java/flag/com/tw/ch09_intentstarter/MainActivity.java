package flag.com.tw.ch09_intentstarter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        Intent it = new Intent(Intent.ACTION_VIEW);

        switch (v.getId()){
            case R.id.button :
                it.setData(Uri.parse("mailto:service@flag.com.tw"));
                it.putExtra(Intent.EXTRA_CC, new String[] {"kk@flag.tw"});
                it.putExtra(Intent.EXTRA_SUBJECT, "資料收到");
                it.putExtra(Intent.EXTRA_TEXT, "你好以收到謝謝");
                break;
            case R.id.button2:
                it.setData(Uri.parse("sms:0960-020121?body=簡訊內容"));
                break;
            case R.id.button3:
                it.setData(Uri.parse("http:\\www.flag.com.tw"));
                break;
            case R.id.button4:
                it.setData(Uri.parse("geo:25.047095, 121.514308"));
            case R.id.button5:
                it.setAction(Intent.ACTION_WEB_SEARCH);
                it.putExtra(SearchManager.QUERY, "牛B");
                break;
        }

        startActivity(it);
    }
}
