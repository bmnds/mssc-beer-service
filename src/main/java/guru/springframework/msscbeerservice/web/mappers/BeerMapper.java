package guru.springframework.msscbeerservice.web.mappers;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

import guru.sfg.brewery.model.BeerDto;
import guru.springframework.msscbeerservice.domain.Beer;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {

	// @Mapping(source = "quantityToBrew", target = "quantityOnHand")
	BeerDto beerToBeerDto(Beer beer);

	// @Mapping(source = "quantityOnHand", target = "quantityToBrew")
	Beer beerDtoToBeer(BeerDto dto);

	BeerDto beerToBeerDtoWithInventory(Beer beer);

}
