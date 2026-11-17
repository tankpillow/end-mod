package dev.tankpillow.end.creativemodetab;

import dev.tankpillow.end.TanksEndUpdate;
import dev.tankpillow.end.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

	public static final CreativeModeTab END_UPDATE_ITEMS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
			TanksEndUpdate.id("items"),
			FabricCreativeModeTab.builder()
			.icon(() -> new ItemStack(ModItems.UMBRAL_SHARD))
			.title(Component.translatable("creativemodetab.tanks-end-update.items"))
			.displayItems((_, output) -> {
				output.accept(ModItems.UMBRAL_SHARD);
			}).build());

	public static final CreativeModeTab END_UPDATE_BLOCKS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
			TanksEndUpdate.id("blocks"),
			FabricCreativeModeTab.builder()
			.icon(() -> new ItemStack(ModItems.UMBRAL_SHARD))
			.title(Component.translatable("creativemodetab.tanks-end-update.blocks"))
			.displayItems((_, output) -> {
				output.accept(ModItems.UMBRAL_SHARD);
			}).build());
	
	public static void register() {
		TanksEndUpdate.LOGGER.info("Registering Mod Creative Mode Tabs for " + TanksEndUpdate.MOD_ID);
	}
	
}
