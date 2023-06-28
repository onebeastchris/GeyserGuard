package net.onebeastchris.extension.geyserguard.utils;

import net.onebeastchris.extension.geyserguard.GeyserGuard;
import net.onebeastchris.extensiondb.api.ExtensionDbApi;
import org.geysermc.api.Geyser;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StorageLoader {

    public StorageLoader() {
        GeyserGuard.logger.info("Calling API..");
        ExtensionDbApi api = ExtensionDbApi.getInstance();
        Connection connection = api.getConnection();

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(
                    "create table if not exists geyserguard_allowedPlayers (bedrockId string, javaUniqueId string, javaUsername string)"
            );
            GeyserGuard.logger.info("Success");
        } catch (SQLException e) {
            GeyserGuard.logger.warning("some warning");
            e.printStackTrace();
        }
    }
}
