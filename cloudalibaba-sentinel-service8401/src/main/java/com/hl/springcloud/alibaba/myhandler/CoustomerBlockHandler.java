package com.hl.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hl.springcloud.entities.CommonResult;

/**
 * @Auther: panhongtong
 * @Date: 2020/3/17 16:30
 * @Description:
 */
public class CoustomerBlockHandler {

    //自定义的方法参数一定要有 BlockException
    public static CommonResult coustomerBlockHandler1(BlockException exception) {
        return new CommonResult(4444, "自定义限流兜底方法-------------1");
    }

    public static CommonResult coustomerBlockHandler2(BlockException exception) {
        return new CommonResult(4444, "自定义限流兜底方法-------------2");
    }
}
