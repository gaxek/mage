package mage.cards.a;

import java.util.UUID;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author gaxek
 */
public final class AwakenTheSleeper extends CardImpl {

    public AwakenTheSleeper(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{3}{R}");
        

        // Gain control of target creature until end of turn. Untap that creature. It gains haste until end of turn. If it's equipped, you may destroy all Equipment attached to that creature.
    }

    private AwakenTheSleeper(final AwakenTheSleeper card) {
        super(card);
    }

    @Override
    public AwakenTheSleeper copy() {
        return new AwakenTheSleeper(this);
    }
}
