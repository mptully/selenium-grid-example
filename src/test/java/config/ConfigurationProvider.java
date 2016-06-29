package config;

import com.google.inject.Provider;

/**
 * Created by matttully on 29/06/2016.
 */
public class ConfigurationProvider implements Provider<Configuration> {

    public Configuration get() {
        try {
            return Configuration.getConfiguration();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
