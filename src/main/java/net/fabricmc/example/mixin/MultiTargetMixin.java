package net.fabricmc.example.mixin;

import net.fabricmc.example.ExampleMod;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({LivingEntity.class, PlayerEntity.class})
public class MultiTargetMixin {

    /**
     * Targets {@link LivingEntity#applyDamage(DamageSource, float)} and {@link PlayerEntity#applyDamage(DamageSource, float)}
     */
    @Inject(method = "applyDamage", at = @At("HEAD"))
    private void onEntityHurt(CallbackInfo info) {
        ExampleMod.LOGGER.info("oof ouch owie");
    }
}
