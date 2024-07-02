package me.phoenix.slimeplugin.util;

import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.inventory.ItemStack;

public enum Heads {
	EXAMPLE_NESTED("stuff"),
	EXAMPLE_SUB("stuff");

	private final String texture;

	Heads(String texture) {
		this.texture = texture;
	}

	public String texture() {
		return texture;
	}

	public ItemStack item() {
		return SlimefunUtils.getCustomHead(texture());
	}
}
