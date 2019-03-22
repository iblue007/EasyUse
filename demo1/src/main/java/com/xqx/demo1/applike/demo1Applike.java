package com.xqx.demo1.applike;

import com.xqx.baselib.CommonGetFragmetService;
import com.xqx.baselib.IApplicationLike;
import com.xqx.baselib.Router;
import com.xqx.demo1.Demo1FragmentServiceImpl;

/**
 * Create by xuqunxing on  2019/3/22
 */
public class demo1Applike implements IApplicationLike{

    Router router = Router.getInstance();
    @Override
    public void onCreate() {
        router.addService(CommonGetFragmetService.class.getSimpleName(), new Demo1FragmentServiceImpl());
    }

    @Override
    public void onStop() {

    }
}
