package io.github.mcengine.api.placeholder.extension.skript;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Placeholder-based Skript module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate scripted placeholder content into the system.
 */
public interface IMCEnginePlaceholderSkript {
    /**
     * Called when the Placeholder Skript module is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Skript module is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Placeholder Skript instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
