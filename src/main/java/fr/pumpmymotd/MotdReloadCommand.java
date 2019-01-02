package fr.pumpmymotd;

import fr.pumpmymotd.motd.PingManager;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class MotdReloadCommand extends Command {

	private PingManager manager;
	
	private MotdReloadCommand(String name) {
		super(name);
	}

	public MotdReloadCommand(String name,PingManager manager) {
		
		this(name);
		this.manager = manager;
		
	}
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		// TODO Auto-generated method stub

	}

}