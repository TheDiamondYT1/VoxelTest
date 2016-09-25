package tk.thediamondyt.voxeltest.cmds;

import com.voxelwind.api.server.Player;
import com.voxelwind.api.server.command.CommandExecutor;
import com.voxelwind.api.server.command.CommandExecutorSource;

public class KickCommand implements CommandExecutor {

    @Override
    public void execute(CommandExecutorSource source, String[] args) throws Exception {
        if (source instanceof Player) {
            Player player = (Player) source;

            if(args.length == 0) {
                player.disconnect("You have been kicked lol");
            } else {
                StringBuilder sb = new StringBuilder();
                for(String arg : args)
                {
                    sb.append(arg + " ");
                }
                
                player.disconnect(sb.toString().replace("&", " §"));
            }
        }
    }
}
