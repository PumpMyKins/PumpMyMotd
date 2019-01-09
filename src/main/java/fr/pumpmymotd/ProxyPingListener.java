package fr.pumpmymotd;

import fr.pumpmymotd.motd.Ping;
import fr.pumpmymotd.motd.PingManager;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.ServerPing.Protocol;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class ProxyPingListener implements Listener {
	
	private PingManager manager;

	public PingManager getManager() {
		return manager;
	}

	public ProxyPingListener(PingManager manager) {
		this.manager = manager;
	}
	
	@EventHandler
	public void onProxyPing(ProxyPingEvent event) {
		
		String host = event.getConnection().getVirtualHost().getHostString();
		Ping ping = this.manager.getPing(host);
		
		ServerPing serverPing = event.getResponse();
		
		serverPing.setDescription("Test");
		serverPing.setVersion(new Protocol("Reboot en cours", -1));
		
		event.setResponse(serverPing);				
		
	}
	
}
