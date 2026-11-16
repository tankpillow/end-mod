package dev.tankpillow.end;

import dev.tankpillow.end.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator.Pack;

public class TanksEndUpdateDataGenerator implements DataGeneratorEntrypoint {
	
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator gen) {
		Pack pack = gen.createPack();
		
		pack.addProvider(ModModelProvider::new);
	}
}
