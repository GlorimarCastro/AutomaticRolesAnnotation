/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rolesannotation;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;


/**
 * Class for make a url connection with a proxy server
 * @author GL26163
 */
public class ProxyConnection {
    
    //===========================================
    //Field
    //===========================================
    private String              proxyHost;
    private int                 port;
    
    private static ProxyConnection proxyConn = new ProxyConnection();
    
    //===========================================
    //Constructor
    //===========================================
    private ProxyConnection(){}
    
    //===========================================
    //Methods
    //===========================================
    public static ProxyConnection getInstance(){
        return proxyConn;
    }

    /**
     * @return the proxyHost
     */
    public String getProxyHost() {
        return proxyHost;
    }

    public URLConnection getConnection(URL url, boolean withProxy) throws IOException{
        if(withProxy){
            if(proxyHost == null){
                throw new NullPointerException("Proxy host null");
            }
            if( port == 0){
                throw new NullPointerException("Port number have not being set up");
            }

            InetSocketAddress   addr    = new InetSocketAddress(proxyHost, port);
            Proxy               proxy   = new Proxy(Proxy.Type.HTTP, addr);
            URLConnection       conn    = url.openConnection(proxy); 

            //Agaent is system dependent
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:31.0) Gecko/20100101 Firefox/31.0");
            
            return conn;
        }
        
        return url.openConnection();
        
    }
    /**
     * @param proxyHost the proxyHost to set
     */
    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    /**
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }


    
    
}
