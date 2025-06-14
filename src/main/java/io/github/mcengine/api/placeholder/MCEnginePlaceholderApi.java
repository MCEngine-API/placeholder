package io.github.mcengine.api.placeholder;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * The MCEnginePlaceholderApi class provides a centralized system
 * for registering and translating placeholders across all MCEngine plugins.
 *
 * Plugins can register their own placeholders using a key and a resolver function.
 * These placeholders can then be dynamically replaced in messages using player context.
 */
public class MCEnginePlaceholderApi {

    // Static instance for singleton access
    private static MCEnginePlaceholderApi instance;

    // Reference to the plugin using this API
    private final Plugin plugin;

    // Map to store placeholder keys and their corresponding function
    private static final Map<String, Function<Player, String>> placeholders = new HashMap<>();

    /**
     * Constructs the placeholder API instance and links it to the given plugin.
     * This should be initialized once from the core or central plugin (e.g., MCEngine).
     *
     * @param plugin The Bukkit plugin instance using this API.
     */
    public MCEnginePlaceholderApi(Plugin plugin) {
        instance = this;
        this.plugin = plugin;
    }

    /**
     * Gets the global API singleton instance.
     *
     * @return The {@link MCEnginePlaceholderApi} instance.
     */
    public static MCEnginePlaceholderApi getApi() {
        return instance;
    }

    /**
     * Gets the plugin instance that initialized this API.
     *
     * @return The {@link Plugin} linked to this API.
     */
    public Plugin getPlugin() {
        return plugin;
    }

    /**
     * Registers a placeholder.
     *
     * @param key      The placeholder key, e.g. "%mcengine_currency%"
     * @param resolver A function that takes a Player and returns the value for that placeholder
     */
    public static void registerPlaceholder(String key, Function<Player, String> resolver) {
        placeholders.put(key, resolver);
    }

    /**
     * Replaces all registered placeholders in the given text for a specific player.
     *
     * @param player The player context for the placeholder
     * @param text   The text containing placeholders
     * @return The translated text with all registered placeholders resolved
     */
    public static String translate(Player player, String text) {
        String result = text;
        for (Map.Entry<String, Function<Player, String>> entry : placeholders.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().apply(player);
            result = result.replace(key, value);
        }
        return result;
    }
}
