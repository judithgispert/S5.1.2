package cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.service.impl;

import cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.domain.Flower;
import cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.dto.FlowerDTO;
import cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.exceptions.FlowerNotFoundException;
import cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.repository.IFlowerRepository;
import cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.service.IFlowerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FlowerServiceImpl implements IFlowerService {
    @Autowired
    private IFlowerRepository flowerRepository;
    @Override
    public void saveFlower(FlowerDTO flowerDTO) {
        Flower flower = flowerDTOtoFLower(flowerDTO);
        flowerRepository.save(flower);
    }

    @Override
    public FlowerDTO getFlowerById(int id) {
        Optional<Flower> flower = flowerRepository.findById(id);
        if(flower.isPresent()){
            return flowertoFlowerDTO(flower.get());
        }else{
            throw new FlowerNotFoundException("The id: " + id + ", doesn't correspond to any flower.");
        }
    }

    @Override
    public List<FlowerDTO> getFlowers() {
        List<Flower> flowers = flowerRepository.findAll();
        List<FlowerDTO> flowersDTO = new ArrayList<>();
        for(Flower flower: flowers){
            flowersDTO.add(flowertoFlowerDTO(flower));
        }
        return flowersDTO;
    }

    @Override
    public FlowerDTO updateFlower(FlowerDTO flowerDTO, int id) {
        Flower newFlower = flowerDTOtoFLower(flowerDTO);
        Optional<Flower> oldFlower = flowerRepository.findById(id);
        if(oldFlower.isPresent()){
            Flower updatedFlower = oldFlower.get();
            updatedFlower.setNameFlowerDTO(newFlower.getNameFlower());
            updatedFlower.setCountryFlower(newFlower.getCountryFlower());
            flowerRepository.save(updatedFlower);
            return flowertoFlowerDTO(updatedFlower);
        } else {
            throw new FlowerNotFoundException("The id: " + id + ", doesn't correspond to any flower.");
        }
    }

    @Override
    public void deleteFlower(int id) {
        Optional<Flower> flower = flowerRepository.findById(id);
        if(flower.isPresent()){
            flowerRepository.deleteById(id);
        } else {
            throw new FlowerNotFoundException("The id: " + id + ", doesn't correspond to any flower.");
        }
    }

    private static Flower flowerDTOtoFLower(FlowerDTO flowerDTO){
        Flower flower = new Flower();
        flower.setPk_FlowerId(flower.getPk_FlowerId());
        flower.setNameFlowerDTO(flowerDTO.getNameFlowerDTO());
        flower.setCountryFlower(flowerDTO.getCountryFlowerDTO());
        return flower;
    }
    public static FlowerDTO flowertoFlowerDTO(Flower flower){
        FlowerDTO flowerDTO = new FlowerDTO();
        flowerDTO.setPk_FlowerDTOId(flower.getPk_FlowerId());
        flowerDTO.setNameFlowerDTO(flower.getNameFlower());
        flowerDTO.setCountryFlowerDTO(flower.getCountryFlower());
        flowerDTO.setTypeFlowerDTO(flowerDTO.searchType());
        return flowerDTO;
    }
}
