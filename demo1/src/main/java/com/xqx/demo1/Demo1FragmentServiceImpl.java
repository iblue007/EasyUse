package com.xqx.demo1;

import android.support.v4.app.Fragment;

import com.xqx.baselib.CommonGetFragmetService;

/**
 * Create by xuqunxing on  2019/3/22
 */
public class Demo1FragmentServiceImpl implements CommonGetFragmetService {
    @Override
    public Fragment getCommandFragment() {
        return new Demo1Fragment();
    }
}
