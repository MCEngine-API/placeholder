package io.github.mcengine.api.placeholder.extension.addon;

import org.bukkit.plugin.Plugin;

/**
 * Interface for AddOn modules that can be dynamically loaded
 * as part of the Placeholder system in MCEngine.
 */
public interface IMCEnginePlaceholderAddOn {

    /**
     * Called when the AddOn is loaded by the AI engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);
}
