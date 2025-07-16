package io.github.mcengine.api.placeholder;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * The {@code MCEnginePlaceholderApi} class provides a centralized system
 * for registering and translating placeholders across all MCEngine plugins.
 *
 * <p>Plugins can register their own placeholders using a key and a resolver function.
 * These placeholders can then be dynamically replaced in messages using the player context.</p>
 */
public class MCEnginePlaceholderApi {

    /**
     * A map to store placeholder keys and their corresponding resolver functions.
     */
    private static final Map<String, Function<Player, String>> placeholders = new HashMap<>();

    /**
     * Registers a placeholder.
     *
     * @param key      The placeholder key, e.g. {@code "%mcengine_currency%"}
     * @param resolver A function that takes a {@link Player} and returns the value for that placeholder
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
