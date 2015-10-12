package com.github.shareme.gwsmaterialcalendarview.decorators;


import com.github.shareme.gwsmaterialcalendarview.library.CalendarDay;
import com.github.shareme.gwsmaterialcalendarview.library.DayViewDecorator;
import com.github.shareme.gwsmaterialcalendarview.library.DayViewFacade;
import com.github.shareme.gwsmaterialcalendarview.library.spans.DotSpan;

import java.util.Collection;
import java.util.HashSet;

/**
 * Decorate several days with a dot
 */
public class EventDecorator implements DayViewDecorator {

    private int color;
    private HashSet<CalendarDay> dates;

    public EventDecorator(int color, Collection<CalendarDay> dates) {
        this.color = color;
        this.dates = new HashSet<>(dates);
    }

    @Override
    public boolean shouldDecorate(CalendarDay day) {
        return dates.contains(day);
    }

    @Override
    public void decorate(DayViewFacade view) {
        view.addSpan(new DotSpan(5, color));
    }
}
