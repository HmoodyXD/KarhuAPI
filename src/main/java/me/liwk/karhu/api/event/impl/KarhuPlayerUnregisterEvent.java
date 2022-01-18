package me.liwk.karhu.api.event.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.liwk.karhu.api.event.KarhuEvent;
import org.bukkit.entity.Player;

@RequiredArgsConstructor
@Getter
public final class KarhuPlayerUnregisterEvent extends KarhuEvent {

    private final Player player;

    /**
     * Checks if the event is cancellable
     *
     * @return cancellable
     */
    @Override
    public boolean isCancellable() {
        return false;
    }

}
