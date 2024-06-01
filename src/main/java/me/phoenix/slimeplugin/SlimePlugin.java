package me.phoenix.slimeplugin;

import me.phoenix.slimelib.config.Config;
import me.phoenix.slimelib.metrics.MetricsService;
import me.phoenix.slimelib.metrics.chart.pie.SimplePie;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class SlimePlugin extends JavaPlugin {

    // Important
    private static SlimePlugin instance;

    // Configuration
    private final Config config = new Config(this, "config.yml", -1);

    // Service
    private final MetricsService metrics = new MetricsService(this, 0);

    public SlimePlugin(){ instance = this;}

    public static SlimePlugin instance(){ return instance;}

    public static Logger logger(){ return instance.getLogger();}
    
    @Override
    public void onEnable() {
        sendStartupMessage();
        setupMetrics();
        setupEvents();
    }

    @Override
    public void onDisable() {
        cancelAllTasks();
        sendGoodByeMessage();
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

    private void sendStartupMessage(){
        logo();
    }

    private void setupMetrics(){
        metrics.addCustomChart(
                new SimplePie("auto_update",
                        () -> config.booleanValue("options.auto-update") ? "Enabled" : "Disabled"
                )
        );
    }

    private void setupEvents(){
        // Here
    }

    private void cancelAllTasks(){
        Bukkit.getScheduler().cancelTasks(instance);
    }

    private void sendGoodByeMessage(){
        logo();
    }
}
