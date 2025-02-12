package dev.bscit.aquacaster;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.bscit.aquacaster.item.ItemRegistry;
import net.minecraft.util.Identifier;

public class Aquacaster implements ModInitializer
{
    public static final String MOD_ID = "aquacaster";

    public static final Logger LOGGER = LoggerFactory.getLogger("Aquacaster");

    @Override
    public void onInitialize(ModContainer mod)
    {
        LOGGER.info("Salutations from {}! Don't forget to drink water!", mod.metadata().name());

        ItemRegistry.register(mod);
    }

    public static Identifier of(String id)
    {
        return Identifier.of(MOD_ID, id);
    }
}
