package io.github.mcengine.api.placeholder.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Placeholder-based API module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide placeholder-related APIs to the system.
 */
public interface IMCEnginePlaceholderAPI {
    /**
     * Called when the Placeholder API is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the API is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Placeholder API instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
