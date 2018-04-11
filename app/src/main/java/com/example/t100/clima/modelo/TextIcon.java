
package com.example.t100.clima.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TextIcon {

    @SerializedName("icon")
    @Expose
    private Icon icon;
    @SerializedName("text")
    @Expose
    private Text text;

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

}
