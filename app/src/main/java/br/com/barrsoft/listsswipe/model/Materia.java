package br.com.barrsoft.listsswipe.model;

import android.util.Log;

public class Materia {


    public static final String TAG = Materia.class.getName();
    String title;
    String subTitle;
    String body;

    public Materia(String title, String subTitle, String body) {
        this.title = title;
        this.subTitle = subTitle;
        this.body = body;
        Log.i(TAG, "Materia: ");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
