/**
 * 
 */
package thebat.lib.markup.utils;


import android.app.Dialog;
import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;


;import thebat.lib.markup.R;
import thebat.lib.markup.models.NotesModel;

/**
 * @author B0073698
 *
 */
public class NoteSpan extends ClickableSpan {

	private NotesModel note;
	private Context context;
	
	/**
	 * 
	 */
	public NoteSpan(NotesModel note, Context context) {
		this.note = note;
		this.context = context;

	}

	/* (non-Javadoc)
	 * @see android.text.style.ClickableSpan#onClick(android.view.View)
	 */
	@Override
	public void onClick(View widget) {

		showNoteDialog(note.getNote());

	}

	public void showNoteDialog(String note){

		final Dialog d=new Dialog(context);
		d.setTitle("Your note");
		d.setContentView(R.layout.dialog_view_note);
		d.getWindow().getAttributes().width = WindowManager.LayoutParams.FILL_PARENT;

		final TextView viewNote=(TextView) d.findViewById(R.id.txtViewNote);
		viewNote.setText(note);
		d.show();

	}

}
