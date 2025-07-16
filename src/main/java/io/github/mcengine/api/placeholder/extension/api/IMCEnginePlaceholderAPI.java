package io.github.mcengine.api.placeholder.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Interface for AI modules that can be dynamically loaded
 * as part of the Placeholder API system in MCEngine.
 */
public interface IMCEnginePlaceholderAPI {

    /**
     * Called when the API module is loaded by the AI engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);
}
