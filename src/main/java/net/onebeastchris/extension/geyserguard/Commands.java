package net.onebeastchris.extension.geyserguard;

import org.geysermc.geyser.api.command.Command;
import org.geysermc.geyser.api.extension.Extension;
import org.geysermc.geyser.command.GeyserCommandSource;

import static net.onebeastchris.extension.geyserguard.GeyserGuard.config;

import java.util.List;

public class Commands {

    /*
     * Returns a list of all commands:
     * /geyserguard allow <player> OR <xuid> OR <ip> OR <uuid>
     * /geyserguard deny <player> OR <xuid> OR <ip> OR <uuid>
     * /geyserguard off/on
     * /geyserguard reload
     * /geyserguard list
     */
    public static List<Command> getCommands(Extension extension) {
        return List.of(
            Command.builder(extension)
                    .name("allow")
                    .description(config.descriptions().allowDescription())
                    .permission(config.commands().allowPermission())
                    .executableOnConsole(true)
                    .suggestedOpOnly(true)
                    .source(GeyserCommandSource.class)
                    .build(),

            Command.builder(extension)
                    .name("block")
                    .description(config.descriptions().blockDescription())
                    .permission(config.commands().blockPermission())
                    .build(),

            Command.builder(extension).build()
        );
    }
}
