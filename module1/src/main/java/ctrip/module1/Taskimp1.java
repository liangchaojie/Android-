package ctrip.module1;


import android.content.Context;

import ctrip.business.event.TaskDistribution;

/**
 * Description
 * Created by Administrator
 * Time 2017/12/9  18:08
 */

public class Taskimp1 implements TaskDistribution{

    @Override
    public void distribution(Context context, String flag, Object... objects) {
        if(flag.endsWith("login")){
            //跳转到登录页面
            //context.startActivity(...);
        }
    }
}
