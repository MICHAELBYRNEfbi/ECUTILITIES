package me.LOC.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
 
public class onCommand extends JavaPlugin {
    @Override
        public void onEnable(){
        getLogger().info("Starting Elite Utils Watchdog");
        getLogger().info("feeding him...");
        getLogger().info("reasurring him...");
        getLogger().info("Testing him");
        getLogger().info("Ouch...");
        getLogger().info("Ok");
        getLogger().info("sending...");
        getLogger().info("Plugin loading complete.");
        }
 
        @Override
        public void onDisable() {
            getLogger().info("Elite Utils is being terminated... it hurts...");
        }
 
        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	    Player player = (Player) sender;
        	if(cmd.getName().equalsIgnoreCase("shop")){  	    
            player.sendMessage(ChatColor.WHITE + "[" + ChatColor.GOLD + ChatColor.BOLD + "EC" + ChatColor.WHITE + "] " + "Now warping to the server shop!");
            player.teleport(new Location(Bukkit.getWorld("world"), 80, 142, 11)); }
            
        }
        if(cmd.getName().equalsIgnoreCase("wild")){       
            player.sendMessage(ChatColor.WHITE + "[" + ChatColor.GOLD + ChatColor.BOLD + "EC" + ChatColor.WHITE + "] " + "Now warping to the Wilderness!");
            player.teleport(new Location(Bukkit.getWorld("world"), 80, 142, 11)); } //Will change this location but idk what it is atm

                        if(cmd.getName().equalsIgnoreCase("clearchat") && p.hasPermission(Clear.Chat) {
             Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage("                                                                                                                                                                                                                                                                                                                    ");
            	Bukkit.broadcastMessage(ChatColor.WHITE + "[" + ChatColor.GREEN + "-" + ChatColor.WHITE + "]" + ChatColor.RED + "The chat has been cleared by" + ChatColor.GREEN + player );
            
            	
            	
            }
            return true;
}

