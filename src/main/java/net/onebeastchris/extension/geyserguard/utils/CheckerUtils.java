package net.onebeastchris.extension.geyserguard.utils;

import org.geysermc.geyser.session.GeyserSession;

import java.util.UUID;

public class CheckerUtils {

    public static Result check(GeyserSession session) {
        String xuid = session.xuid();
        String ip = session.getSocketAddress().getAddress().getHostAddress();
        UUID uuid = session.javaUuid();
        String javaUsername = session.javaUsername();
        String bedrockName = session.bedrockUsername();



        return Result.ALLOWED;
    }

    record Result(boolean allowed, String reason) {
        public static final Result ALLOWED = new Result(true, null);
    }

    public enum Reason {
        IP_BLOCKED,
        XUID_BLOCKED,
        UUID_BLOCKED,
        NAME_BLOCKED,
        NOT_WHITELISTED,
        NOT_ALLOWED
    }
}
