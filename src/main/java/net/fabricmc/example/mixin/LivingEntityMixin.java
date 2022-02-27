package net.fabricmc.example.mixin;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.example.LivingEntityExtension;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(LivingEntity.class)
public class LivingEntityMixin implements LivingEntityExtension {

	@Unique
	@Override
	public void doTheThing() {
		ExampleMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
