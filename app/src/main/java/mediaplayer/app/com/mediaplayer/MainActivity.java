package mediaplayer.app.com.mediaplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button tocar;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tocar = findViewById(R.id.botaoId);
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ada);

        tocar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()){
                    pausarMusica();
                }else{
                    tocarMusica();
                }
            }
        });
    }

    private void tocarMusica(){
        if(mediaPlayer != null){
            mediaPlayer.start();
            tocar.setText("Parar");
        }
    }

    private void pausarMusica(){
        if(mediaPlayer != null){
            mediaPlayer.pause();
            tocar.setText("Tocar");
        }
    }
}
