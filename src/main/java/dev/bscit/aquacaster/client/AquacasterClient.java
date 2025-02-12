package dev.bscit.aquacaster.client;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

import dev.bscit.aquacaster.Aquacaster;

public class AquacasterClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient(ModContainer mod) {
        Aquacaster.LOGGER.info("{} client init !!!!!!!!!!!!!!!!!!!!!", mod.metadata().name());
    }
}
