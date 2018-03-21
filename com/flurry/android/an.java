package com.flurry.android;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

final class an extends SSLSocketFactory {
    private SSLContext a = SSLContext.getInstance("TLS");

    public an(KeyStore keyStore) {
        super(keyStore);
        i iVar = new i();
        this.a.init(null, new TrustManager[]{iVar}, null);
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.a.getSocketFactory().createSocket(socket, str, i, z);
    }

    public final Socket createSocket() {
        return this.a.getSocketFactory().createSocket();
    }
}
