package thebat.lib.markup.models;

/**
 * Created by shree on 9/7/16.
 */
public class HighlightModel {


    int startIdx,endIdx;
    int color;

    public void setStartIdx(int index){
        startIdx = index;
    }

    public void setEndIdx(int index){
        endIdx = index;
    }

    public void setColor(int color){
        this.color = color;
    }

    public int getStartIdx(){
        return startIdx;
    }

    public int getEndIdx(){
        return endIdx;
    }

    public int getColor(){
        return color;
    }


}
