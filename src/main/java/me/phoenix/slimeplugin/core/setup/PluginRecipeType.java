package me.phoenix.slimeplugin.core.setup;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.phoenix.slimeplugin.core.PluginItems;
import me.phoenix.slimeplugin.util.Utils;

public class PluginRecipeType{

	public static final RecipeType PLUGIN_EXAMPLE = new RecipeType(
			Utils.key("PLUGIN_EXAMPLE"),
			PluginItems.PLUGIN_EXAMPLE
	);

}
