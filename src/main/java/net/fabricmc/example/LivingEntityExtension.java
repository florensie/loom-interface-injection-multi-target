package net.fabricmc.example;

public interface LivingEntityExtension {
    default void doTheThing() {
        throw new IllegalStateException();
    }
}
