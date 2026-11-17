package dev.tankpillow.end;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.tankpillow.end.creativemodetab.ModCreativeModeTabs;
import dev.tankpillow.end.item.ModItems;

public class TanksEndUpdate implements ModInitializer {
	
	public static final String MOD_ID = "tanks-end-update";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.register();
		ModItems.register();
		
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
