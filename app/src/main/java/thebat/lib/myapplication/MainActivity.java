package thebat.lib.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import thebat.lib.markup.MarkupAndorid;
import thebat.lib.markup.models.HighlightModel;
import thebat.lib.markup.models.NotesModel;

public class MainActivity extends AppCompatActivity {

    List<HighlightModel> highList = new ArrayList<>();
    List<NotesModel> notesList = new ArrayList<>();
    Button highlight,addNote;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        addNote = (Button) findViewById(R.id.btnNote);
        highlight = (Button) findViewById(R.id.btnHigh);

        addNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotesModel model = new NotesModel();
                model.setStartIdx(textView.getSelectionStart());
                model.setEndIdx(textView.getSelectionEnd());
                model.setNote("Aquaman Sucks!");

                notesList.add(model);

                MarkupAndorid markUp = new MarkupAndorid();
                markUp.addAll(MainActivity.this,textView,notesList,highList);
            }
        });

        highlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HighlightModel model = new HighlightModel();
                model.setStartIdx(textView.getSelectionStart());
                model.setEndIdx(textView.getSelectionEnd());
                model.setColor(Color.BLUE);

                highList.add(model);

                MarkupAndorid markUp = new MarkupAndorid();
                markUp.addAll(MainActivity.this,textView,notesList,highList);
            }
        });
    }
}
