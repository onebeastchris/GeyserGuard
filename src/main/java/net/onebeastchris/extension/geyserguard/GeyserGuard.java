package net.onebeastchris.extension.geyserguard;

import net.onebeastchris.extension.geyserguard.config.GeyserGuardConfig;
import net.onebeastchris.extension.geyserguard.utils.StorageLoader;
import org.geysermc.event.subscribe.Subscribe;
import org.geysermc.geyser.api.event.bedrock.SessionInitializeEvent;
import org.geysermc.geyser.api.event.bedrock.SessionLoginEvent;
import org.geysermc.geyser.api.event.lifecycle.GeyserPostInitializeEvent;
import org.geysermc.geyser.api.extension.Extension;
import org.geysermc.geyser.api.extension.ExtensionLogger;
import org.geysermc.geyser.session.GeyserSession;

public class GeyserGuard implements Extension {

    public static ExtensionLogger logger;
    public static GeyserGuardConfig config;

    @Subscribe
    public void onInitializeEvent(GeyserPostInitializeEvent event) {
        logger = logger();
        StorageLoader storageLoader = new StorageLoader();

        //loadConfig();
        logger().info("GeyserGuard has been enabled!");
    }

    @Subscribe
    public void onSessionInit(SessionInitializeEvent event) {
        this.logger().info("Session has been initialized!");
    }

    @Subscribe
    public void onLogin(SessionLoginEvent event) {
        this.logger().info("Player has logged in!");
        GeyserSession session = (GeyserSession) event.connection();
    }

    //@Subscribe
    //public void onCommandDefine(GeyserDefineCommandsEvent event) {
    //    Commands.getCommands(this).forEach(event::register);
    //}

    //public void loadConfig() {
    //    config = ConfigLoader.load(this, GeyserGuard.class, GeyserGuardConfig.class);
    //}
}
