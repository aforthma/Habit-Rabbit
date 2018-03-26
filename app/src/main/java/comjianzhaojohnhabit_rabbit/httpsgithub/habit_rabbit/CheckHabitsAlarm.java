package comjianzhaojohnhabit_rabbit.httpsgithub.habit_rabbit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by notachimo on 3/25/2018.
 */

public class CheckHabitsAlarm extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Alarm","CheckHabitsAlarm has run");
    }
}
