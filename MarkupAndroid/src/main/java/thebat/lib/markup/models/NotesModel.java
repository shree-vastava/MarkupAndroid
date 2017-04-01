package thebat.lib.markup.models;

/**
 * Created by shree on 9/7/16.
 */


public class NotesModel {

    int startIdx,endIdx;
    String note;

    public void setStartIdx(int index){
        startIdx = index;
    }

    public void setEndIdx(int index){
        endIdx = index;
    }

    public void setNote(String note){
        this.note = note;
    }

    public int getStartIdx(){
        return startIdx;
    }

    public int getEndIdx(){
        return endIdx;
    }

    public String getNote(){
        return note;
    }


}
