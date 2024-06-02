package me.phoenix.slimeplugin.core.setup;

import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import me.phoenix.slimeplugin.SlimePlugin;
import me.phoenix.slimeplugin.core.PluginItems;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class PluginItemSetup{

	public static void setup(@Nonnull SlimePlugin plugin) {
		new UnplaceableBlock(PluginItemGroups.PLUGIN_SUB, PluginItems.PLUGIN_EXAMPLE, PluginRecipeType.PLUGIN_EXAMPLE,  new ItemStack[9]).register(plugin);
	}
}
