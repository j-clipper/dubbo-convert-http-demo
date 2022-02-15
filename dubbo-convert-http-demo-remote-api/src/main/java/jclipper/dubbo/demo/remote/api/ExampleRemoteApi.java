package jclipper.dubbo.demo.remote.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jclipper.dubbo.demo.model.request.ExampleRequest;
import jclipper.dubbo.demo.model.response.ExampleResponse;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author <a href="mailto:wf2311@163.com">wf2311</a>
 * @since 2021/6/15 14:19.
 */
@Api(tags = "示例Dubbo远程接口")
public interface ExampleRemoteApi {

    @ApiOperation(value = "示例请求")
    @PostMapping("/example/request")
    ExampleResponse example(ExampleRequest request);

    void test();

    void test2();
}

