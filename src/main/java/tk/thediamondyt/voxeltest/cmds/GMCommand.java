package tk.thediamondyt.voxeltest.cmds;

import com.voxelwind.api.server.Player;
import com.voxelwind.api.server.command.CommandExecutor;
import com.voxelwind.api.server.command.CommandExecutorSource;
import com.voxelwind.api.server.player.GameMode;

public class GMCommand implements CommandExecutor {

    @Override
    public void execute(CommandExecutorSource source, String[] args) throws Exception {
        if (source instanceof Player) {
            Player player = (Player) source;
            GameMode mode;

            switch(Integer.parseInt(args[0])) {
                case 0:
                    mode = GameMode.SURVIVAL;
                    break;
                case 1:
                    mode = GameMode.CREATIVE;
                    break;
                case 2:
                    mode = GameMode.ADVENTURE;
                    break;
                case 3:
                    mode = GameMode.SPECTATOR;
                    break;
                default:
                    mode = GameMode.SURVIVAL;
            }

            player.setGameMode(mode);
            player.sendMessage("Gamemode set to " + args[0]);
        }
    }
}
