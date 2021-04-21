package com.qyngchen.strategy.action;

import com.qyngchen.strategy.entity.TestOneEntity;
import com.qyngchen.strategy.entity.TestTwoEntity;
import com.qyngchen.strategy.enums.TypeEnum;
import com.qyngchen.strategy.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@Api("swaggerDemoController相关的api")
public class TestController {

    @Autowired
    private Map<String, TestService> service;

    @ApiOperation(value = "获取消息")
    @GetMapping("/getMessage/{code}")
    @ResponseBody
    public String getMessage(@PathVariable(name = "code") Integer code) {
        if (code / 2 == 1) {
            TestOneEntity entity = new TestOneEntity();
            entity.setTypeEnum(TypeEnum.TEST_ONE_SER);
            entity.setOne("one");
            return service.get(entity.getTypeEnum().getSerName()).getMessage(entity);
        }else {
            TestTwoEntity entity = new TestTwoEntity();
            entity.setTypeEnum(TypeEnum.TEST_TWO_SER);
            entity.setTwo("two");
            return service.get(entity.getTypeEnum().getSerName()).getMessage(entity);
        }
    }
}
