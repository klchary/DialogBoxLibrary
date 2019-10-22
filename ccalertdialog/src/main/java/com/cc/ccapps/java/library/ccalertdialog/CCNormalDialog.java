package com.cc.ccapps.java.library.ccalertdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Objects;

/**
 * Created by CHINNA CHARY on Monday, 21 Oct 2019
 * Project Name AlertDialogLibrary
 * Package Name com.cc.ccapps.java.library.ccalertdialog
 **/
public class CCNormalDialog extends Dialog {

    private Context context;
    private TextView tvTitle;
    private TextView subtitle;
    private TextView tvMessage;
    private ImageView icon;
    private LinearLayout main_frame;

    public CCNormalDialog(@NonNull Context context) {
        super(context);
        this.context = context;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.normal_dialog);
        tvTitle = findViewById(R.id.title);
        subtitle = findViewById(R.id.subtitle);
        tvMessage = findViewById(R.id.message);
        icon = findViewById(R.id.icon);
        main_frame = findViewById(R.id.main_frame);
        Objects.requireNonNull(this.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);

//        initDefaultCase();
        this.setCancelable(true);
    }

    private void initDefaultCase() {
        icon.setVisibility(View.GONE);
        tvTitle.setVisibility(View.GONE);
        subtitle.setVisibility(View.GONE);
    }

    public CCNormalDialog setBackground(int colorResource) {
        main_frame.setBackgroundColor(colorResource);
        return this;
    }

    public CCNormalDialog setBackground(Drawable drawableResource) {
        main_frame.setBackground(drawableResource);
        return this;
    }

    public CCNormalDialog setIcon(Drawable resourceId) {
        icon.setVisibility(View.VISIBLE);
        icon.setImageDrawable(resourceId);
        return this;
    }

    public CCNormalDialog setTitle(String title) {
        tvTitle.setVisibility(View.VISIBLE);
        tvTitle.setText(title);
        return this;
    }

    public CCNormalDialog setTitle(String title, int colorResource) {
        tvTitle.setVisibility(View.VISIBLE);
        tvTitle.setText(title);
        tvTitle.setTextColor(colorResource);
        return this;
    }

    public CCNormalDialog setTitle(String title, int colorResource, int size) {
        tvTitle.setVisibility(View.VISIBLE);
        tvTitle.setText(title);
        tvTitle.setTextColor(colorResource);
        tvTitle.setTextSize(size);
        return this;
    }

    public CCNormalDialog setTitle(String title, int colorResource, int size, int typeface) {
        tvTitle.setVisibility(View.VISIBLE);
        tvTitle.setText(title);
        tvTitle.setTextColor(colorResource);
        tvTitle.setTextSize(size);
        tvTitle.setTypeface(tvTitle.getTypeface(), typeface);
        return this;
    }

    public CCNormalDialog setSubTitle(String subTitle) {
        subtitle.setVisibility(View.VISIBLE);
        subtitle.setText(subTitle);
        return this;
    }

    public CCNormalDialog setSubTitle(String subTitle, int colorResource) {
        subtitle.setVisibility(View.VISIBLE);
        subtitle.setText(subTitle);
        subtitle.setTextColor(colorResource);
        return this;
    }

    public CCNormalDialog setSubTitle(String subTitle, int colorResource, int size) {
        subtitle.setVisibility(View.VISIBLE);
        subtitle.setText(subTitle);
        subtitle.setTextColor(colorResource);
        subtitle.setTextSize(size);
        return this;
    }

    public CCNormalDialog setSubTitle(String subTitle, int colorResource, int size, int typeface) {
        subtitle.setVisibility(View.VISIBLE);
        subtitle.setText(subTitle);
        subtitle.setTextColor(colorResource);
        subtitle.setTextSize(size);
        subtitle.setTypeface(subtitle.getTypeface(), typeface);
        return this;
    }

    public CCNormalDialog setMessage(String message) {
        tvMessage.setVisibility(View.VISIBLE);
        tvMessage.setText(message);
        return this;
    }

    public CCNormalDialog setMessage(String message, int colorResource) {
        tvMessage.setVisibility(View.VISIBLE);
        tvMessage.setText(message);
        tvMessage.setTextColor(colorResource);
        return this;
    }

    public CCNormalDialog setMessage(String message, int colorResource, int size) {
        tvMessage.setVisibility(View.VISIBLE);
        tvMessage.setText(message);
        tvMessage.setTextColor(colorResource);
        tvMessage.setTextSize(size);
        return this;
    }

    public CCNormalDialog setMessage(String message, int colorResource, int size, int typeface) {
        tvMessage.setVisibility(View.VISIBLE);
        tvMessage.setText(message);
        tvMessage.setTextColor(colorResource);
        tvMessage.setTextSize(size);
        tvMessage.setTypeface(tvMessage.getTypeface(), typeface);
        return this;
    }

    public CCNormalDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected CCNormalDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }
}
