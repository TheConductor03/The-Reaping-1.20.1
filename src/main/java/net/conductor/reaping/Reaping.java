package net.conductor.reaping;

import net.conductor.reaping.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reaping implements ModInitializer {
	public static final String MOD_ID = "reaping";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		ModItems.registerModItems();
	}
}