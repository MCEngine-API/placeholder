package io.github.mcengine.api.placeholder.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Placeholder-based Library module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide placeholder-related library support to the system.
 */
public interface IMCEnginePlaceholderLibrary {
    /**
     * Called when the Placeholder Library is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Library is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Placeholder Library instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
