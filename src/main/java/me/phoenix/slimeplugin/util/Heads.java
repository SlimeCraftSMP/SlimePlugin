package me.phoenix.slimeplugin.util;

import javax.annotation.Nonnull;

import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.inventory.ItemStack;

public enum Heads {

	EXAMPLE_NESTED("stuff"),
	EXAMPLE_SUB("stuff");

	private final String texture;

	Heads(@Nonnull String texture) {
		this.texture = texture;
	}

	public @Nonnull String texture() {
		return texture;
	}

	public @Nonnull ItemStack item() {
		return SlimefunUtils.getCustomHead(texture());
	}

}
