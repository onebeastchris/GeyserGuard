package net.onebeastchris.extension.geyserguard.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GeyserGuardConfig (
        @JsonProperty("whitelist-enabled") boolean whitelistEnabled,
        @JsonProperty("block-vpn") boolean blockVPN,
        @JsonProperty("vpn-block-threshold") long vpnBlockThreshold,
        @JsonProperty("command-permissions") Commands commands,
        @JsonProperty("messages") Messages messages,
        @JsonProperty("command-feedback") CommandFeedback feedback,
        @JsonProperty("command-descriptions") Descriptions descriptions
) {
    public record Commands (
        @JsonProperty("all-permission") String allPermission,
        @JsonProperty("reload-permission") String reloadPermission,
        @JsonProperty("allow-permission") String allowPermission,
        @JsonProperty("block-permission") String blockPermission,
        @JsonProperty("list-permission") String listPermission
    ) {
    }

    public record Messages (
            @JsonProperty("blocked-ip-message") String blockedIPMessage,
            @JsonProperty("blocked-xuid-message") String blockedXUIDMessage,
            @JsonProperty("blocked-uuid-message") String blockedUUIDMessage,
            @JsonProperty("blocked-name-message") String blockedNameMessage,
            @JsonProperty("not-allowed-message") String notAllowedMessage,
            @JsonProperty("vpn-blocked-message") String vpnBlockedMessage
    ) {
    }

    public record CommandFeedback (
            @JsonProperty("allow-message") String allowMessage,
            @JsonProperty("block-message") String blockMessage,
            @JsonProperty("reload-message") String reloadMessage,
            @JsonProperty("list-message") String listMessage
    ) {
    }

    public record Descriptions (
            @JsonProperty("allow-description") String allowDescription,
            @JsonProperty("block-description") String blockDescription,
            @JsonProperty("reload-description") String reloadDescription,
            @JsonProperty("list-description") String listDescription
    ) {
    }
}

