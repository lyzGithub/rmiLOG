package client;

import server.remoteInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by ubuntu2 on 6/17/17.
 */
public class rmiClient {
        public static void main(String args[]){
            try {
                //在RMI服务注册表中查找名称为RHello的对象，并调用其上的方法
                remoteInterface rhello =(remoteInterface) Naming.lookup("rmi://localhost:8888/RHello");
                System.out.println(rhello.helloWorld());
                System.out.println(rhello.sayHelloToSomeBody("boy!"));
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }