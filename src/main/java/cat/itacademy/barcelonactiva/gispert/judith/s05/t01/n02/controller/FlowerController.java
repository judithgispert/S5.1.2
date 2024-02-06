package cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.controller;

import cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.dto.FlowerDTO;
import cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.service.impl.FlowerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flower")
public class FlowerController {
    @Autowired
    private FlowerServiceImpl flowerService;

    @PostMapping("/addFlower")
    public ResponseEntity<String> addFruit(@RequestBody FlowerDTO flowerDTO){
        flowerService.saveFlower(flowerDTO);
        return new ResponseEntity<>("Flower created successfully.", HttpStatus.OK);
    }
    @GetMapping("/getFlower/{id}")
    public ResponseEntity<FlowerDTO> getFlowerById(@PathVariable("id") int id){
        FlowerDTO flowerDTO = flowerService.getFlowerById(id);
        if(flowerDTO != null){
            return new ResponseEntity<>(flowerDTO, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping("/getAllFlowers")
    public ResponseEntity<List<FlowerDTO>> getAllFlowers(){
        List<FlowerDTO> flowersDTO = flowerService.getFlowers();
        if(flowersDTO.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(flowersDTO, HttpStatus.OK);
    }
    @PutMapping("/updateFlower/{id}")
    public ResponseEntity<String> updateFlower(@PathVariable("id") int id, @RequestBody FlowerDTO newFlowerDTO){
        FlowerDTO flowerDTO = flowerService.updateFlower(newFlowerDTO, id);
        if(flowerDTO != null){
            return new ResponseEntity<>("Flower updated successfully.", HttpStatus.OK);
        }
        return new ResponseEntity<>("Flower not found.", HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/deleteFlower/{id}")
    public ResponseEntity<String> deleteFlower(@PathVariable("id") int id){
        flowerService.deleteFlower(id);
        return new ResponseEntity<>("Flower deleted successfully.", HttpStatus.OK);
    }
}
