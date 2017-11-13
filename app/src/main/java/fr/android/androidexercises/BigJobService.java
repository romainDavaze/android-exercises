package fr.android.androidexercises;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by romain on 11/10/17.
 */

public class BigJobService extends IntentService {

    public BigJobService() {
        super(BigJobService.class.getSimpleName());
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        long endtime = System.currentTimeMillis() + 5 * 1000;
        try {
            wait(endtime - System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Toast.makeText(this, "It's done", Toast.LENGTH_SHORT).show();
    }
}
