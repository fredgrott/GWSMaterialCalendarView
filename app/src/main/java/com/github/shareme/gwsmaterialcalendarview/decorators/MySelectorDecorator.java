package com.github.shareme.gwsmaterialcalendarview.decorators;

import android.app.Activity;
import android.graphics.drawable.Drawable;

import com.github.shareme.gwsmaterialcalendarview.R;
import com.github.shareme.gwsmaterialcalendarview.library.CalendarDay;
import com.github.shareme.gwsmaterialcalendarview.library.DayViewDecorator;
import com.github.shareme.gwsmaterialcalendarview.library.DayViewFacade;


/**
 * Use a custom selector
 */
public class MySelectorDecorator implements DayViewDecorator {

    private final Drawable drawable;

    public MySelectorDecorator(Activity context) {
        drawable = context.getResources().getDrawable(R.drawable.my_selector);
    }

    @Override
    public boolean shouldDecorate(CalendarDay day) {
        return true;
    }

    @Override
    public void decorate(DayViewFacade view) {
        view.setSelectionDrawable(drawable);
    }
}
