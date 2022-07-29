package safro.suggestion.provider.fabric;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SuggestionProviderFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		// Uncommenting the below code will add suggestionproviderfix:test_air to the registry, which is useful during development to verify that SuggestionProviderFabric is working correctly.
		// ※ WARNING: This should NEVER be shipped in production!

		// Registry.register(Registry.BLOCK, new Identifier("suggestionproviderfix", "test_air"), new Block(AbstractBlock.Settings.copy(Blocks.AIR)));
	}
}
