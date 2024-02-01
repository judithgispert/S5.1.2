package cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.repository;

import cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.domain.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFlowerRepository extends JpaRepository <Flower, Integer>{
}
