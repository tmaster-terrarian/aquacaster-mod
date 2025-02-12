package dev.bscit.aquacaster.item;

import org.joml.AxisAngle4f;
import org.joml.Math;
import org.joml.Vector3f;
import org.quiltmc.loader.api.ModContainer;

import dev.bscit.aquacaster.Aquacaster;
import io.wispforest.accessories.api.components.AccessoriesDataComponents;
import io.wispforest.accessories.api.components.AccessoryItemAttributeModifiers;
import io.wispforest.accessories.api.components.AccessoryRenderTransformations;
import io.wispforest.accessories.api.components.AccessorySlotValidationComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistry
{
    public static final Item GOLDEN_HORSESHOE = new Item(new Item.Settings()
        .maxCount(1)
        .fireproof()
        .component(
            AccessoriesDataComponents.SLOT_VALIDATION,
            AccessorySlotValidationComponent.EMPTY
            .addValidSlot("shoes")
        )
        .component(
            AccessoriesDataComponents.ATTRIBUTES,
            AccessoryItemAttributeModifiers.builder()
            .addForAny(
                EntityAttributes.GENERIC_FALL_DAMAGE_MULTIPLIER,
                new EntityAttributeModifier(
                    Aquacaster.of("no_fall_damage"),
                    -1,
                    EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
                ),
                false
            ).build()
        )
        .component(
            AccessoriesDataComponents.RENDER_TRANSFORMATIONS,
            AccessoryRenderTransformations.builder()
            .translation(new Vector3f(0, -5f / 16f, 0))
            .rotation(new AxisAngle4f((float)Math.PI, 0, 1, 0))
            .rotation(new AxisAngle4f(0.5f * (float)Math.PI, 1, 0, 0))
            .scale(new Vector3f(1.1f))
            .build()
        )
    );

    public static void register(ModContainer mod)
    {
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "golden_horseshoe"), GOLDEN_HORSESHOE);
    }
}
