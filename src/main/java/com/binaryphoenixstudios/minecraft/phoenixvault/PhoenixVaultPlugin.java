package com.binaryphoenixstudios.minecraft.phoenixvault;

import com.binaryphoenixstudios.minecraft.phoenixvault.api.DefaultPhoenixVaultAPI;
import com.binaryphoenixstudios.minecraft.phoenixvault.api.PhoenixVaultAPI;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Map;

public class DefaultPhoenixVaultPlugin extends JavaPlugin implements PhoenixVaultPlugin
{

	@Override
	public void onEnable()
	{
		super.onEnable();
		createDataFolder();
	}

	protected void createDataFolder()
	{
		String path = Bukkit.getPluginManager().getPlugin(PhoenixVaultPlugin.NAME).getDataFolder().toString();
		File directory = new File(path);
		if (!directory.exists())
		{
			directory.mkdir();
		}
	}


}
