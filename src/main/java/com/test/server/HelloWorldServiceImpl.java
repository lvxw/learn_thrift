package com.test.server;

import com.test.thrift.HelloWorldService;
import org.apache.thrift.TException;

public class HelloWorldServiceImpl implements HelloWorldService.Iface {

    @Override
    public String sayHello() throws TException {
        return "hello world!";
    }
}
