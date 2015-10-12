package com.github.shareme.gwsmaterialcalendarview.library.format;

import android.support.annotation.NonNull;

import com.github.shareme.gwsmaterialcalendarview.library.CalendarDay;
import com.github.shareme.gwsmaterialcalendarview.library.MaterialCalendarView;

import java.text.SimpleDateFormat;

/**
 * Supply labels for a given day. Default implementation is to format using a {@linkplain SimpleDateFormat}
 */
public interface DayFormatter {

    /**
     * Format a given day into a string
     *
     * @param day the day
     * @return a label for the day
     */
    @NonNull String format(@NonNull CalendarDay day);

    /**
     * Default implementation used by {@linkplain MaterialCalendarView}
     */
    DayFormatter DEFAULT = new DateFormatDayFormatter();
}
