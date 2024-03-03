package org.example;

import net.ipatlas.readersdk.reader.DatabaseReader;
import net.ipatlas.readersdk.reader.DatabaseReaderBuilder;
import net.ipatlas.readersdk.reader.model.GeolocationData;

import java.util.Optional;

public class SdkFeaturesExamples {
    private static final String DATABASE_PATH = "path/to/database/dynamic-plus-db-20240302.ipatlas";

    public void getDatabaseMetadata() {
        DatabaseReader databaseReader = new DatabaseReaderBuilder()
                .databasePath(DATABASE_PATH)
                .build();

        System.out.println(databaseReader.getDatabaseBuildDate());
        System.out.println(databaseReader.getDatabaseName());
    }

    public void addAndConsumeOverrides() {
        DatabaseReader databaseReader = new DatabaseReaderBuilder()
                .databasePath(DATABASE_PATH)
                .build();

        GeolocationData geolocationData = new GeolocationData();
        geolocationData.setRequestedAddress("101.98.226.225");

        databaseReader.addOverride(geolocationData);

        Optional<GeolocationData> optional = databaseReader.resolveIp("101.98.226.225");
        if (optional.isPresent()) {
            geolocationData = optional.get();
            System.out.println(geolocationData.getLocationInfo());
            System.out.println(geolocationData.getInternetServiceProvider());
            System.out.println(geolocationData.getProxy());
            System.out.println(geolocationData.getRequestedAddress());
            System.out.println(geolocationData.getRequestedAddressVersion());
        }
    }
}
