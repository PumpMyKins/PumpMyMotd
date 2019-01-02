package fr.pumpmymotd;

import fr.pumpmymotd.config.ConfigUtils;
import fr.pumpmymotd.motd.PingManager;
import net.md_5.bungee.api.plugin.Plugin;

public class MainMotd extends Plugin{

	private PingManager manager;
	
	@Override
	public void onEnable() {
		
		ConfigUtils config = ConfigUtils.getConfig(this);
		config.initDataFolder();
		
		this.manager = new PingManager(config);
		
		getProxy().getPluginManager().registerListener(this, new ProxyPingListener(manager));
		
	}
	
}
