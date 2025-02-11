package dev.bscit.aquacaster;

import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.ReflectiveConfig;
import org.quiltmc.config.api.annotations.Comment;
import org.quiltmc.config.api.annotations.Processor;
import org.quiltmc.config.api.annotations.SerializedName;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.loader.api.config.v2.QuiltConfig;

@Processor("processConfig")
public class AquacasterConfig extends ReflectiveConfig
{
    public static final AquacasterConfig INSTANCE
        = QuiltConfig.create(Aquacaster.MOD_ID, Aquacaster.MOD_ID, AquacasterConfig.class);

    public final TrackedValue<String> message = this.value("rai minecraft :thumbsup:");

    public void processConfig(Config.Builder builder)
    {
        System.out.println("Loading config!");
		builder.format("json5");
	}

    public class TestSection extends Section
    {
        @Comment("Whether to automatically append newlines to every message printed.")
        @SerializedName("print_newlines")
        public final TrackedValue<Boolean> printNewlines = this.value(true);
    }
}
