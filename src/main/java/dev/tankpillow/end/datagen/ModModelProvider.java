package dev.tankpillow.end.datagen;

import dev.tankpillow.end.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {

	public ModModelProvider(FabricPackOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockModelGenerators gen) {
		
	}

	@Override
	public void generateItemModels(ItemModelGenerators gen) {
		gen.generateFlatItem(ModItems.UMBRAL_SHARD, ModelTemplates.FLAT_ITEM);
	}

	
}
