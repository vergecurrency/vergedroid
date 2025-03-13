package com.vergepay.stratumj;

/**
 * @author John L. Jegutanis
 */
final public class ServerAddress {
    final private String host;
    final private int port;
    final private boolean useSSL;

    public ServerAddress(String host, int port, boolean useSSL) {
        this.host = host;
        this.port = port;
        this.useSSL = useSSL;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public boolean isUseSSL() {
        return useSSL;
    }

    @Override
    public String toString() {
        return "ServerAddress{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", useSSL=" + useSSL +
                '}';
    }
}
