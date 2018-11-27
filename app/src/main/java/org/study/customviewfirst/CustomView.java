package org.study.customviewfirst;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {

    boolean mShowText;
    int mTextPos;
    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.CustomView,
                0, 0);

        try {
            mShowText = a.getBoolean(R.styleable.CustomView_showText, false);
            mTextPos = a.getInteger(R.styleable.CustomView_labelPosition, 0);
        } finally {
            a.recycle();
        }
    }

    public boolean isShowText() {
        return mShowText;
    }

    public void setShowText(boolean showText) {
        mShowText = showText;
        invalidate();
        requestLayout();
    }
}
