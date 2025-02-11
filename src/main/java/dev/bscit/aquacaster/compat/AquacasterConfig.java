package dev.bscit.aquacaster.compat;

import dev.bscit.aquacaster.Aquacaster;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = Aquacaster.MOD_ID)
public class AquacasterConfig implements ConfigData
{
    public ClientData clientData = new ClientData();

    public static class ClientData
    {
        @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
        @ConfigEntry.Gui.Tooltip
        public int test = 100;
    }

    @ConfigEntry.Gui.CollapsibleObject
    InnerStuff stuff = new InnerStuff();

    @ConfigEntry.Gui.Excluded
    @ConfigEntry.Gui.CollapsibleObject
    HiddenStuff invisibleStuff = new HiddenStuff();

    static class InnerStuff
    {
        int a = 0;
        int b = 1;
    }

    static class HiddenStuff
    {
        int c = 2;
        int d = 3;
    }
}
