package kr.bearkinf.yena.backkey_library_java;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by jojaeyeong-pc on 2018. 4. 17..
 */

public class BackKeyFinishHandler {

    private long endTime = 2000;

    private long backKeyFinishTime = 0;

    private Context mContext;

    private Toast mToast;

    public BackKeyFinishHandler(Context context) {
        this.mContext = context;
    }

    public BackKeyFinishHandler(Context context, long endTime) {
        this(context);
        this.endTime = endTime;
    }

    public void onBackPressed() {

        if (System.currentTimeMillis() > backKeyFinishTime + endTime) {
            backKeyFinishTime = System.currentTimeMillis();
            showToast();
            return;
        }

        if (System.currentTimeMillis() <= backKeyFinishTime + endTime) {
            mToast.cancel();
            ((Activity) mContext).finish();
        }
    }
    private void showToast() {
        mToast = Toast.makeText(mContext, "\'뒤로\'버튼을 한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT);
        mToast.show();
    }
}
