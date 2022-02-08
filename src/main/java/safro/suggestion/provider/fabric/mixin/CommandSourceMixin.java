package safro.suggestion.provider.fabric.mixin;

import net.minecraft.command.CommandSource;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.function.Consumer;
import java.util.function.Function;

@Mixin(CommandSource.class)
public interface CommandSourceMixin {

    /**
     * @author Safro
     */
    @Overwrite
    static <T> void forEachMatching(Iterable<T> resources, String input, Function<T, Identifier> locationFunction,
                                    Consumer<T> resourceConsumer) {
        final boolean inputContainsColon = input.indexOf(58) > -1;

        for (final T resource : resources) {
            final Identifier resourceLocation = locationFunction.apply(resource);
            if (inputContainsColon) {
                final String resourceLocationString = resourceLocation.toString();

                if (CommandSource.shouldSuggest(input, resourceLocationString)) {
                    resourceConsumer.accept(resource);
                }
            } else if (CommandSource.shouldSuggest(input, resourceLocation.getNamespace()) ||
                    CommandSource.shouldSuggest(input, resourceLocation.getPath())) {
                resourceConsumer.accept(resource);
            }
        }

    }

}
