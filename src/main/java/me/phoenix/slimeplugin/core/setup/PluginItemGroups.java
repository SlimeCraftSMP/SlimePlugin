package me.phoenix.slimeplugin.core.setup;

import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import me.phoenix.slimelib.item.CustomItem;
import me.phoenix.slimeplugin.util.Heads;
import me.phoenix.slimeplugin.util.Utils;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public class PluginItemGroups{

	// Main (Nested) Item Group
	public static final NestedItemGroup PLUGIN_NESTED = new NestedItemGroup(Utils.key("PLUGIN_NESTED"),
			new CustomItem(Heads.EXAMPLE_NESTED.item(), Utils.PREFIX));

	// Sub Item Groups
	public static final SubItemGroup PLUGIN_SUB = new SubItemGroup(Utils.key("PLUGIN_SUB"), PLUGIN_NESTED,
			new CustomItem(Heads.EXAMPLE_SUB.item(), Utils.PREFIX.append(Component.text("Subgroup", NamedTextColor.GOLD))));

}
