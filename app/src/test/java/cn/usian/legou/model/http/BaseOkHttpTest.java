package cn.usian.legou.model.http;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import cn.usian.legou.model.http.callback.ResultCallBack;

/**
 * Created by TuLing on 2017/3/10.
 */
public class BaseOkHttpTest {

    private BaseOkHttp baseOkHttp;
    @Before
    public void setUp() throws Exception{
        baseOkHttp = BaseOkHttp.getInstance();
    }

    @Test
    public void testGet() throws Exception {

    }

    @Test
    public void testPost() throws Exception {

        String url = "http://shopapi.yasite.net/index.php/goodController/getGoodList";
        Map<String,String> params = new HashMap<>();
        params.put("page","1");
        baseOkHttp.post(url, params, new ResultCallBack<String>() {
            @Override
            public void onSuccess(String data) {
                Assert.assertNotNull("哥们儿你挂了",data);
            }

            @Override
            public void onError(String errorMsg, String errorCode) {

            }
        });

    }
}