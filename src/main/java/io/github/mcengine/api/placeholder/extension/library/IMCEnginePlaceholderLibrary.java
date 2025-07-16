package io.github.mcengine.api.placeholder.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Interface for Library modules that can be dynamically loaded
 * as part of the Placeholder system in MCEngine.
 */
public interface IMCEnginePlaceholderLibrary {

    /**
     * Called when the Library module is loaded by the AI engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);
}
