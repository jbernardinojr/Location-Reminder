package com.bernardino.reminders.locationreminders.reminderslist

import com.bernardino.reminders.R
import com.bernardino.reminders.base.BaseRecyclerViewAdapter

// Use data binding to show the reminder on the item
class RemindersListAdapter(callBack: (selectedReminder: ReminderDataItem) -> Unit) :
    BaseRecyclerViewAdapter<ReminderDataItem>(callBack) {
    override fun getLayoutRes(viewType: Int) = R.layout.it_reminder
}