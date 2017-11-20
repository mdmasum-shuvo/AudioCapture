package masum.audiocapture;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button play,stop,record,stop_playing;
    String Audiopaath=null;
    MediaRecorder mediaRecorder;
    MediaPlayer mediaPlayer;
    Random random;
    public static final int requstpermissoincode=1;
    String reandomFileName="masum";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play= (Button) findViewById(R.id.play_button);
        stop= (Button) findViewById(R.id.stop_button);
        record= (Button) findViewById(R.id.record_button);
        stop_playing= (Button) findViewById(R.id.stop_playing_button);
    }

    public void record(View v){


    }
    public void play(View v){


    }
    public void stop(View v){


    }
    public void stop_playing(View v){


    }
}
