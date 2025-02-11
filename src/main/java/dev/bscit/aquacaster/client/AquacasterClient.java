package dev.bscit.aquacaster.client;

import org.jetbrains.annotations.Nullable;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

import dev.bscit.aquacaster.Aquacaster;
import dev.bscit.aquacaster.compat.AquacasterConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;

public class AquacasterClient implements ClientModInitializer
{
    @Nullable
    public static ConfigHolder<AquacasterConfig> CONFIG_HOLDER = null;

    public static AquacasterConfig getConfig()
    {
        if(CONFIG_HOLDER == null)
            return null;

        return CONFIG_HOLDER.getConfig();
    }

    @Override
    public void onInitializeClient(ModContainer mod) {
        CONFIG_HOLDER = AutoConfig.register(AquacasterConfig.class, JanksonConfigSerializer::new);

        Aquacaster.LOGGER.info("Initialized {} client!", mod.metadata().name());
    }
}
