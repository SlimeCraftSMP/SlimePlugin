package me.phoenix.slimeplugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.phoenix.slimelib.addon.SlimeAddon;
import me.phoenix.slimelib.config.Config;
import me.phoenix.slimelib.metrics.MetricsService;
import me.phoenix.slimelib.metrics.chart.pie.SimplePie;
import me.phoenix.slimeplugin.core.setup.PluginItemSetup;
import org.bukkit.NamespacedKey;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

public final class SlimePlugin extends SlimeAddon implements SlimefunAddon{

    // Important
    private static SlimePlugin instance;

    // Configuration
    private Config config;

    public static SlimePlugin instance(){
        return instance;
    }

    public static Logger logger(){
        return instance.getLogger();
    }

    public static NamespacedKey key(String string){
        return new NamespacedKey(instance, string);
    }

    @Override
    public void onPluginLoad(){
        instance = (SlimePlugin) SlimeAddon.instance();
    }

    @Override
    public void onPluginEnable(){
        setupItems();
        logo();
    }

    @Override
    public void onPluginDisable(){
        logo();
    }

    @Override
    public void setupConfigs(){
        config = new Config(instance, "config.yml");
    }

    @Override
    public void setupMetrics(){
        final MetricsService metrics = new MetricsService(instance, 0);
        metrics.addCustomChart(
                new SimplePie("auto_update",
                        () -> config.getBoolean("options.auto-update") ? "Enabled" : "Disabled"
                )
        );
    }

    @Override
    public void setupEvents(){
        // Here
    }

    private void logo(){
        // Use https://www.patorjk.com/software/taag/#p=display&f=ANSI%20Shadow&t=SlimePlugin
        logger().info("███████╗██╗     ██╗███╗   ███╗███████╗██████╗ ██╗     ██╗   ██╗ ██████╗ ██╗███╗   ██╗");
        logger().info("██╔════╝██║     ██║████╗ ████║██╔════╝██╔══██╗██║     ██║   ██║██╔════╝ ██║████╗  ██║");
        logger().info("███████╗██║     ██║██╔████╔██║█████╗  ██████╔╝██║     ██║   ██║██║  ███╗██║██╔██╗ ██║");
        logger().info("╚════██║██║     ██║██║╚██╔╝██║██╔══╝  ██╔═══╝ ██║     ██║   ██║██║   ██║██║██║╚██╗██");
        logger().info("███████║███████╗██║██║ ╚═╝ ██║███████╗██║     ███████╗╚██████╔╝╚██████╔╝██║██║ ╚████║");
        logger().info("╚══════╝╚══════╝╚═╝╚═╝     ╚═╝╚══════╝╚═╝     ╚══════╝ ╚═════╝  ╚═════╝ ╚═╝╚═╝  ╚═══╝");
    }

    @Override
    public void onReload(CommandSender commandSender){
        config.reload();
    }

    private void setupItems(){
        PluginItemSetup.setup(instance());
    }

    @NotNull
    @Override
    public JavaPlugin getJavaPlugin(){
        return instance;
    }

    @Override
    public String getBugTrackerURL(){
        return "https://github.com/PhoenixCodingStuff/SlimePlugin";
    }
}
