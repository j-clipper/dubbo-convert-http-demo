package jclipper.dubbo.demo.remote;

import jclipper.dubbo.demo.model.request.ExampleRequest;
import jclipper.dubbo.demo.model.response.ExampleResponse;
import jclipper.dubbo.demo.remote.api.ExampleRemoteApi;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author <a href="mailto:wf2311@163.com">wf2311</a>
 * @since 2021/6/21 14:45.
 */
@DubboService
public class ExampleRemoteService implements ExampleRemoteApi {

    @Override
    public ExampleResponse example(ExampleRequest request) {
        return new ExampleResponse();
    }

    @Override
    public void test() {

    }

    @Override
    public void test2() {

    }
}
