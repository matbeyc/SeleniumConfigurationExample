package config;

import com.typesafe.config.Config;

public class ReadConfig {
    private static final Config config = ConfigProvider.getConfig();

    public static String getBaseUrl() {
        return config.getString("baseUrl");
    }
}
