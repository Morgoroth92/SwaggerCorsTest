package com.example.EsercizioLezione;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(path = "/v1")
public class AutoController {

    ArrayList<Auto> allCars = new ArrayList<>();


    @Operation(
            description = "deliver the list of all cars inside the database",
            tags = {"get, All Cars"})
    @ApiResponse(responseCode = "200", description = "operation succesfully done")
    @ApiResponse(responseCode = "400", description = "invalid operation")
    @ApiResponse(responseCode = "404", description = "")
    @GetMapping(path = "/cars/all")
    public ArrayList<Auto> getAll() {
        return allCars;
    }

    @Operation(
            description = "allows to add a Car to the list of Cars",
            summary = "adds a car to the list",
            tags = {"post", "addCar"})
    @ApiResponse(responseCode = "200", description = "operation done")
    @ApiResponse(responseCode = "400", description = "invalid JSON Format")
    @ApiResponse(responseCode = "404", description = "not found")
    @PostMapping(path = "/cars/add")
    public void addCar(@RequestBody Auto auto) {
        allCars.add(auto);
    }

    @Operation(
            description = "allows to add multiple Cars to the list of Cars",
            summary = "adds multiple cars to the list",
            tags = {"post", "addCar"})
    @ApiResponse(responseCode = "200", description = "operation done")
    @ApiResponse(responseCode = "400", description = "invalid JSON Format")
    @ApiResponse(responseCode = "404", description = "not found")
    @PostMapping(path = "/cars/addMany")
    public void addManyCars(@RequestBody List<Auto> list) {
        for (int i = 0; i < list.size(); i++) {
            allCars.add(list.get(i));
        }
    }

    @Operation(
            description = "allows to add multiple Cars to the list of Cars",
            summary = "adds multiple cars to the list",
            tags = {"post", "addCar"})
    @ApiResponse(responseCode = "200", description = "operation done")
    @ApiResponse(responseCode = "400", description = "invalid JSON Format")
    @ApiResponse(responseCode = "404", description = "not found")
    @PostMapping(path = "/cars/addManyV2")
    public void addManyCarsV2(@RequestBody List<Auto> list2) {
        for (Auto a : list2) {
            allCars.add(a);
        }

        /**  il JSON DA PASSARE che contiene un array []
         * [
         *     {
         * "modello": "Punto",
         * "marca" : "Fiat",
         * "cilindrata" : 1200,
         * "numeroPorte" : 5
         * },
         * {
         * "modello": "Polo",
         * "marca" : "Volkswagen",
         * "cilindrata" : 1400,
         * "numeroPorte" : 3
         * }
         * ]
         */
    }

    @Operation(
            description = "allows to search a car into the list of Cars by model",
            summary = "filter list of cars by request model",
            tags = {"get", "searchByModel"})
    @ApiResponse(responseCode = "200", description = "operation done")
    @ApiResponse(responseCode = "400", description = "invalid model inserted")
    @ApiResponse(responseCode = "404", description = "not found")
    @GetMapping(path = "/searchModel")
    public List<Auto> searchByModel(@RequestParam String modello) {
        List<Auto> listeModello = new ArrayList<>();
        for (Auto a : allCars) {
            if (a.getModello().equalsIgnoreCase(modello)) {
                listeModello.add(a);
            }
        }
        return listeModello;
    }
}
