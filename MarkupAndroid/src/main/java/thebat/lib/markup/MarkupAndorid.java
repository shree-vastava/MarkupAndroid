package thebat.lib.markup;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import thebat.lib.markup.models.HighlightModel;
import thebat.lib.markup.models.NotesModel;
import thebat.lib.markup.utils.MyTagHandler;
import thebat.lib.markup.utils.NoteSpan;


/**
 * Created by Shree on 01-04-2017.
 */

public class MarkupAndorid {

    public static SpannableString NoteAndHighlight(String plainText, List<HighlightModel> highlights, List<NotesModel> notes, final Context context){
        SpannableString spanString = new SpannableString(Html.fromHtml(plainText,null,new MyTagHandler()));
        for(int i = 0;i<highlights.size();i++){
            HighlightModel hlBean = highlights.get(i);
            ForegroundColorSpan localForegroundColorSpan2 = new ForegroundColorSpan(hlBean.getColor());
            spanString.setSpan(localForegroundColorSpan2, hlBean.getStartIdx(), hlBean.getEndIdx(), 0);
        }
        for(int i = 0;i<notes.size();i++){
            NotesModel noteBean = notes.get(i);

            NoteSpan noteSpan = new NoteSpan(noteBean, context);
            spanString.setSpan(noteSpan, noteBean.getStartIdx(), noteBean.getEndIdx(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        return spanString;
    }

    public static SpannableString Highlight(String plainText, List<HighlightModel> highlights, final Context context){
        SpannableString spanString = new SpannableString(Html.fromHtml(plainText,null,new MyTagHandler()));
        for(int i = 0;i<highlights.size();i++){
            HighlightModel hlBean = highlights.get(i);
            ForegroundColorSpan localForegroundColorSpan2 = new ForegroundColorSpan(hlBean.getColor());
            spanString.setSpan(localForegroundColorSpan2, hlBean.getStartIdx(), hlBean.getEndIdx(), 0);
        }
        return spanString;
    }

    public static SpannableString AddNote(String plainText, List<NotesModel> notes, final Context context){
        SpannableString spanString = new SpannableString(Html.fromHtml(plainText,null,new MyTagHandler()));
        for(int i = 0;i<notes.size();i++){
            NotesModel noteBean = notes.get(i);

            NoteSpan noteSpan = new NoteSpan(noteBean, context);
            spanString.setSpan(noteSpan, noteBean.getStartIdx(), noteBean.getEndIdx(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        return spanString;
    }


   /*
    //Highlight one word without color
    public void highlight(Context con, TextView tv, int StartInt, int EndIndex){

        HighlightModel model = new HighlightModel();
        model.setColor(Color.parseColor("#FF0000"));
        model.setEndIdx(EndIndex);
        model.setStartIdx(StartInt);

        List<HighlightModel> highlist = new ArrayList<>();
        highlist.add(model);
        String fullText=tv.getText().toString().replaceAll("[<](/)?font[^>]*[>]", "");
        tv.setText(Highlight(fullText, highlist, con));
        tv.setMovementMethod(LinkMovementMethod.getInstance());

    }


    //Highlight multiple words without color
    public void highlight(Context con, TextView tv, List<Integer> StartInt, List<Integer> EndIndex){

        List<HighlightModel> highlist = new ArrayList<>();

        for (int i = 0; i < StartInt.size(); i++) {
            HighlightModel model = new HighlightModel();
            model.setColor(Color.parseColor("#FF0000"));
            model.setEndIdx(EndIndex.get(i));
            model.setStartIdx(StartInt.get(i));
            highlist.add(model);
        }
        String fullText=tv.getText().toString().replaceAll("[<](/)?font[^>]*[>]", "");
        tv.setText(Highlight(fullText, highlist, con));
        tv.setMovementMethod(LinkMovementMethod.getInstance());

    }

    //Highlight multiple words with color
    public void highlight(Context con, TextView tv, List<Integer> StartInt, List<Integer> EndIndex, int color){

        List<HighlightModel> highlist = new ArrayList<>();

        for (int i = 0; i < StartInt.size(); i++) {
            HighlightModel model = new HighlightModel();
            model.setColor(color);
            model.setEndIdx(EndIndex.get(i));
            model.setStartIdx(StartInt.get(i));
            highlist.add(model);
        }
        String fullText=tv.getText().toString();
        tv.setText(Highlight(fullText, highlist, con));
        tv.setMovementMethod(LinkMovementMethod.getInstance());

    }

    //Highlight single word with color
    public void highlight(Context con, TextView tv, int StartInt, int EndIndex, int color){

        HighlightModel model = new HighlightModel();
        model.setColor(color);
        model.setEndIdx(EndIndex);
        model.setStartIdx(StartInt);

        List<HighlightModel> highlist = new ArrayList<>();
        highlist.add(model);
        String fullText=tv.getText().toString().replaceAll("[<](/)?font[^>]*[>]", "");
        tv.setText(Highlight(fullText, highlist, con));
        tv.setMovementMethod(LinkMovementMethod.getInstance());

    }


    //Add one word
    public void addNote(Context con, TextView tv, int StartInt, int EndIndex, String note){

        NotesModel model = new NotesModel();
        model.setNote(note);
        model.setEndIdx(EndIndex);
        model.setStartIdx(StartInt);

        List<NotesModel> noteslist = new ArrayList<>();
        noteslist.add(model);
        String fullText=tv.getText().toString().replaceAll("[<](/)?font[^>]*[>]", "");
        tv.setText(AddNote(fullText, noteslist, con));
        tv.setMovementMethod(LinkMovementMethod.getInstance());

    }

    //Add multiple words
    public void addNote(Context con, TextView tv, List<Integer> StartInt, List<Integer> EndIndex, List<String> note){

        List<NotesModel> noteslist = new ArrayList<>();

        for (int i = 0; i < StartInt.size(); i++) {
            NotesModel model = new NotesModel();
            model.setNote(note.get(i));
            model.setEndIdx(EndIndex.get(i));
            model.setStartIdx(StartInt.get(i));

            noteslist.add(model);
        }


        String fullText=tv.getText().toString().replaceAll("[<](/)?font[^>]*[>]", "");
        tv.setText(AddNote(fullText, noteslist, con));
        tv.setMovementMethod(LinkMovementMethod.getInstance());

    }*/

    public void highlight(Context con, TextView tv, HighlightModel model){

        List<HighlightModel> highlist = new ArrayList<>();
        highlist.add(model);
        String fullText=tv.getText().toString().replaceAll("[<](/)?font[^>]*[>]", "");
        tv.setText(Highlight(fullText, highlist, con));
        tv.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void highlight(Context con, TextView tv, List<HighlightModel> model){

        String fullText=tv.getText().toString().replaceAll("[<](/)?font[^>]*[>]", "");
        tv.setText(Highlight(fullText, model, con));
        tv.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void addNote(Context con, TextView tv, NotesModel model){

        List<NotesModel> notes_list_model = new ArrayList<>();
        notes_list_model.add(model);
        String fullText=tv.getText().toString().replaceAll("[<](/)?font[^>]*[>]", "");
        tv.setText(AddNote(fullText, notes_list_model, con));
        tv.setMovementMethod(LinkMovementMethod.getInstance());

    }


    public void addNote(Context con, TextView tv, List<NotesModel> model){

        String fullText=tv.getText().toString().replaceAll("[<](/)?font[^>]*[>]", "");
        tv.setText(AddNote(fullText, model, con));
        tv.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void addAll(Context con, TextView tv, List<NotesModel> notesList, List<HighlightModel> highlightList){

        String fullText=tv.getText().toString().replaceAll("[<](/)?font[^>]*[>]", "");
        tv.setText(NoteAndHighlight(fullText,highlightList,notesList,con));
        tv.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
