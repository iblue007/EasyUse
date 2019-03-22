package com.xqx.easyuse;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.xqx.baselib.CommonGetFragmetService;
import com.xqx.baselib.Router;
@Route(path = "/app/mainactivity")
public class MainActivity extends AppCompatActivity {

    Fragment fragment;
    FragmentTransaction ft;
    private Router router;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        router = Router.getInstance();
        if (fragment != null) {
            ft = getSupportFragmentManager().beginTransaction();
            ft.remove(fragment).commit();
            fragment = null;
        }

        if (router.getService(CommonGetFragmetService.class.getSimpleName()) != null) {
            CommonGetFragmetService service = (CommonGetFragmetService) router.getService(CommonGetFragmetService.class.getSimpleName());
            fragment = service.getCommandFragment();
            ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.framelayout, fragment).commitAllowingStateLoss();
        }
    }

    public void openDemo1(View view){
        ARouter.getInstance().build("/demo1/demo1mainactivity").navigation();
    }
}
