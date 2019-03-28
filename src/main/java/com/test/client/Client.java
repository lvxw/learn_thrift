package com.test.client;

import com.test.thrift.HelloWorldService;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class Client {
    public static void main(String[] args) throws Exception{
        TTransport tTransport = new TSocket("localhost",9090);

        TProtocol tProtocol = new TBinaryProtocol(tTransport);

        HelloWorldService.Client client = new HelloWorldService.Client(tProtocol);

        tTransport.open();
        String result = client.sayHello();
        System.out.println(result);
        tTransport.close();
    }
}
