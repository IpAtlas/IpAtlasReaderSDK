package org.example;

import net.ipatlas.readersdk.reader.ProxyDatabaseReader;
import net.ipatlas.readersdk.reader.ProxyDatabaseReaderBuilder;
import net.ipatlas.readersdk.reader.model.ProxyData;

import java.io.FileNotFoundException;
import java.util.Optional;

public class ProxyDatabaseExample {
    private static final String DATABASE_PATH = "path/to/database/ip-proxy-database-20240414.ipatlas";

    /**
     * Load and consume the proxy database from the file system.
     */
    public void LoadAndConsumeDatabase() {
        ProxyDatabaseReader proxyDatabaseReader = new ProxyDatabaseReaderBuilder()
                .databasePath(DATABASE_PATH)
                .build();

        Optional<ProxyData> optional = proxyDatabaseReader.resolveProxy("101.98.226.225");
        if (optional.isPresent()) {
            ProxyData proxyData = optional.get();

            System.out.println(proxyData.getProxyType());
            System.out.println(proxyData.getIpAddress());
            System.out.println(proxyData.getSubnet());
        }
    }

    /**
     * Load and consume the proxy database from the license key. This method requires an internet connection to download the database.
     */
    public void LoadFromKeyAndConsumeDatabase() throws FileNotFoundException {
        ProxyDatabaseReader proxyDatabaseReader = new ProxyDatabaseReaderBuilder()
                .databaseLicenseKey("your-database-license-key")
                .databaseDownloadLocation("path/to/download/database")
                .build();

        Optional<ProxyData> optional = proxyDatabaseReader.resolveProxy("101.98.226.225");
        if (optional.isPresent()) {
            ProxyData proxyData = optional.get();

            System.out.println(proxyData.getProxyType());
            System.out.println(proxyData.getIpAddress());
            System.out.println(proxyData.getSubnet());
        }
    }
}
