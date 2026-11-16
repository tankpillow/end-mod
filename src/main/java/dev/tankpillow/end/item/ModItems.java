package dev.tankpillow.end.item;

import java.util.function.Function;

import dev.tankpillow.end.TanksEndUpdate;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItems {

	public static final Item UMBRAL_SHARD = registerItem("umbral_shard", Item::new);
	
	private static Item registerItem(String name, Function<Item.Properties, Item> func) {
		return Registry.register(BuiltInRegistries.ITEM, TanksEndUpdate.id(name), 
				func.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, TanksEndUpdate.id(name)))));
	}
	
	public static void register() {
		TanksEndUpdate.LOGGER.info("Registering Mod Items for " + TanksEndUpdate.MOD_ID);
		
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
			output.accept(UMBRAL_SHARD);
		});
	}
	
}
