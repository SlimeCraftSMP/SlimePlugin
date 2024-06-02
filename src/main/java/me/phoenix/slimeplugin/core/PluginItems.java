package me.phoenix.slimeplugin.core;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.phoenix.slimelib.visual.Styles;
import me.phoenix.slimeplugin.util.PluginStyles;
import org.bukkit.Material;

public class PluginItems{

	public static final SlimefunItemStack PLUGIN_EXAMPLE = Styles.styledSfItem("PLUGIN_EXAMPLE",
			Material.AIR,
			PluginStyles.EXAMPLE,
			"Example Name",
			"Example Lore"
	);

}
