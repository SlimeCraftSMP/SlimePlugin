package me.phoenix.slimeplugin.util;

import me.phoenix.slimelib.other.ChatUtils;
import me.phoenix.slimelib.other.KeyUtils;
import me.phoenix.slimelib.visual.Styles;
import net.kyori.adventure.text.Component;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;

public class Utils{

	public static final Component PREFIX = Styles.text("<gold>[</gold><green>Slime</green><aqua>Plugin</aqua><gold>]</gold> ");

	public static void send(Player player, String msg) {
		ChatUtils.send(player, PREFIX, Styles.text(msg));
	}

	public static NamespacedKey key(String key){
		return KeyUtils.createKey("slimeplugin", key);
	}
}
