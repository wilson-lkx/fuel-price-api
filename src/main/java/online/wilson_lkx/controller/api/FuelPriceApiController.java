package online.wilson_lkx.controller.api;

import online.wilson_lkx.controller.api.model.Price;
import online.wilson_lkx.model.FuelPrice;
import online.wilson_lkx.repository.FuelPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/fuel-prices")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FuelPriceApiController {

    @Autowired
    FuelPriceRepository fuelPriceRepository;

    @GetMapping()
    public ResponseEntity getAllFuelPrices(@RequestParam(required = false) Long date) {
        List<FuelPrice> fuelPrices;
        if (date != null) {
            fuelPrices = fuelPriceRepository.findVtsFuelPriceByDate(new Date(date));
        } else {
            fuelPrices = fuelPriceRepository.findAll();
        }

        List<Price> priceList = new ArrayList<>();
        for(FuelPrice fuelPrice : fuelPrices) {
            priceList.add(new Price(fuelPrice));
        }
        return new ResponseEntity(priceList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createFuelPrices(@RequestBody Price price) {
        FuelPrice vtsFuelPrice = Price.convertModel(price);
        fuelPriceRepository.saveAndFlush(vtsFuelPrice);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
