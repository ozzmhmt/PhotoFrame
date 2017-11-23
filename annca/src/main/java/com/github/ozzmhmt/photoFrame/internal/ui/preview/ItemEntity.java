package io.github.memfis19.annca.internal.ui.preview;

import android.graphics.drawable.Drawable;

/**
 * Created by mehmet on 23.11.2017.
 */

public class ItemEntity {
    public int iconId;
    public  int frameId;
    public String title;

    public ItemEntity(int iconId,int frameId,String title){
        this.iconId=iconId;
        this.frameId=frameId;
        this.title=title;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public int getFrameId() {
        return frameId;
    }

    public void setFrameId(int frameId) {
        this.frameId = frameId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
