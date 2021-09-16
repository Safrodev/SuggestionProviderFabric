package safro.suggestion.provider.fabric;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SuggestionProviderFabric implements ModInitializer {

	public static final Block TEST_AIR = new Block(AbstractBlock.Settings.copy(Blocks.AIR));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("suggestionproviderfix", "test_air"), TEST_AIR);
	}
}
