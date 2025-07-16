package io.github.mcengine.api.placeholder.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Interface for DLC modules that can be dynamically loaded
 * as part of the Placeholder system in MCEngine.
 */
public interface IMCEnginePlaceholderDLC {

    /**
     * Called when the DLC is loaded by the AI engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);
}
