package com.test.server;

import com.test.thrift.HelloWorldService;
import org.apache.thrift.TProcessor;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;

public class MyServer {
    public static void main(String[] args) throws Exception {
        TProcessor tProcessor = new HelloWorldService.Processor<HelloWorldService.Iface>(new HelloWorldServiceImpl());
        TServerSocket serverTransport = new TServerSocket(9090);
        TServer.Args tArgs = new TServer.Args(serverTransport);

        tArgs.processor(tProcessor);

        TServer tServer  = new TSimpleServer(tArgs);
        tServer.serve();

    }

}
