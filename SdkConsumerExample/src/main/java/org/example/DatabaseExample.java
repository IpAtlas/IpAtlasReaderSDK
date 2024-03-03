package org.example;

import net.ipatlas.readersdk.reader.DatabaseReader;
import net.ipatlas.readersdk.reader.DatabaseReaderBuilder;
import net.ipatlas.readersdk.reader.model.GeolocationData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Optional;

public class DatabaseExample {
    private static final String DATABASE_PATH = "path/to/database/dynamic-plus-db-20240302.ipatlas";

    public void LoadAndConsumeDatabase() {
        DatabaseReader databaseReader = new DatabaseReaderBuilder()
                .databasePath(DATABASE_PATH)
                .build();

        Optional<GeolocationData> optional = databaseReader.resolveIp("101.98.226.225");
        if (optional.isPresent()) {
            GeolocationData geolocationData = optional.get();
            System.out.println(geolocationData.getLocationInfo());
            System.out.println(geolocationData.getInternetServiceProvider());
            System.out.println(geolocationData.getProxy());
            System.out.println(geolocationData.getRequestedAddress());
            System.out.println(geolocationData.getRequestedAddressVersion());
        }
    }

    public void LoadFromInputStreamAndConsumeDatabase() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream(DATABASE_PATH);
        DatabaseReader databaseReader = new DatabaseReaderBuilder()
                .databaseInputStream(inputStream)
                .build();

        Optional<GeolocationData> optional = databaseReader.resolveIp("101.98.226.225");
        if (optional.isPresent()) {
            GeolocationData geolocationData = optional.get();
            System.out.println(geolocationData.getLocationInfo());
            System.out.println(geolocationData.getInternetServiceProvider());
            System.out.println(geolocationData.getProxy());
            System.out.println(geolocationData.getRequestedAddress());
            System.out.println(geolocationData.getRequestedAddressVersion());
        }
    }

    public void LoadFromKeyAndConsumeDatabase() throws FileNotFoundException {
        DatabaseReader databaseReader = new DatabaseReaderBuilder()
                .databaseKey("your-database-key")
                .build();

        Optional<GeolocationData> optional = databaseReader.resolveIp("101.98.226.225");
        if (optional.isPresent()) {
            GeolocationData geolocationData = optional.get();
            System.out.println(geolocationData.getLocationInfo());
            System.out.println(geolocationData.getInternetServiceProvider());
            System.out.println(geolocationData.getProxy());
            System.out.println(geolocationData.getRequestedAddress());
            System.out.println(geolocationData.getRequestedAddressVersion());
        }
    }
}
