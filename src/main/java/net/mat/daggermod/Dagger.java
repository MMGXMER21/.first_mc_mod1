package net.mat.daggermod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dagger implements ModInitializer {
	public static final String MOD_ID = "daggermod";
    public static final Logger LOGGER = LoggerFactory.getLogger("daggermod");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}