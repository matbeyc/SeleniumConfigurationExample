package config;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ConfigProvider {

    static Config getConfig() {
        if (System.getProperty("env").equals("dev")) {
            return ConfigFactory.load("dev.conf");
        } else if (System.getProperty("env").equals("prod")) {
            return ConfigFactory.load("prod.conf");
        }
        throw new RuntimeException("enviroment is not exists");
    }
}
