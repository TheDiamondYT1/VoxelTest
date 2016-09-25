package tk.thediamondyt.voxeltest;

import com.voxelwind.api.plugin.Plugin;
import com.voxelwind.api.server.Server;

import org.slf4j.Logger;

import tk.thediamondyt.voxeltest.cmds.*;

import javax.inject.Inject;

@Plugin(id = "VoxelTest", author = "TheDiamondYT", version = "0.1")
public class Main {

    private final Logger logger;
    private final Server server;

    @Inject
    public Main(Logger logger, Server server) {
        this.logger = logger;
        this.server = server;

        server.getCommandManager().register("gm", new GMCommand()); // Gamemode changing
        server.getCommandManager().register("info", new InfoCommand(server)); // Player / Server info
        server.getCommandManager().register("kick", new KickCommand()); // Disconnect from server
    }
}
