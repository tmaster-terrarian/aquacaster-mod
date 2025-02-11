package dev.bscit.aquacaster;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Aquacaster implements ModInitializer
{
    public static final String MOD_ID = "aquacaster";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Salutations from {}! Don't forget to drink water!", mod.metadata().name());
    }
}
