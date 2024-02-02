package cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.service;

import cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.domain.Flower;
import cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.dto.FlowerDTO;

import java.util.List;

public interface IFlowerService {
    public void saveFlower(FlowerDTO flowerDTO);
    public FlowerDTO getFlowerById(int id);
    public List<FlowerDTO> getFlowers();
    public FlowerDTO updateFlower(FlowerDTO flowerDTO, int id);
    public void deleteFlower(int id);
}
