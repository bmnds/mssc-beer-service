package guru.sfg.brewery.model.events;

import guru.sfg.brewery.model.BeerDto;
import lombok.NoArgsConstructor;

/**
 * Created by jt on 2019-07-21.
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {
    private static final long serialVersionUID = -5882304367170514149L;

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
