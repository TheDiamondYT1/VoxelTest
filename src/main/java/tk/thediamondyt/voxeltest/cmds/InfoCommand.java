package tk.thediamondyt.voxeltest.cmds;

import com.voxelwind.api.server.Player;
import com.voxelwind.api.server.Server;
import com.voxelwind.api.server.command.CommandExecutor;
import com.voxelwind.api.server.command.CommandExecutorSource;

public class InfoCommand implements CommandExecutor {

    private Server server;

    public InfoCommand(Server server) {
        this.server = server;
    }

    @Override
    public void execute(CommandExecutorSource source, String[] args) throws Exception {
        if (source instanceof Player) {
            Player player = (Player) source;

            player.sendMessage("Username: " + player.getName());
            player.sendMessage("Invisible: " + player.isInvisible());
            player.sendMessage("Sneaking: " + player.isSneaking());
            player.sendMessage("GameMode: " + player.getGameMode().toString().toLowerCase());
            player.sendMessage("Server version: " + server.getVersion());
        }
    }
}
